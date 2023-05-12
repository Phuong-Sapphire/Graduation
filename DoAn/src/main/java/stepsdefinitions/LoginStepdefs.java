package stepsdefinitions;

import core.AppiumBase;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.events.ForgotPasswordPage;
import pages.events.HomePage;
import pages.events.LoginPage;

import java.net.MalformedURLException;

public class LoginStepdefs extends AppiumBase {

    AppiumBase appiumBase = new AppiumBase();
    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();
    ForgotPasswordPage forgotPasswordPage = new ForgotPasswordPage();
    @Given("open MyHaUI application")
    public void openMyHaUIApplication() throws MalformedURLException {
        appiumBase.setup();
    }


    @Then("verify Login page displays: banner, username, password, forgotPassword, loginButton, AmissionButton")
    public void verifyLoginPageDisplaysBannerUsernamePasswordForgotPasswordLoginButtonAmissionButton() {
        loginPage.verifyLoginPage();
    }

    @When("click to not allow the notification")
    public void clickToNotAllowTheNotification() {
        loginPage.clickToNotAllow();
    }



    @And("click to login button")
    public void clickToLoginButton() {
        loginPage.clickToLoginButton();
    }

    @Then("verify homepage displays")
    public void verifyHomepageDisplays() {
        homePage.verifyHomePage();
    }


    @And("click to skip button")
    public void clickToSkipButton() {
        homePage.clickToSkipButton();
    }


    @And("input username: {string} and password: {string}")
    public void inputUsernameAndPassword(String arg0, String arg1) {
        loginPage.inputUsername(arg0);
        loginPage.inputPassword(arg1);
    }

    @Then("verify message display: {string}")
    public void verifyMessageDisplay(String arg0) {
        loginPage.verifyMessageDisplay(arg0);
    }

    @And("click to forgot password button")
    public void clickToForgotPasswordButton() {
        loginPage.clickToForgotPassword();
    }

    @Then("verify forgot password page displayed")
    public void verifyForgotPasswordPageDisplayed() {
        forgotPasswordPage.verifyForgotPasswordDisplay();
    }

    @Then("verify the message display: {string}")
    public void verifyTheMessageDisplay(String arg0) {
        homePage.verifyMessageDisplayed(arg0);
    }

    @And("click to schedule")
    public void clickToSchedule() {
        homePage.clickToSchedule();
    }

    @And("click to exam schedule")
    public void clickToExamSchedule() {
        homePage.clickToExamSchedule();
    }

    @And("click to course")
    public void clickToCourse() {
        homePage.clickToCourse();
    }

    @And("click to graduate")
    public void clickToGraduate() {
        homePage.clickToGraduate();
    }
}
