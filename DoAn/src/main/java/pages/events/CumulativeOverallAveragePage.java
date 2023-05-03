package pages.events;

import core.AppiumBase;
import org.testng.Assert;
import pages.elements.CumulativeOverallAverageElement;

public class CumulativeOverallAveragePage extends AppiumBase {
    CumulativeOverallAverageElement element = new CumulativeOverallAverageElement();
    public void verifyDisplays(){
        Assert.assertTrue(verifyElementDisplayed(element.totalCredits));
        Assert.assertTrue(verifyElementDisplayed(element.cumulativeOverallAverage));
        Assert.assertTrue(verifyElementDisplayed(element.rating));
        Assert.assertTrue(verifyElementDisplayed(element.attention));
        Assert.assertTrue(verifyElementDisplayed(element.listOfRequiredCourses));
        Assert.assertTrue(verifyElementDisplayed(element.listOfEquivalentCourses));
        Assert.assertTrue(verifyElementDisplayed(element.listOfElectiveCourses));
        Assert.assertTrue(verifyElementDisplayed(element.listOfCoursesWithoutCumulativeAverage));
    }
}
