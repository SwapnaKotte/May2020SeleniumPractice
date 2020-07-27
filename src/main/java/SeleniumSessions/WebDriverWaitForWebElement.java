package SeleniumSessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverWaitForWebElement {

	
	/*
	 * 
	 * SELECT Employees.LastName, COUNT(Orders.OrderID) AS NumberOfOrders
FROM (Orders
INNER JOIN Employees ON Orders.EmployeeID = Employees.EmployeeID)
GROUP BY LastName
HAVING COUNT(Orders.OrderID) > 10;

	 * 
	 */
	static WebDriver driver;
	public static void main(String[] args)  {
		
		//WebDriverWait is first type of ExplicitWait
		//we dont have any ExplicitWait class/method/iterface like ImplicitlyWait
		
		//WebDriverWait is a class
		//extedning FluentWait Class
		//Wait Interface is there
		
		WebDriverManager.chromedriver().setup();
		 driver= new ChromeDriver();
		 
/*		 
		 
		driver.get("https://app.hubspot.com/login/");
		By username=By.id("username");
		By password= By.id("password");
		By login= By.id("loginBtn");
		
//		Alert alert=driver.switchTo().alert();
//		
//		driver.switchTo().frame(1);
//		driver.switchTo().frame("frame1");
//		driver.switchTo().frame(driver.findElement(username));
//		
//		
//		
//		alert.accept();
//		alert.dismiss();
//		alert.getClass();
//		alert.getText();
//		alert.sendKeys(" ddsd");
//		
		//WebDriverWait wait= new WebDriverWait(driver,10);
		
		//wait.until(ExpectedConditions.presenceOfElementLocated(username));
		
		
		waitForElementPresent(driver,10,username).sendKeys("swapna");
		driver.findElement(password).sendKeys("test@123");
		
	//	driver.findElement(login).click();
		

		WebDriverWait wait = new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.elementToBeClickable(login)).click();;
		
		*/
		 
		 driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		 driver.findElement(By.name("proceed")).click();
		 
		 Alert alert= waitForAlertPresent(driver,20);
		 
		System.out.println(alert.getText());
		 alert.accept();
		
		driver.switchTo().defaultContent();
		 driver.findElement(By.id("login1")).sendKeys("Swapna");
		 	
//System.out.println(driver.getTitle());
		
driver.quit();
	}

	//generic utility
	
	
	public static Alert waitForAlertPresent(WebDriver driver,int timeout)
	{
		 WebDriverWait wait= new WebDriverWait(driver, timeout);
		 return wait.until(ExpectedConditions.alertIsPresent());
		 
		 
	}
	
	public static WebElement waitForElementPresent(WebDriver driver, int timeout, By locator)
	{
    WebDriverWait wait= new WebDriverWait(driver,timeout);
    return	wait.until(ExpectedConditions.presenceOfElementLocated(locator));
 
    //   Alert alert= wait.until(ExpectedConditions.alertIsPresent());
    
//   WebElement elem= wait.until(ExpectedConditions.elementToBeClickable(locator));  
//    wait.until(ExpectedConditions.elementToBeSelected(locator));   
//    wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
//    wait.until(ExpectedConditions.titleIs("hubspot"));
//    wait.until(ExpectedConditions.titleContains("login"));
//    wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(locator));
//    wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));
//    wait.until(ExpectedConditions.urlContains(".com"));
//    wait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(locator), ""));
     		 
	}
	
}
