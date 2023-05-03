package stepsdefinitions;

import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.events.SchedulePage;

public class ScheduleStepdefs {

    SchedulePage schedulePage = new SchedulePage();

    @Then("verify schedule displays")
    public void VerifyScheduleDisplays(){
        schedulePage.verifyDisplays();
    }

    @Then("verify the timeline displays correctly")
    public void verifyTheTimelineDisplaysCorrectly() {
        Assert.assertTrue(schedulePage.compareDate());
    }
}
