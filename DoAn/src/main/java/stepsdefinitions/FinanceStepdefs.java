package stepsdefinitions;

import core.AppiumBase;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.events.DebtPaymentPage;
import pages.events.FinancePage;
import pages.events.HomePage;

public class FinanceStepdefs extends AppiumBase {
    HomePage homePage = new HomePage();
    FinancePage financePage = new FinancePage();
    DebtPaymentPage debtPaymentPage = new DebtPaymentPage();
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
}
