package ActionsKeyandmouse;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class DropdownAutomation {
    public static void main(String[] args) throws InterruptedException, AWTException, IOException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\sanku\\eclipse-workspace\\Selenium-May\\Driver\\chromedriver.exe");

        ChromeOptions op = new ChromeOptions();
        op.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(op);

        driver.get("https://practice.expandtesting.com/dropdown");
        driver.manage().window().maximize();

        // Select value from first dropdown
        WebElement optionBtn = driver.findElement(By.xpath("//select[@id='dropdown']"));
        Select s = new Select(optionBtn);
        s.selectByValue("2");

        Thread.sleep(2000);

        // Select by index from number dropdown
        WebElement numberDropdown = driver.findElement(By.xpath("(//select[@class='form-control'])[1]"));
        Select s1 = new Select(numberDropdown);
        s1.selectByIndex(3); // Removed leading zero

        Thread.sleep(2000);

        // Select by visible text from country dropdown
        WebElement countryBtn = driver.findElement(By.id("country"));
        Select s2 = new Select(countryBtn);
        s2.selectByVisibleText("India");

        // Check if number dropdown allows multiple selections
        boolean isMultiple = s1.isMultiple();
        System.out.println("Is dropdown multi-selectable? " + isMultiple);

        Thread.sleep(1000);
        driver.quit();
    }
}
