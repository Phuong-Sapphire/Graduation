package pages.elements;

import org.openqa.selenium.By;

public class CumulativeOverallAverageElement {
    public By totalCredits = By.xpath("(//android.view.View[@index = 0])[6]");
    public By cumulativeOverallAverage = By.xpath("//android.view.View[@index = 2]");
    public By rating = By.xpath("//android.view.View[@index = 4]");
    public By attention = By.xpath("//android.view.View[@index = 7]");
    public By listOfRequiredCourses = By.xpath("//android.widget.Button[@index = 8]");
    public By listOfEquivalentCourses = By.xpath("//android.widget.Button[@index = 9]");
    public By listOfElectiveCourses = By.xpath("//android.widget.Button[@index = 10]");
    public By listOfCoursesWithoutCumulativeAverage = By.xpath("//android.widget.Button[@index = 11]");
}
