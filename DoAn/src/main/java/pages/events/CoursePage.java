package pages.events;

import core.AppiumBase;
import io.cucumber.java.bs.A;
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

    public void scrollToElectiveCourse(){
        while (!verifyElementDisplayed(courseElement.electiveCourse)){
            swipeMobileUp();
        }
    }

    public void verifyCurriculumDisplays(){
        Assert.assertTrue(verifyElementDisplayed(courseElement.outline));
        Assert.assertTrue(verifyElementDisplayed(courseElement.majors));
        Assert.assertTrue(verifyElementDisplayed(courseElement.listOfOutline));
        Assert.assertTrue(verifyElementDisplayed(courseElement.programInformation));
        Assert.assertTrue(verifyElementDisplayed(courseElement.compulsoryCourse));
        scrollToElectiveCourse();
        Assert.assertTrue(verifyElementDisplayed(courseElement.electiveCourse));
    }

    public void clickToCurriculum(){
        clickToButton(courseElement.curriculum);
    }

    public void SelectBeyondTheFrame(String value){
        selectOption(courseElement.listOfOutline,"Ngoài khung" );
    }

    public int getCompulsoryCredits(){
            String compulsoryCredits = getContentDesc(courseElement.compulsoryCredits);
            return Integer.parseInt(compulsoryCredits);
    }

    public void clickToClassInformation(){
        clickToButton(courseElement.classInformationRegistration);
    }
    public void verifyClassInforRegisSection(){
        Assert.assertTrue(verifyElementDisplayed(courseElement.sequenceOfSemester));
        Assert.assertTrue(verifyElementDisplayed(courseElement.course));
    }

}
