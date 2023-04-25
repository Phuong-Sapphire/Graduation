package pages.elements;

import org.openqa.selenium.By;

public class LoginElement {
    public By notAllowBtn = By.id("com.android.permissioncontroller:id/permission_deny_button");
    //public By acceptButton = By.xpath("//android.widget.Button[@content-desc=\"  ĐỒNG Ý  \"]");
    public By banner = By.xpath("//android.view.View/android.view.View/android.widget.ImageView[2]");
    public By username = By.xpath("//android.view.View/android.widget.EditText[1]");
    public By password = By.xpath("//android.view.View/android.widget.EditText[2]");
    public By loginBtn = By.xpath("//android.view.View[@content-desc=\"ĐĂNG NHẬP\"]");
    public By admissionBtn = By.xpath("//android.view.View[@content-desc=\"NHẬP HỌC\"]");
    public By forgotPassword = By.xpath("//android.view.View[@content-desc=\"Quên mật khẩu?\"]");
    public By message = By.xpath("//android.view.View[@content-desc=\"Sai tên đăng nhập hoặc mật khẩu\"]");
}
