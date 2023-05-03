package pages.events;

import core.AppiumBase;
import org.testng.Assert;
import pages.elements.ExamScoresElement;

public class ExamScoresPage extends AppiumBase {
    ExamScoresElement examScoresElement = new ExamScoresElement();
    public void verifyDisplays(){
        Assert.assertTrue(verifyElementDisplayed(examScoresElement.year));
        Assert.assertTrue(verifyElementDisplayed(examScoresElement.courseDetail));
        Assert.assertTrue(verifyElementDisplayed(examScoresElement.chartBtn));
    }

    public void clickToChart(){
        clickToButton(examScoresElement.chartBtn);
    }
    public void verifyChartDisplays(){
        Assert.assertTrue(verifyElementDisplayed(examScoresElement.chart));
    }
}
