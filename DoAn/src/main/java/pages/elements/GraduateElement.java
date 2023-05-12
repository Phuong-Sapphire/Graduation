package pages.elements;

import org.openqa.selenium.By;

public class GraduateElement {
    public By attention = By.xpath("(//android.view.View[@index = 1])[2]");
    public By recommendedInformation = By.xpath("//android.view.View[@index = 3]");
    public By requiredOutputCertificates = By.xpath("//android.view.View[@index = 6]");
    public By applyForGraduationConsiderationBtn = By.xpath("//android.widget.Button[@index = 21]");
    public By postponementOfGraduationConsiderationBtn = By.xpath("//android.widget.Button[@index = 22]");
}
