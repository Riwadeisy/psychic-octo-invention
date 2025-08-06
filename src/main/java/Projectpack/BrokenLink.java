package Projectpack;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class BrokenLink {
	public static void main(String[] args) {

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\sanku\\eclipse-workspace\\Selenium-May\\src\\main\\java\\Projectpack\\chromedriver.exe");
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(option);
		driver.navigate().to("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		List<WebElement> links = driver.findElements(By.tagName("link"));
		Iterator<WebElement> l = links.iterator();
		while(l.hasNext()){
			WebElement li=l.next();
			String href=li.getAttribute("href");
			if(href.isEmpty()|| href==null) {
				System.out.println("Given link is empty or null");
			}
			else {
				try {
					HttpURLConnection http=(HttpURLConnection) (new URL(href).openConnection());
					http.setRequestMethod("HEAD");
					http.connect();
					int responsecode=http.getResponseCode();
					if(responsecode==200) {
						System.out.println("Link is not a broken link"+href);
					}
					else {
						System.out.println("Link is a broken link"+href);
					}	
				}
					catch(MalformedURLException e) {
						e.printStackTrace();
					}
					catch(IOException e){
					
						e.printStackTrace();
					}
					
				}
			}
	}

}
