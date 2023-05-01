package pages.elements;

import org.openqa.selenium.By;

public class TransactionHistoryElement {
    public By startDay = By.xpath("//android.view.View/android.view.View/android.widget.EditText[1]");
    public By endDay = By.xpath("//android.view.View/android.view.View/android.widget.EditText[2]");
    public By filterData = By.xpath("//android.widget.Button[@index = 3]");
    public By detailInformation = By.xpath("(//android.view.View[@index = 4])[1]");
    public By firstItem = By.xpath("(//android.view.View[@index = 0])[7]");
    public By lastItem = By.xpath("(//android.view.View[@index = 4])[2]");
}
