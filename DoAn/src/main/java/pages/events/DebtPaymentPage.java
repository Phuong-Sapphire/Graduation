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
    double creditCoefficient;
    double unitPrice;
    double intoMoney;
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
    public void clickToPaymentToBeMode(){
        clickToButton(debtPaymentElement.paymentsToBeMode);
    }

    public void clickToPaymentDetail(){
        clickToButton(debtPaymentElement.paymentDetail);
    }

    public void clickToMakePayment(){
        clickToButton(debtPaymentElement.makePayment);
    }

    public void clickToAcceptPayment(){
        clickToButton(debtPaymentElement.payment);
    }

    public void verifyErrorMessage(String value){
        verifyContent(debtPaymentElement.notification, value);
    }

    public void getDataPaymentDetail(){
        String contentOfPaymentDetail = getContentDesc(debtPaymentElement.paymentDetail);
        System.out.println(contentOfPaymentDetail);
        contentOfPaymentDetail = contentOfPaymentDetail.replaceAll("[^0-9,\\.]", ",");
        System.out.println(contentOfPaymentDetail);
        contentOfPaymentDetail = contentOfPaymentDetail.replaceAll(",", " ");
        contentOfPaymentDetail = contentOfPaymentDetail.replaceAll("\\s+"," ");
        contentOfPaymentDetail = contentOfPaymentDetail.trim();
        String[] str = contentOfPaymentDetail.split(" ");
        for(int i = 0; i< str.length; i++){
            str[i] = str[i].replace(".", "");
            System.out.println(str[i]);
        }
        System.out.println(str.length);
        for(int i = 0; i< str.length; i++){
            if(i == 3){
                creditCoefficient = Integer.parseInt(str[i]);
                System.out.println("creditCoefficient: " + creditCoefficient);
            }else if(i == 4){
                unitPrice = Integer.parseInt(str[i]);
                System.out.println("unitPrice: " + unitPrice);
            }else if(i == 5){
                intoMoney = Integer.parseInt(str[i]);
                System.out.println("intoMoney:  " + intoMoney);
            }

        }
    }

    public void verifyIntoMoney(){
        getDataPaymentDetail();
        creditCoefficient /= 10;
        Double actualIntoMoney = (creditCoefficient * unitPrice);
        System.out.println(actualIntoMoney);
        Assert.assertEquals(actualIntoMoney, intoMoney);
    }



}
