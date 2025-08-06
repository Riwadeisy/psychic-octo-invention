package Frames;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class nestedframes {
	
	public static void main (String[]args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sanku\\eclipse-workspace\\Selenium-May\\Driver\\chromedriver.exe");
		
		WebDriver driver  = new ChromeDriver();

       driver.manage().window().maximize();
       driver.get("https://the-internet.herokuapp.com/frames");
       driver.findElement(By.xpath("//a[text()='Nested Frames']")).click();
       List<WebElement> f =driver.findElements(By.tagName("frame"));
       System.out.println("Total Frames:"+" "+ f.size());
       driver.switchTo().frame(1);
       
       String BottomFrame=driver.findElement(By.tagName("body")).getText();
       System.out.println("Bottom Frame");
       WebElement bottomFrameElement = driver.findElement(By.tagName("body"));
       System.out.println("Bottom Frame: " + bottomFrameElement.getText());
       driver.switchTo().parentFrame();
      
       
       driver.switchTo().frame("frame-top");
       
       driver.switchTo().frame("frame-left");
       String LeftFrame=driver.findElement(By.tagName("body")).getText();
       
      System.out.println("LeftFrame");
      WebElement leftFrameElement = driver.findElement(By.tagName("body"));
      System.out.println("Left Frame: " + leftFrameElement.getText());
       driver.switchTo().defaultContent();
       driver.quit();
     
	}}
