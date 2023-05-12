package pages.events;

import core.AppiumBase;
import org.testng.Assert;
import pages.elements.GraduateElement;

public class GraduatePage extends AppiumBase {
    GraduateElement graduateElement = new GraduateElement();
    public void verifyGraduateDisplays(){
        Assert.assertTrue(verifyElementDisplayed(graduateElement.attention));
        Assert.assertTrue(verifyElementDisplayed(graduateElement.recommendedInformation));
        Assert.assertTrue(verifyElementDisplayed(graduateElement.requiredOutputCertificates));
        Assert.assertTrue(verifyElementDisplayed(graduateElement.applyForGraduationConsiderationBtn));
        Assert.assertTrue(verifyElementDisplayed(graduateElement.postponementOfGraduationConsiderationBtn));
    }
}
