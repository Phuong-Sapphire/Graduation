package pages.elements;

import org.openqa.selenium.By;

public class ForgotPasswordElement {
    public By logo = By.xpath("//android.view.View[2]/android.widget.ImageView");
    public By nameOfUniversity = By.xpath("//android.view.View[@content-desc=\"Trường Đại học Công nghiệp Hà Nội\"]");
    public By nameOfFunction = By.xpath("//android.view.View[@content-desc=\"Chức năng khôi phục lại mật khẩu của sinh viên\"]");
    public By message = By.xpath("//android.view.View[@content-desc=\"Sinh viên phải nhập đầy đủ và chính xác các thông tin đã cập nhật trên hệ thống. Mật khẩu sẽ được gửi về số điện thoại sinh viên đăng ký nếu khôi phục thành công (bạn có thể mất phí đổi mật khẩu)! Sinh viên mất số điện thoại, vui lòng liên hệ phòng Công tác sinh viên!\"]");
    public By studentID = By.xpath("//android.view.View[2]/android.widget.EditText[1]");
    public By nameOfStudent = By.xpath("//android.view.View[2]/android.widget.EditText[2]");
    public By dateOfBirth = By.xpath("//android.view.View[2]/android.view.View[4]");
    public By placeOfBirth = By.xpath("//android.view.View[@content-desc=\"Chọn nơi sinh\"]");
    public By phoneNumber = By.xpath("//android.view.View[2]/android.widget.EditText[3]");
    public By resetPasswordBtn = By.xpath("//android.widget.Button[@content-desc=\"Khôi Phục Mật Khẩu\"]");
}
