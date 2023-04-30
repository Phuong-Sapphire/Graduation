package pages.events;

import core.AppiumBase;
import org.testng.Assert;
import pages.elements.ForgotPasswordElement;

public class ForgotPasswordPage extends AppiumBase {
    ForgotPasswordElement element = new ForgotPasswordElement();
    public void verifyForgotPasswordDisplay(){
        Assert.assertTrue(verifyElementDisplayed(element.logo));
        Assert.assertTrue(verifyElementDisplayed(element.nameOfUniversity));
        Assert.assertTrue(verifyElementDisplayed(element.nameOfFunction));
        Assert.assertTrue(verifyElementDisplayed(element.message));
        Assert.assertTrue(verifyElementDisplayed(element.studentID));
        Assert.assertTrue(verifyElementDisplayed(element.nameOfStudent));
        Assert.assertTrue(verifyElementDisplayed(element.dateOfBirth));
        Assert.assertTrue(verifyElementDisplayed(element.placeOfBirth));
        Assert.assertTrue(verifyElementDisplayed(element.phoneNumber));
        Assert.assertTrue(verifyElementDisplayed(element.resetPasswordBtn));
    }
}
