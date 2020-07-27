package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImplicitlyWait_HubSpot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//Thread.sleep(5000); this is static wait
		
	//dynamic waits 
	// 1. Implicitly wait   -- it is Global wait and applied for WebElements only, for nonWebElements- it is not applicable ex: getTitle
		//2. Explicit wait
		       //2.a WebDriverWait
		//       2.b FluentWait
		
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.get("https://www.hubspot.com/");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		driver.findElement(By.id("username")).sendKeys("abc");
		
		driver.findElement(By.id("password")).sendKeys("abc");
		
		driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);  // nullify implicitly wait
		
		driver.quit();

		
		/*
		 * drawback : unnecessarily we are applying wait for all the elements
		 * 
		 */
	}

}
