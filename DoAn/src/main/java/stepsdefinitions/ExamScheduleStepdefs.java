package stepsdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.events.ExamSchedulePage;
import pages.events.HomePage;

public class ExamScheduleStepdefs {
    ExamSchedulePage examSchedulePage = new ExamSchedulePage();
    @Then("verify exam schedule displays")
    public void verifyExamScheduleDisplays(){
        examSchedulePage.verifyDisplays();
    }

    @And("click to exam plan")
    public void clickToExamPlan() {
        examSchedulePage.clickToExamPlan();
    }

    @Then("verify exam plan displays")
    public void verifyExamPlanDisplays() {
        examSchedulePage.verifyExamPlanDisplays();
    }

    @And("click to a subject to show detail schedule")
    public void clickToASubjectToShowDetailSchedule() {
        examSchedulePage.clickToShowDetailOfExamSchedule();
    }

    @Then("verify exam schedule of this subject displays")
    public void verifyExamScheduleOfThisSubjectDisplays() {
        examSchedulePage.verifyDetailScheduleDisplays();
    }

    @And("click to view exam schedule")
    public void clickToViewExamSchedule() {
        examSchedulePage.clickToViewExamSchedule();
    }


    @Then("verify view exam schedule displays")
    public void verifyViewExamScheduleDisplays() {
        examSchedulePage.verifyVewExamScheduleDisplays();
    }
}
