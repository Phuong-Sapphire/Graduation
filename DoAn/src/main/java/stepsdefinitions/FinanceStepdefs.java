package stepsdefinitions;

import core.AppiumBase;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.events.*;

public class FinanceStepdefs extends AppiumBase {
    HomePage homePage = new HomePage();
    FinancePage financePage = new FinancePage();
    DebtPaymentPage debtPaymentPage = new DebtPaymentPage();
    TransactionHistoryEvents transactionHistoryEvents = new TransactionHistoryEvents();
    PrintEinvoicePage printEinvoicePage = new PrintEinvoicePage();
    @And("click to finance")
    public void clickToFinance(){
        homePage.clickToFinance();
    }


    @Then("verify finance page displays")
    public void verifyFinancePageDisplays() {
        financePage.verifyFinanceDisplay();
    }

    @And("click to debt payment")
    public void clickToDebtPayment() {
        financePage.clickToDebtPayment();
    }

    @Then("verify debt payment displays")
    public void verifyDebtPaymentDisplays() {
        debtPaymentPage.verifyDebtPaymentDisplay();
    }

    @Then("verify actual debt and total debt is the same")
    public void verifyActualDebtAndTotalDebtIsTheSame() {
        debtPaymentPage.compareActualDebtAndTotalDebt();
    }

    @Then("verify actual amount to be paid and amount to be paid is the same")
    public void verifyActualAmountToBePaidAndAmountToBePaidIsTheSame() {
        debtPaymentPage.compareAmountToBePaid();
    }

//    @And("click payments to be mde")
//    public void clickPaymentsToBeMode() {
//        debtPaymentPage.clickToPaymentToBeMode();
//    }


    @And("click payments to be mode")
    public void clickPaymentsToBeMode() {
        debtPaymentPage.clickToPaymentToBeMode();
    }

    @And("click to select payment details")
    public void clickToSelectPaymentDetails() throws InterruptedException {
        Thread.sleep(100);
        debtPaymentPage.clickToPaymentDetail();
    }

    @And("click to make payment")
    public void clickToMakePayment() throws InterruptedException {
        Thread.sleep(100);
        debtPaymentPage.clickToMakePayment();
    }

    @And("click to accept payment")
    public void clickToAcceptPayment() {
        debtPaymentPage.clickToAcceptPayment();
    }

    @Then("verify the error message {string}")
    public void verifyTheErrorMessage(String arg0) {
        debtPaymentPage.verifyErrorMessage(arg0);
    }

    @And("click to transaction history")
    public void clickToTransactionHistory() {
        financePage.clickToTransactionHistory();
    }

    @Then("verify transaction history displays")
    public void verifyTransactionHistoryDisplays() {
        transactionHistoryEvents.verifyTransactionHistoryDisplays();
    }

    @Then("verify the into money displays is correctly")
    public void verifyTheIntoMoneyDisplaysIsCorrectly() {
        debtPaymentPage.verifyIntoMoney();
    }

    @And("click to print e-invoice")
    public void clickToPrintEInvoice() {
        financePage.clickToPrintInvoice();
    }

    @Then("verify this page displays")
    public void verifyThisPageDisplays() {
        printEinvoicePage.verifyDisplay();
    }
}
