package pages.events;

import core.AppiumBase;
import org.testng.Assert;
import pages.elements.ReviewTheExamElement;

public class ReviewTheExamPage extends AppiumBase {
    ReviewTheExamElement element = new ReviewTheExamElement();

    public void verifyDisplays(){
        Assert.assertTrue(verifyElementDisplayed(element.attention));
        Assert.assertTrue(verifyElementDisplayed(element.listOfSemesterExams));
        Assert.assertTrue(verifyElementDisplayed(element.listOfReviewedSubjects));
    }
}
