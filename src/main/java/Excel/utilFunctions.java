package Excel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class utilFunctions {
    public static WebDriver driver;

    public static void launch() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\sanku\\eclipse-workspace\\Selenium-May\\Driver\\chromedriver.exe");
        driver = new ChromeDriver(); // Fixed: Removed local declaration
    }

    public static void URL(String url) {
        driver.get(url);
    }

    public static void maximize() {
        driver.manage().window().maximize();
    }

    public static String getCurrentURL() {
        return driver.getCurrentUrl();
    }

    public static void type(WebElement element, String value) {
        element.sendKeys(value);
    }

    public static void buttonClick(WebElement element) {
        element.click();
    }

    public static void closeBrowser() {
        driver.quit();
    }

    public static void rightClick(WebElement elem) {
        Actions a = new Actions(driver);
        a.contextClick(elem).perform();
    }
}
