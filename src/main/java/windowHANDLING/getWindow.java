package windowHANDLING;

import java.util.Set;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class getWindow {
	public static void main (String[]args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sanku\\eclipse-workspace\\Selenium-May\\Driver\\chromedriver.exe");
		
		WebDriver driver  = new ChromeDriver();
		String Url="https://www.flipkart.com/";
		
		driver.get(Url);
		
		String CurrentURL= driver.getCurrentUrl();
		System.out.println( CurrentURL);
		
		String Title = driver.getTitle();
		System.out.println( Title);
		
		WebElement Search =driver.findElement(By.name("q"));
		Search.sendKeys("microsoft laptop");
		
		WebElement Click = driver.findElement(By.cssSelector("button[type='submit']"));
		Click.click();
		 
		WebElement List1 = driver.findElement(By.className("KzDlHZ"));
	    List1.click();
	   
		String Pwindow=driver.getWindowHandle();
		System.out.println(Pwindow);
		
		Set<String>CWindow=driver.getWindowHandles();
		System.out.println(CWindow);
		
	
		for(String window:CWindow)
		
			if(!Pwindow.equals(window)) {
				driver.switchTo().window(window);
			}
		driver.findElement(By.xpath("//span[text()='OGrnIL']")).click();
	}}