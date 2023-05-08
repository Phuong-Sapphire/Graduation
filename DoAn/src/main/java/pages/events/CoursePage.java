package pages.events;

import core.AppiumBase;
import org.testng.Assert;
import pages.elements.CourseElement;

public class CoursePage extends AppiumBase {
    CourseElement courseElement = new CourseElement();
    public void verifyCourseDisplays(){
        Assert.assertTrue(verifyElementDisplayed(courseElement.educationProgram));
        Assert.assertTrue(verifyElementDisplayed(courseElement.classInformationRegistration));
    }

    public void clickToEducationProgram(){
        clickToButton(courseElement.educationProgram);
    }

    public void verifyEducationProgramDisplays(){
        Assert.assertTrue(verifyElementDisplayed(courseElement.educationProgramDetails));
        Assert.assertTrue(verifyElementDisplayed(courseElement.curriculum));
        Assert.assertTrue(verifyElementDisplayed(courseElement.periodicalFrame));
    }

    public void clickToEducationProgramDetails(){
        clickToButton(courseElement.educationProgramDetails);
    }

    public void verifyEducationProgramDetails(){
        Assert.assertTrue(verifyElementDisplayed(courseElement.industryDetails));
        Assert.assertTrue(verifyElementDisplayed(courseElement.trainingObjectives));
        Assert.assertTrue(verifyElementDisplayed(courseElement.CDR));
        Assert.assertTrue(verifyElementDisplayed(courseElement.facultyName));
        Assert.assertTrue(verifyElementDisplayed(courseElement.universityTraining));
        Assert.assertTrue(verifyElementDisplayed(courseElement.industryName));
        Assert.assertTrue(verifyElementDisplayed(courseElement.industryCode));
        Assert.assertTrue(verifyElementDisplayed(courseElement.trainingTime));
        Assert.assertTrue(verifyElementDisplayed(courseElement.totalVolume));
        Assert.assertTrue(verifyElementDisplayed(courseElement.typeOfEducation));
    }
}
