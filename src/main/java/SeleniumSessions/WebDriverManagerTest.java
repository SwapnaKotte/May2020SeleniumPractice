package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverManagerTest {

	

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		
		//Remove scope test from pom.xml while adding dependency
		
//	WebDriverManager.firefoxdriver().setup();
//	Webdriver driver=new FirefoxDriver();

		
	//	WebDriverManager.getInstance(SafariDriver.class).setup();
	//	WebDriver driver=new SafariDriver();
	
		
		
		driver.get("http://www.google.com");
		
		System.out.println(driver.getTitle());
		
		driver.quit();

	}

}
