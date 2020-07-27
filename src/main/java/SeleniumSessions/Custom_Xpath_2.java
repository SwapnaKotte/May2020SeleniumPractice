package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Custom_Xpath_2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://classic.crmpro.com");
		
		driver.findElement(By.name("username")).sendKeys("batchautomation");
		driver.findElement(By.name("password")).sendKeys("Test@12345");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		Thread.sleep(3000);
		
		String personName="abhi sahu";
		
		//a[text()='abhi sahu']//parent::td//preceding-sibling::td//input[@type='checkbox']
		//driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		
		//driver.findElement(By.linkText("Contacts")).click();
		
		driver.switchTo().frame("mainpanel");
		
		driver.findElement(By.xpath("//ul[@class='mlddm']//li//a[text()='Contacts']")).click();
		
		Thread.sleep(3000);
		
		selectContact(driver,personName);
		selectContact(driver,"Aashiq Limbu");
		
		String compName=displayCompName(driver,"abhilasha Sharma");
		System.out.println(compName);
		
		
		
		
		Thread.sleep(3000);
		/*
		 * 
		 //input[@id='username']
		  
		  backward traversing 
		  //input[@id='username']/../../../../../../../../../../..
		    
		    //input[@id='username']//parent::div
		   
		   
		   //div[@class='private-form__input-wrapper']//child::input
		    * 
		    * //div[@class='input-group']//child :: input
		  
		  //input[@name='username']//ancestor :: div
		  
		  VImp concept- finding a locator for WEBTable Elements- especially checkbox in the first column to select
		  
		  
		  new url: https://classic.crmpro.com
		  username: batchautomation
		  password: Test@12345
		  
		  //input[@name='contact_id']  it gives almost 22 
		  <input type="checkbox" name="contact_id" value="52751912">
		  not sure about identity
		  
		  //a[text()='abhi sahu']//parent::td//preceding-sibling::td//input[@type='checkbox']
		   
		   this is correct xpath to select correct checkbox
		   
		  
		  
		 */
		
		driver.quit();
	}
	
	public static void selectContact(WebDriver driver, String name)
	{
		driver.findElement(By.xpath("//a[text()='"+name+"']//parent::td//preceding-sibling::td//input[@type='checkbox']")).click();
		
		
	}
	
	public static String displayCompName(WebDriver driver, String name)
	{
		return driver.findElement(
				By.xpath("//a[@_name='"+name+"']//parent::td//following-sibling::td/a[@context='company']")).getText();
	}

}
