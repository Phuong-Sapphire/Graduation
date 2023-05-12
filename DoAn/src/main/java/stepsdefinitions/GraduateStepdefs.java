package stepsdefinitions;

import core.AppiumBase;
import io.cucumber.java.en.Then;
import pages.events.GraduatePage;

public class GraduateStepdefs extends AppiumBase {
    GraduatePage graduatePage = new GraduatePage();
    @Then("verify graduate displays")
    public void verifyGraduateDisplays(){
        graduatePage.verifyGraduateDisplays();
    }
}
