package pages.events;

import core.AppiumBase;
import org.testng.Assert;
import pages.elements.HomeElement;

public class HomePage extends AppiumBase {
    HomeElement homeElement = new HomeElement();
    public void clickToSkipButton(){
        clickToButton(homeElement.skipBtn);
    }
    public void verifyHomePage(){
        Assert.assertTrue(verifyElementDisplayed(homeElement.message));
        Assert.assertTrue(verifyElementDisplayed(homeElement.finance));
        Assert.assertTrue(verifyElementDisplayed(homeElement.learningResult));
        Assert.assertTrue(verifyElementDisplayed(homeElement.schedule));
        Assert.assertTrue(verifyElementDisplayed(homeElement.examSchedule));
        Assert.assertTrue(verifyElementDisplayed(homeElement.course));
        Assert.assertTrue(verifyElementDisplayed(homeElement.graduate));
        Assert.assertTrue(verifyElementDisplayed(homeElement.oneStopService));
        Assert.assertTrue(verifyElementDisplayed(homeElement.trainingAssessment));
        Assert.assertTrue(verifyElementDisplayed(homeElement.q_a));
        Assert.assertTrue(verifyElementDisplayed(homeElement.survey));
        Assert.assertTrue(verifyElementDisplayed(homeElement.homeIcon));
        Assert.assertTrue(verifyElementDisplayed(homeElement.courseRegistration));
        Assert.assertTrue(verifyElementDisplayed(homeElement.society));
        Assert.assertTrue(verifyElementDisplayed(homeElement.setting));
        Assert.assertTrue(verifyElementDisplayed(homeElement.profile));
    }
    public void verifyMessageDisplayed(String message){
        verifyContent(homeElement.message, message);
    }
    public void clickToFinance(){
        clickToButton(homeElement.finance);
    }
}
