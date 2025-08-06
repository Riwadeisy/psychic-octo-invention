package Alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alerts {
	public static void main (String[]args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sanku\\eclipse-workspace\\Selenium-May\\Driver\\chromedriver.exe");
		WebDriver driver  = new ChromeDriver();
		driver.navigate().to("https://demo.automationtesting.in/Alerts.html");

		driver.manage().window().maximize();
		
		WebElement simplealert = driver.findElement(By.cssSelector(".btn.btn-danger"));
		simplealert.click();
		Thread.sleep(3000);
		Alert A =driver.switchTo().alert();
		A.accept();
		Thread.sleep(4000);
			
	}}
		