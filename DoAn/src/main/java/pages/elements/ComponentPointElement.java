package pages.elements;

import org.openqa.selenium.By;

public class ComponentPointElement {
    public By courseDetail = By.xpath("(//android.view.View[@index = 0])[11]");
    public By course = By.xpath("//android.view.View[@content-desc=\"Đồ án/ khóa luận tốt nghiệp\"]");
    public By year = By.xpath("//android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]");
}
