package pages.events;

import core.AppiumBase;
import org.testng.Assert;
import pages.elements.LoginElement;

public class LoginPage extends AppiumBase {
    LoginElement element = new LoginElement();
    public void clickToNotAllow(){
        clickToButton(element.notAllowBtn);
    }
    public void verifyLoginPage(){
        Assert.assertTrue(verifyElementDisplayed(element.banner));
        Assert.assertTrue(verifyElementDisplayed(element.username));
        Assert.assertTrue(verifyElementDisplayed(element.password));
        Assert.assertTrue(verifyElementDisplayed(element.loginBtn));
        Assert.assertTrue(verifyElementDisplayed(element.admissionBtn));
        Assert.assertTrue(verifyElementDisplayed(element.forgotPassword));
    }

    public void inputUsername(String username){
        clickToButton(element.username);
        sendKey(element.username, username);
    }

    public void inputPassword(String password){
        clickToButton(element.password);
        sendKey(element.password, password);
    }

    public void clickToLoginButton(){
        clickToButton(element.loginBtn);
    }
    public void verifyMessageDisplay(String message){
        verifyContent(element.message,message);
    }
}
