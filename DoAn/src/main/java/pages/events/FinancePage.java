package pages.events;

import core.AppiumBase;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import pages.elements.FinanceElement;

public class FinancePage extends AppiumBase {
    FinanceElement financeElement = new FinanceElement();
    public void verifyFinanceDisplay(){
        Assert.assertTrue(verifyElementDisplayed(financeElement.amountInTheAccount));
        Assert.assertTrue(verifyElementDisplayed(financeElement.debtPayment));
        Assert.assertTrue(verifyElementDisplayed(financeElement.amountPaid));
        Assert.assertTrue(verifyElementDisplayed(financeElement.transactionHistory));
        Assert.assertTrue(verifyElementDisplayed(financeElement.printEinvoice));
    }
    public void clickToDebtPayment(){
        clickToButton(financeElement.debtPayment);
    }

    public void clickToTransactionHistory(){
        clickToButton(financeElement.transactionHistory);
    }

    public void clickToPrintInvoice(){
        clickToButton(financeElement.printEinvoice);
    }
}
