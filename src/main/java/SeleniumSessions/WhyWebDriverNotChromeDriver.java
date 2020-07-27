package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WhyWebDriverNotChromeDriver {

	public static void main(String[] args) {
		
		/**
		 *  SearchContext - Interface
		 *  WebDriver - Interface extends SearchContext
		 *  RemoteWebDriver class implements WebDriver
		 *  ChromeDriver/ FirefoxDriver/SafariDriver/IEDriver/OperaDriver.... extends RemoteWebDriver class
		 *  
		 */

		WebDriverManager.chromedriver().setup();
		
		//top casting
		//WebDriver driver= new ChromeDriver();
		// what could be the reason to use TopCasting here ??
		// this is helpful for Crossbrowser Testing
		//ChromeDriver driver= new ChromeDriver();
		//FirefoxDriver driver1= new FirefoxDriver();
		//SafariDriver driver2 = new SafariDriver();
		//
		//if we do top casting and creates a reference with WebDriver it could be useful for other broswers also 
		// WebDriver (PArent Interface ) reference can refer to its child class objects- ie. chromedriver/firefoxdriver.....
		
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		
		 System.out.println(driver.getTitle());
		 
		 driver.quit();
		
}

}
