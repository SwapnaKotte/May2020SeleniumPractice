package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;


public class ActionsClickAndSendKeys {

	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.get("https://app.hubspot.com/login");
		
		Thread.sleep(5000);
		//if we dont have Thread here..
		//Exception in thread "main" org.openqa.selenium.NoSuchElementException: 
				//no such element: Unable to locate element: {"method":"css selector","selector":"#username"}
		
		By email=By.id("username");
		By password=By.id("password");
		By login=By.id("loginBtn");
			
	//Actions ac= new Actions (driver);
	
  // getText is not available as it is not an action
 // isDisplayed also not an action
	
		
		
//		ac.sendKeys(getElement(email), "swapna@gmail.com");
//		ac.sendKeys(getElement(password), "swapna");
//		ac.click(getElement(login));
		
		// without .perform , Actions class will not perform any operation... at the same time no error/exception on the console also
		
//		ac.sendKeys(getElement(email), "swapna@gmail.com").perform();
//		ac.sendKeys(getElement(password), "swapna").perform();
//		ac.click(getElement(login)).perform();
		
		System.out.println(driver.getTitle());
		
		doActionsSendKeys(email,"swapna@gmail.com");
		doActionsSendKeys(password, "swapna");
		doACtionsClick(login);

		
		Thread.sleep(3000);
		driver.quit();
		
	}
	/**
	 * This method is used to getElemnet based on given locator
	 * @param locator
	 * @return
	 */
	public static WebElement getElement(By locator)
	{
		WebElement element= driver.findElement(locator);
		return element;
		
	}
	
	/**
	 * This is Actions class based SendKeys
	 * @param locator
	 * @param value
	 */
	
	public static void doActionsSendKeys(By locator, String value)
	{
		
		Actions ac= new Actions(driver);
		ac.sendKeys(getElement(locator), value).perform();
		
		
	}
	/**
	 * this  is Actions Class based CLICK
	 * @param locator
	 */
	public static void doACtionsClick(By locator)
	{
		Actions ac= new Actions(driver);
		ac.click(getElement(locator)).click().perform();
	}

}
