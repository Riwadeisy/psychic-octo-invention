package ActionsKeyandmouse;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import java.io.FileNotFoundException;
import java.io.IOException;
import Excel.utilFunctions;

public class keysandMouse extends utilFunctions {
	public static void main (String[]args) throws InterruptedException, AWTException, FileNotFoundException, IOException {	
		
    launch();
   Properties prop = new Properties();
   prop.load(new FileInputStream("C:\\Users\\sanku\\eclipse-workspace\\Selenium-May\\src\\main\\java\\Excel\\A.properties"));
   String A = prop.getProperty("URL");
   URL(A);	
   String currentURL = getCurrentURL();
   System.out.println(currentURL);
   String city = prop.getProperty("Banglore");
   type(driver.findElement(By.id("email")),city);
   String pass = prop.getProperty("Tuticorin");
   type(driver.findElement(By.id("pass")),pass);
   buttonClick (driver.findElement(By.xpath("//button[@type=\"submit\"]")));
  

   
   
   
		
		
		
		/*System.setProperty("webdriver.chrome.driver","C:\\Users\\sanku\\eclipse-workspace\\Selenium-May\\Driver\\chromedriver.exe");
		WebDriver driver  = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		*///Actions A =new Actions(driver);
		
		/*WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("kavitha");
		A.doubleClick(email).build().perform();
		A.contextClick(email).build().perform();  // rightclick
		WebElement password = driver.findElement(By.id("pass"));
		password.sendkeys("12345");
		A.doubleClick(password).build().perform();
		A.contextClick(password).build().perform();  // rightclick

	
		
		
		Robot R = new Robot();
		
		for(int i=0;i<3;i++) {
			R.keyPress(KeyEvent.VK_DOWN);
			R.keyRelease(KeyEvent.VK_DOWN);
		}
		
		Thread.sleep(3000);		
		R.keyPress(KeyEvent.VK_ENTER);
		R.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(5000);
		
		R.keyPress(KeyEvent.VK_TAB);
		R.keyRelease(KeyEvent.VK_TAB);
		
		Thread.sleep(3000);
		
		R.keyPress(KeyEvent.VK_CONTROL);
		R.keyPress(KeyEvent.VK_V);
		
		R.keyRelease(KeyEvent.VK_CONTROL);
	*///	R.keyRelease(KeyEvent.VK_V);

}

}
