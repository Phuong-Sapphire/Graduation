package pages.events;

import core.AppiumBase;
import org.testng.Assert;
import pages.elements.PrintEinvoiceElement;

public class PrintEinvoicePage extends AppiumBase {
    PrintEinvoiceElement element = new PrintEinvoiceElement();
    public void verifyDisplay(){
        Assert.assertTrue(verifyElementDisplayed(element.invoice));
    }
}
