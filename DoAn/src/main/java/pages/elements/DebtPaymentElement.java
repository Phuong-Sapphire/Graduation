package pages.elements;

import org.openqa.selenium.By;

public class DebtPaymentElement {
    public By paymentsToBeMode = By.xpath("//android.widget.Button[@content-desc=\"Các khoản cần thanh toán\"]");
    public By attention = By.xpath("(//android.view.View[@index = 0])[6]");
    public By amountToBePaid  = By.xpath("(//android.view.View[@index = 1])[3]");
    public By paymentDetail = By.xpath("(//android.view.View[@index = 0])[7]");
    public By makePayment = By.xpath("//android.view.View[@index=2]");
    public By payment = By.xpath("//android.widget.Button[@index = 3]");
    public By notification = By.xpath("(//android.view.View[@index = 1])[1]");
}
