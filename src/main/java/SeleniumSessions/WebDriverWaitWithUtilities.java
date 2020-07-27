package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverWaitWithUtilities {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		ElementUtil ele= new ElementUtil(driver);
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		By login= By.id("login1");
		By password=By.id("password");
		By loginButton= By.name("proceed");
		
		System.out.println(ele.doGetPageCurrentUrl(10, "login"));
		
		ele.clickWhenReady(loginButton, 10);
		System.out.println(ele.waitForAlertPresent(20).getText());
		
	}

}
