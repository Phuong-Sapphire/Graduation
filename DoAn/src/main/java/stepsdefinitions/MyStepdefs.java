package stepsdefinitions;

import core.AppiumBase;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.events.HomePage;
import pages.events.LoginPage;

import java.net.MalformedURLException;

public class MyStepdefs extends AppiumBase {

    AppiumBase appiumBase = new AppiumBase();
    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();
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
}
