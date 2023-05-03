package pages.elements;

import org.openqa.selenium.By;

public class ExamScoresElement {
    public By year = By.xpath("(//android.view.View[@index  = 1])[2]");
    public By courseDetail = By.xpath("(//android.view.View[@index  = 0])[11]");
    public By chartBtn = By.xpath("//android.widget.Switch");
    public By chart = By.xpath("(//android.view.View[@index  =1])[2]");
}
