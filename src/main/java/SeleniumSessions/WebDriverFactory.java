package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverFactory {

	public WebDriver driver;
	
	/**
	 * This method is used to launch the browser on the basis of given browser name
	 * @param browser
	 * @return
	 */
	
	public WebDriver launchBrowser(String browser)
	{
		
		if(browser.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver();
			
		}
		else
			if(browser.equalsIgnoreCase("firefox"))
				
			{
				WebDriverManager.firefoxdriver().setup();
				driver= new FirefoxDriver();
				
			}
			else
				if(browser.equalsIgnoreCase("safari"))
					
				{
					WebDriverManager.getInstance(SafariDriver.class).setup();
					 driver= new SafariDriver();
					
				}
				else
					if(browser.equalsIgnoreCase("ie"))
						
					{
						WebDriverManager.iedriver().setup();
						 driver= new InternetExplorerDriver();
						
					}
					else
						if(browser.equalsIgnoreCase("opera"))
							
						{
							WebDriverManager.operadriver().setup();
							 driver= new OperaDriver();
							
						}
		
		return driver;
		
	}
	
	/**
	 * this method launches the browser
	 * @param URL
	 */
	
	public void launchURL(String URL)
	{
		driver.get(URL);
	}
	
	/**
	 * this method gives you Titlt of your page
	 * @return
	 */
	
	public String getPageTitle()
	{
		 return driver.getTitle();
		
	}
	
	public String getPageCurrentURL()
	{
		return driver.getCurrentUrl();
	}
	
	/**
	 * this method will close the browser
	 */
	public void closeBrowser()
	{
		driver.quit();
	}
	
	
}
