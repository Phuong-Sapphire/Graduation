package pages.elements;

import org.openqa.selenium.By;

public class DebtPaymentElement {
    public By paymentsToBeMode = By.xpath("//android.widget.Button[@content-desc=\"Các khoản cần thanh toán\"]");
    public By attention = By.xpath("(//android.view.View[@index = 0])[6]");
    public By amountToBePaid  = By.xpath("(//android.view.View[@index = 1])[3]");
}
