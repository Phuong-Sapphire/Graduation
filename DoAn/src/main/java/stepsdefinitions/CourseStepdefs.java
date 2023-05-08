package stepsdefinitions;

import core.AppiumBase;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.events.CoursePage;
import pages.events.HomePage;

public class CourseStepdefs extends AppiumBase {

    CoursePage coursePage = new CoursePage();
    @Then("verify course displays")
    public void verifyCourseDisplays(){
        coursePage.verifyCourseDisplays();
    }

    @And("click to education program")
    public void clickToEducationProgram() {
        coursePage.clickToEducationProgram();
    }

    @Then("verify education program displays")
    public void verifyEducationProgramDisplays() {
        coursePage.verifyEducationProgramDisplays();
    }

    @And("click to education program details")
    public void clickToEducationProgramDetails() {
        coursePage.clickToEducationProgramDetails();
    }


    @Then("verify education program details displays")
    public void verifyEducationProgramDetailsDisplays() {
        coursePage.verifyEducationProgramDetails();
    }
}
