package pages.elements;

import org.openqa.selenium.By;

public class ScheduleElement {
    public By interval = By.xpath("(//android.view.View[@index  = 3])[2]");
    public By subjectTimeline = By.xpath("(//android.view.View[@index  = 1])[2]");
    public By startDate = By.xpath("(//android.view.View[@index  = 1])[3]");
    public By endDate = By.xpath("//android.view.View[@index  = 29]");
}
