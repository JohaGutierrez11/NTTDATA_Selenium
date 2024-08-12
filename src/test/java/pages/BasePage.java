package pages;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class BasePage {

    protected static WebDriver driver;
    WebDriverWait wait;

    static {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    public BasePage() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    }

    public static WebDriver getDriver() {
        if (driver == null) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }
        return driver;
    }

    public static void navigateTo(String url) {
        driver.get(url);
    }

    public static void closeBrowser() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }

    private WebElement findID(String locator) {
        return wait.until(ExpectedConditions.presenceOfElementLocated(By.id(locator)));
    }

    private WebElement findClassName(String locator) {
        return wait.until(ExpectedConditions.presenceOfElementLocated(By.className(locator)));
    }

    public void clickElement(String locator) {
        findID(locator).click();
    }

    public void clickElementName(String locator) {
        findClassName(locator).click();
    }

    public void write(String locator, String keysToSend) {
        findID(locator).clear();
        findID(locator).sendKeys(keysToSend);
    }

    public void takeScreenshot(String filePath) {
        try {
            TakesScreenshot screenshot = (TakesScreenshot) driver;
            File srcFile = screenshot.getScreenshotAs(OutputType.FILE);
            File destFile = new File(filePath);
            FileUtils.copyFile(srcFile, destFile);

            System.out.println("Captura de pantalla guardada en: " + destFile.getAbsolutePath());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Boolean verifyMessage(String locator, String expectedMessage) {
        String actualMessage = driver.findElement(By.cssSelector(locator)).getText();
        return actualMessage.equals(expectedMessage);
    }
}
