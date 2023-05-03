package pages.elements;

import org.openqa.selenium.By;

public class SemesterAverageElement {
    public By totalCredits = By.xpath("(//android.view.View[@index = 1])[2]");
    public By cumulativeOverallScore = By.xpath("(//android.view.View[@index = 3])[1]");
    public By rating = By.xpath("(//android.view.View[@index = 5])[1]");
    public By chartBtn = By.xpath("//android.widget.Switch");
    public By semesters = By.xpath("//android.view.View[@index = 8]");
    public By chart = By.xpath("//android.view.View[@index = 9]");
}
