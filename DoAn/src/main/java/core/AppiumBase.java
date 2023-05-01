package core;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.concurrent.TimeUnit;

import static io.appium.java_client.remote.MobileCapabilityType.APP;

public class AppiumBase {
    public static AndroidDriver driver;
    public static WebDriverWait wait;


    public void setup() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "emulator-5554");
        capabilities.setCapability("platformVersion", "13.0");
        capabilities.setCapability("platformName", "android");
//        capabilities.setCapability(APP, System.getProperty("user.dir")+ "/src/MyHaUI_3.0.25_Apkpure.apk");
//        capabilities.setCapability("app", "F:\\Graduation\\DoAn\\src\\MyHaUI_3.0.25_Apkpure.apk");
        capabilities.setCapability("appPackage", "com.dhcn.MyHAUI");
        capabilities.setCapability("appActivity", "com.example.my_haui_plus.MainActivity");
//
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        wait = new WebDriverWait(driver, 60);
    }
//10k nhe
    public void tearDown() {
        driver.quit();
    }

    public WebElement getWebElement(By by) {
        return driver.findElement(by);
    }

    public void clickToButton(By by) {
        WebElement element1 = wait.until(ExpectedConditions.elementToBeClickable(by));
        element1.click();
    }

    public void sendKey(By by, String value) {
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(by));
        element.clear();
        element.sendKeys(value);
    }

    public void verifyEquals(By by, String value) {
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(by));
        Assert.assertEquals(element.getText(), value);
    }
    public void verifyContent(By by, String value){
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(by));
        Assert.assertEquals(element.getAttribute("content-desc"), value);
    }

    public String getContentDesc(By by){
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(by));
        return element.getAttribute("content-desc");
    }

    public String getText(By by){
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(by));
        return element.getText();
    }
    public boolean verifyElementDisplayed(By by) {
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        if (element.isDisplayed()) {
            return true;
        } else {
            return false;
        }
    }

    public void waitElementClickAble(By by) {
        wait.until(ExpectedConditions.elementToBeClickable(by));
    }

    public void tabToButton(By by) {
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(by));
        TouchAction touchAction = new TouchAction(driver);
        touchAction.tap(TapOptions.tapOptions().withElement(ElementOption.element(element))).perform();
    }

    public void takeScreenShotElement(By by, String fileName) {
        // Get screenshot of element only
        File file = getWebElement(by).getScreenshotAs(
                OutputType.FILE);
        File destFile = new File("src/test/resources/" + fileName + ".png");
        try {
            Files.copy(file.toPath(), destFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void takeScreenShot(String fileName) {
        // Get screenshot of all page
        File file = driver.getScreenshotAs(OutputType.FILE);
        File destFile = new File("src/main/resources/" + fileName + ".png");
        try {
            Files.copy(file.toPath(), destFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void tapByUsingCoordinates(int x, int y) {
        TouchAction action = new TouchAction(driver);
        action.tap(PointOption.point(x, y));
    }

    public void longPress(int x, int y) {
        TouchAction action = new TouchAction(driver);
        action.longPress(PointOption.point(x, y));
    }

    public void swipe(int startx, int starty, int endx, int endy) {
        new TouchAction(driver).longPress(PointOption.point(startx, starty))
                .moveTo(PointOption.point(endx, endy))
                .release().perform();
    }

    public void swipeMobileUp() {
        Dimension size = driver.manage().window().getSize();
        int starty = (int) (size.height * 0.8);
        int endy = (int) (size.height * 0.2);
        int startx = size.width / 10;
        swipe(startx, starty, startx, endy);
    }

    public void swipeMobileDown() {
        Dimension size = driver.manage().window().getSize();
        int starty = (int) (size.height * 0.8);
        int endy = (int) (size.height * 0.2);
        int startx = size.width / 2;
        swipe(startx, endy, startx, starty);
    }

    public void rightLeftSwipe() {
        Dimension size = driver.manage().window().getSize();
        int startx = (int) (size.width * 0.90);
        int endx = (int) (size.width * 0.10);
        int starty = size.height / 2;
        swipe(startx, starty, endx, starty);
    }

    public void leftRightSwipe() {
        Dimension size = driver.manage().window().getSize();
        int startx = (int) (size.width * 0.90);
        int endx = (int) (size.width * 0.10);
        int starty = size.height / 2;
        swipe(endx, starty, startx, starty);
    }

}
