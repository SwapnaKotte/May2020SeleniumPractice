package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HeadlessBrowser {
	//String expectedTitle="Free Human Resource Management Software | 30 Day Trial Creation";
	
	
	public static void main(String[] args) {
		
		//Headless Browser is
		// no browser
		// testing is happening behind scene
		// it is slightly fast
		//headed mode - with browser 
		
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions co= new ChromeOptions();
		co.addArguments("--headless");
		
		WebDriver driver = new ChromeDriver(co);

//		WebDriverManager.firefoxdriver().setup();
//		FirefoxOptions fo=new FirefoxOptions();
//		fo.addArguments("--headless");		
//		WebDriver driver=new FirefoxDriver(fo);

		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		
		System.out.println(driver.getTitle());
		
			
		driver.quit();
		

	}

}
