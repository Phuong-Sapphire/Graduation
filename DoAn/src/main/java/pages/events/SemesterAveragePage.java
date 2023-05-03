package pages.events;

import core.AppiumBase;
import io.cucumber.java.bs.A;
import org.testng.Assert;
import pages.elements.SemesterAverageElement;

public class SemesterAveragePage extends AppiumBase {
    SemesterAverageElement element = new SemesterAverageElement();
    public void verifyDisplays(){
        Assert.assertTrue(verifyElementDisplayed(element.totalCredits));
        Assert.assertTrue(verifyElementDisplayed(element.cumulativeOverallScore));
        Assert.assertTrue(verifyElementDisplayed(element.rating));
        Assert.assertTrue(verifyElementDisplayed(element.semesters));
        Assert.assertTrue(verifyElementDisplayed(element.chartBtn));
    }
    public void clickToChartButton(){
        clickToButton(element.chartBtn);
    }
    public void verifyChartDisplay(){
        Assert.assertTrue(verifyElementDisplayed(element.chart));
    }
}
