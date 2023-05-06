package pages.elements;

import org.openqa.selenium.By;

public class ExamScheduleElement {
    public By examPlan = By.xpath("//android.widget.Button[@index = 1]");
    public By viewExamSchedule = By.xpath("//android.widget.Button[@index = 2]");
    public By listOfSubject = By.xpath("//android.view.View[2]/android.view.View");
    public By subject = By.xpath("//android.widget.Button[@index = 2]");
    public By examScheduleOfSubject = By.xpath("//android.view.View[2]/android.view.View");
    public By detailExamSchedule = By.xpath("(//android.view.View[@index = 0])[11]");
    public By attention = By.xpath("(//android.view.View[@index = 2])[1]");
}
