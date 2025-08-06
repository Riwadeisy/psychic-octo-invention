package com.netflix;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Launchbrowser {
	
	public static void main (String[]args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sanku\\eclipse-workspace\\Selenium-May\\Driver\\chromedriver.exe");
		
		WebDriver driver  = new ChromeDriver();
		
		driver.get("https://www.netflix.com/in/");//launch the url
		
	   String currentUrl= driver.getCurrentUrl();
	   System.out.println("CurrentUrl:"+currentUrl);
	   
	//   boolean currentUrlequals = currentUrl.equals(url);
	//   System.out.println(currentUrlequals);
	   
	   String title = driver.getTitle();
	   System.out.println("Title:"+title);
	
	   String Pwindow = driver.getWindowHandle();
	   System.out.println(Pwindow);
	   
	   Set <String> CWindow=driver.getWindowHandles();
	   System.out.println(CWindow);
	   
	   driver.close();

}
}
