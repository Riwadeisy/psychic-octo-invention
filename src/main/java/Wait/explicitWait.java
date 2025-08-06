package Wait;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class explicitWait {
public static void mAIN(String[] args) throws Exception{
	System.setProperty("webdriver.chromedriver","C:\\Users\\sanku\\eclipse-workspace\\Selenium-May\\Driver\\chromedriver.exe");
    WebDriver driver =  new ChromeDriver();
    driver.get("https://www.flipkart.com/");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.findElement(By.xpath("//button[contains(text(),'✕')]")).click();

}
}
