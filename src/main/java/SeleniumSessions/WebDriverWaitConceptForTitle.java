package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverWaitConceptForTitle {
	static WebDriver driver;
	public static void main(String[] args) {
		
		//WebDriverWait is first type of ExplicitWait
		//we dont have any ExplicitWait class/method/iterface like ImplicitlyWait
		
		//WebDriverWait is a class
		//extedning FluentWait Class
		//Wait Interface is there
		
		WebDriverManager.chromedriver().setup();
		
		 driver= new ChromeDriver();
		
		driver.get("https://app.hubspot.com/login/");
		
		
		
		//WebDriverWait wait= new WebDriverWait(driver,10);
		//wait.until(ExpectedConditions.titleContains("HubSpot"));
		
		//wait.until(ExpectedConditions.titleIs("HubSpot Login"));
		
		//if title is not found within the timeframe we will get TimeoutException
		
		//Exception in thread "main" org.openqa.selenium.TimeoutException: 
		//Expected condition failed: waiting for title to contain "HubSpot". 
		//Current title: "HubSpot Login" (tried for 2 second(s) with 500 milliseconds interval)

//		String title= doGetPageTitleWithIsTitle(driver,20,"HubSpot Login");
//		System.out.println(title);
		
		
//		title= doGetPageTitleWithTitleContains(driver,20,"HubSpot");
		
//		System.out.println(title);
		//System.out.println(driver.getTitle()); // without any wait we are getting title as "Checking browser" instead of "Hubspot....."
		
		
	//	System.out.println("Current URL " + doGetPageCurrentUrl(driver,10, "hubspot"));
		
			
		
		
		driver.quit();
		
	}
	
	// let's create an untility/ generic wrapper for wait
	
	public static String doGetPageTitleWithIsTitle(WebDriver drvier,int timeout, String title)
	{
		
		WebDriverWait wait= new WebDriverWait(driver, timeout);
		wait.until(ExpectedConditions.titleIs(title));
		
		return driver.getTitle();
		
	}
	
	public static String doGetPageTitleWithTitleContains(WebDriver driver,int timeout, String title)
	{
		WebDriverWait wait= new WebDriverWait(driver,timeout);
		
		wait.until(ExpectedConditions.titleContains(title));
		
		return driver.getTitle();
		
	}
	
	
	public static String doGetPageCurrentUrl(WebDriver driver, int timeout,String urlValue) {
		
		WebDriverWait wait= new WebDriverWait(driver,timeout);
		wait.until(ExpectedConditions.urlContains(urlValue));
		
		return driver.getCurrentUrl();
		
		
	}
	
	
	
	

}
