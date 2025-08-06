package Frames;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class draganddroptask {
	public static void main (String[]args) {
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\sanku\\eclipse-workspace\\Selenium-May\\Driver\\chromedriver.exe");
	WebDriver driver  = new ChromeDriver();
	driver.manage().window().maximize();
     Actions A = new Actions(driver);
	driver.get("https://www.netflix.com/in/");
	
	 WebElement getstarted= driver.findElement(By.cssSelector("button[type='submit']"));
	 A.moveToElement(getstarted).perform();


}
}