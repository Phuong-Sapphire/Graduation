package pages.events;

import core.AppiumBase;
import org.testng.Assert;
import pages.elements.DebtPaymentElement;

public class DebtPaymentPage extends AppiumBase {
    DebtPaymentElement debtPaymentElement = new DebtPaymentElement();
    double  amountInTheAccount;
    double tuitionFee;
    double stationeryForExamsStillOwned;
    double totalDebt;
    double amountToBePaid;
    public void verifyDebtPaymentDisplay(){
        Assert.assertTrue(verifyElementDisplayed(debtPaymentElement.attention));
        Assert.assertTrue(verifyElementDisplayed(debtPaymentElement.amountToBePaid));
        Assert.assertTrue(verifyElementDisplayed(debtPaymentElement.paymentsToBeMode));
    }

    public void getDataOfDebtPayment(){
        String contentOfAmountToBePaid = getContentDesc(debtPaymentElement.amountToBePaid);
        contentOfAmountToBePaid = contentOfAmountToBePaid.replaceAll("[^0-9,\\.]", ",");
        System.out.println(contentOfAmountToBePaid);
        contentOfAmountToBePaid = contentOfAmountToBePaid.replaceAll(",", " ");
        contentOfAmountToBePaid = contentOfAmountToBePaid.replaceAll("\\s+"," ");
        contentOfAmountToBePaid = contentOfAmountToBePaid.trim();
        String[] str = contentOfAmountToBePaid.split(" ");
        for(int i = 0; i< str.length; i++){
            str[i] = str[i].replace(".", "");
            System.out.println(str[i]);
        }
        System.out.println(str.length);
        for(int i = 0; i< str.length; i++){
            if(i == 0){
                amountInTheAccount = Integer.parseInt(str[i]);
                System.out.println("amountInTheAccount: " + amountInTheAccount);
            }else if(i == 1){
                tuitionFee = Integer.parseInt(str[i]);
                System.out.println("tuitionFee: " + tuitionFee);
            }else if(i == 2){
                stationeryForExamsStillOwned = Integer.parseInt(str[i]);
                System.out.println("stationeryForExamsStillOwned:  " + stationeryForExamsStillOwned);
            }else if(i == 3){
                totalDebt = Integer.parseInt(str[i]);
                System.out.println("totalDebt: " + totalDebt);
            }else{
                amountToBePaid = Integer.parseInt(str[i]);
                System.out.println("amountToBePaid: " + amountToBePaid);
            }

        }

    }

    public void compareActualDebtAndTotalDebt(){
        getDataOfDebtPayment();
        double actualDebt = tuitionFee + stationeryForExamsStillOwned;
        Assert.assertEquals(actualDebt, totalDebt);
    }

    public void compareAmountToBePaid(){
        getDataOfDebtPayment();
        Double actualAmountToBePaid = Math.abs(amountInTheAccount - totalDebt);
        Assert.assertEquals(actualAmountToBePaid, amountToBePaid);
    }

}
