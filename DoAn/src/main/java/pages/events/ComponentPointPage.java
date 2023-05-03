package pages.events;

import core.AppiumBase;
import org.testng.Assert;
import pages.elements.ComponentPointElement;

public class ComponentPointPage extends AppiumBase {
    ComponentPointElement componentPointElement = new ComponentPointElement();
    public void verifyDisplay(){
        Assert.assertTrue(verifyElementDisplayed(componentPointElement.year));
        Assert.assertTrue(verifyElementDisplayed(componentPointElement.courseDetail));
    }
}
