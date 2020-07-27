package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AuthenticationPopup {
	static WebDriver driver;
	static String username="admin";
	static String password= "admin";
	

	public static void main(String[] args) {
		// Authentication Popup- these are not JS popups
		
		WebDriverManager.chromedriver().setup();
		
		 driver= new ChromeDriver();
		 
		 //driver.get("http://the-internet.herokuapp.com/basic_auth");
		 
		 driver.get("http://admin:admin @the-internet.herokuapp.com/basic_auth");
		 
		 driver.get("http://" + username + ":" + password + "@"  + "the-internet.herokuapp.com/basic_auth");
		 
		/*
		 * Basic Auth
Congratulations! You must have the proper credentials.


		 */
		
		driver.quit();

	}

}
