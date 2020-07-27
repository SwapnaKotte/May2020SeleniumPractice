package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {
	
	static String expectedTilte= "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more";
	
	//Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more


	public static void main(String[] args) throws InterruptedException {
		
		
		
		/*
		 * Exception in thread "main" org.openqa.selenium.SessionNotCreatedException: session not created: 
		 * This version of ChromeDriver only supports Chrome version 84
		 * 
		 */
		//Version 83.0.4103.61 (Official Build) (64-bit)

		
				/*
				 * Exception in thread "main" java.lang.IllegalStateException: The path to the driver executable must be set by 
				 * the webdriver.chrome.driver system property; for more information, 
				 * see https://github.com/SeleniumHQ/selenium/wiki/ChromeDriver. The latest version can be downloaded 
				 * from http://chromedriver.storage.googleapis.com/index.html


				 */
		//Windows
		//System.setProperty("webdriver.chrome.driver", "c:\\users\\downloads\\chromedriverversion\\chromedriver.exe");
		
		//this is for MAC, ubantu linux also
		System.setProperty("webdriver.chrome.driver", "/users/Surendra/Downloads/chromedriver"); // this is unix executable file
		

		WebDriver driver=new ChromeDriver();// launch browser and session id will generate when we have only new ChromeDriver()-- 
		//RHS part= actual object
		//ChromeDriver: chrome on MAC (301c4717473a519666080a89a16c1846)
		//this is the replica of actual Chrome browser
		//Chrome is being controlled by automated test software
		
       //    driver.get("www.google.com");
           
           /*
            * 
Exception in thread "main" org.openqa.selenium.InvalidArgumentException: invalid argument

            */
           
           
		//driver.get("http:\\google.com");  this statement works without issue as system automatically reconginze its wwww.
            
		driver.get("http://www.google.com");
		
		//Amazon title Amazon.com Best Sellers: The most popular items on Amazon
		
		//return type of getmethod id void in nature
		
		// WebdriverIO/ Cypress other tools
		
		System.out.println(driver.getTitle());
		
		String url=driver.getTitle();
		
		//this is verification point or check point
		
		if(url.equals("Google"))
			System.out.println("title correct");
		else
			System.out.println("title is not correct");
		
	//	driver.close(); SessionId holds here instead of null but still we cannot perform any actions by using this reference further
		
	//	driver.quit();// here Session ID/sid will become as null and cannot perform any actions by using this reference 
		
		// driver= new ChromeDriver(); // if we add this stmt even after close/quit stmt then new session id will generate and
		//we can use new sessionid for further operation
		
		
		String currentURL=driver.getCurrentUrl();
		
System.out.println(currentURL);

if(currentURL.contains("google"))
	System.out.println(currentURL + " is correct URL ");


//System.out.println(driver.getPageSource());
driver.quit();

driver= new ChromeDriver();

driver.get("http://www.amazon.com");

String actualTitle= driver.getTitle();

System.out.println(actualTitle);
if(actualTitle.equals(expectedTilte))
	System.out.println("actualTitle equals to expectedTitle");

else
	System.out.println("incorrect Title");

	
Thread.sleep(3000);

driver.quit(); // close the browser

	}

}
