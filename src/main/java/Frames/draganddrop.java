package Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class draganddrop {
	public static void main (String[]args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sanku\\eclipse-workspace\\Selenium-May\\Driver\\chromedriver.exe");
		WebDriver driver  = new ChromeDriver();
	driver.get("https://jqueryui.com/droppable/");
	driver.manage().window().maximize();	
	driver.switchTo().frame(0);
	
	
		WebElement source = driver.findElement(By.xpath("//p[text()='Drag me to my target']"));
	
    WebElement target = driver.findElement(By.xpath("//p[text()='Drop here']"));
	Actions A = new Actions(driver);
	
	A.dragAndDrop(source, target).perform();	
	driver.get("https://www.flipkart.com/");
	WebElement login = driver.findElement(By.xpath("//span[text()='login']"));
	A.moveToElement(login).perform();

}}
