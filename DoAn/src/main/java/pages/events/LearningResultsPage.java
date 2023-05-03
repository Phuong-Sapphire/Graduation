package pages.events;

import core.AppiumBase;
import org.testng.Assert;
import pages.elements.LearningResultsElement;

public class LearningResultsPage extends AppiumBase {
    LearningResultsElement element = new LearningResultsElement();
    public void verifyDisplay(){
        Assert.assertTrue(verifyElementDisplayed(element.componentPoint));
        Assert.assertTrue(verifyElementDisplayed(element.examScores));
        Assert.assertTrue(verifyElementDisplayed(element.reviewTheExam));
        Assert.assertTrue(verifyElementDisplayed(element.semesterAverage));
        Assert.assertTrue(verifyElementDisplayed(element.cumulativeOverallAverage));
    }

    public void clickToComponentPoint(){
        clickToButton(element.componentPoint);
    }

    public void clickToExamScore(){
        clickToButton(element.examScores);
    }

    public void clickToReviewTheExam(){
        clickToButton(element.reviewTheExam);
    }

    public void clickToSemesterAverage(){
        clickToButton(element.semesterAverage);
    }

    public void clickToCumulativeOverallAverage(){
        clickToButton(element.cumulativeOverallAverage);
    }

}
