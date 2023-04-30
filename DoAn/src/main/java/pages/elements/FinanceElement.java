package pages.elements;

import org.openqa.selenium.By;

public class FinanceElement {
    public By amountInTheAccount = By.xpath("//android.widget.Button[@content-desc=\"Số tiền trong tài khoản\n" +
            "0 đ\n" +
            "Số tiền còn nợ\n" +
            "5.130.000 đ\n" +
            "Nạp tiền vào tài khoản\"]");
//    public By outstandingAmount = By.xpath("");
//    public By depositMoneyIntoAccount = By.xpath("");
    public By debtPayment = By.xpath("//android.widget.Button[@content-desc=\"Thanh toán công nợ\"]");
    public By amountPaid = By.xpath("//android.widget.Button[@content-desc=\"Những khoản đã thanh toán\"]");
    public By transactionHistory = By.xpath("//android.widget.Button[@content-desc=\"Lịch sử giao dịch\"]");
    public By printEinvoice = By.xpath("//android.widget.Button[@content-desc=\"In hóa đơn điện tử\"]");
}
