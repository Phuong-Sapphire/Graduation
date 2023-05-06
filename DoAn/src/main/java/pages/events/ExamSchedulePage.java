package pages.events;

import core.AppiumBase;
import org.testng.Assert;
import pages.elements.ExamScheduleElement;

public class ExamSchedulePage extends AppiumBase {
    ExamScheduleElement examScheduleElement = new ExamScheduleElement();
    public void verifyDisplays(){
        Assert.assertTrue(verifyElementDisplayed(examScheduleElement.examPlan));
        Assert.assertTrue(verifyElementDisplayed(examScheduleElement.viewExamSchedule));
    }
    public void clickToExamPlan(){
        clickToButton(examScheduleElement.examPlan);
    }
    public void verifyExamPlanDisplays(){
        Assert.assertTrue(verifyElementDisplayed(examScheduleElement.listOfSubject));
    }
    public void clickToShowDetailOfExamSchedule(){
        clickToButton(examScheduleElement.subject);
    }
    public void verifyDetailScheduleDisplays(){
        Assert.assertTrue(verifyElementDisplayed(examScheduleElement.examScheduleOfSubject));
    }
    public void clickToViewExamSchedule(){
        clickToButton(examScheduleElement.viewExamSchedule);
    }

    public void verifyVewExamScheduleDisplays(){
        Assert.assertTrue(verifyElementDisplayed(examScheduleElement.attention));
        Assert.assertTrue(verifyElementDisplayed(examScheduleElement.detailExamSchedule));
    }
}
