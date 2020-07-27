package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorsConcept {
	 static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		//
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		
		driver.get("https://app.hubspot.com/login");
		
		Thread.sleep(5000);
		
		//create a WebElement  and then perform action
		//WE+ click
		//WE+ sendKeys
		//WE+getText
		
		
//		1.By ID -- I attributes wise
//		driver.findElement(By.id("username")).sendKeys("swapna.kotte@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("Test@123");
//		driver.findElement(By.id("loginBtn")).click();
//		
		
//		Second Approach 
//		
//		WebElement email=driver.findElement((By.id("username")));
//		WebElement password=driver.findElement((By.id("password")));
//		WebElement login=driver.findElement((By.id("loginBtn")));
//		
//		email.sendKeys("swapna.kotte@gmail.com");
//		password.sendKeys("test@123");
//		login.click();

		
		//Third approach this is the approach in PageObject Model
		// here we are not using WebElement / driver until really we want to call
		// these all are only locators
		
//		By email=By.id("username");
//		By password= By.id("password");
//		By login=By.id("loginBtn");
//		
		
//		driver.findElement(email).sendKeys("swapna.kotte");
//		driver.findElement(password).sendKeys("test@123");;
//		driver.findElement(login).click();
		
		
		//Approach 4 -- instead of wriitng step by step driver.findElement.... created one reusable method 
		// where if we pass locator we will get webellement
		// by using that we performed action on that element
		
//		getElement(email).sendKeys("swapna.kotte@gail.com");
//		getElement(password).sendKeys("test@123");
//		getElement(login).click();
//		
		
		
		// approach 5
		
//		doSendKeys(email, "swapna.kotte@gmail.com");
//		doSendKeys(password, "test123");
//		doClick(login);
//		
		
		
		
		// 2. attribute is >>      name    II attributes wise
		//https://www.crmpro.com/  
		
		//driver.findElement(By.name("username")).sendKeys("swapna.kotte");
		
		
		
		
		//3 >> className attribute   III attributes wise
		
//		<input id="password" type="password" tabindex="2" aria-labelledby="UIFormControl-label-4" 
//				aria-describedby="undefined-help undefined-description" 
//				class="form-control private-form__control login-password m-bottom-3" value="">
//		
		//observe here 
		//class="form-control private-form__control login-password m-bottom-3
		
		//<input id="username" type="email" tabindex="1" aria-labelledby="UIFormControl-label-2"
		//class="form-control private-form__control login-email" value="">
		
//driver.findElement(By.className("login-email"));
//driver.findElement(By.className("login-password"));

		
		
		
		
		
		//4  xpath: it is not an attribute -- this is locator only // without considering attributes---- I/II
		// if we compare xpath/css vs id, name  >> then ID,name are  first preference
		
		// absolute xpath and dynamic xpath
		//as of now >> inspect an element , right click , copy , copyXPath
		
//		driver.findElement(By.xpath("//*[@id='username']" )).sendKeys("swapna.kotte");;
//		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("test123");
//		driver.findElement(By.xpath("//*[@id=\'loginBtn\']")).click();
//		
		
		
		
		
		
		// 5. cssSelector: this is also not an attribute- this is also locator    without considering attributes --- I/II
		// if we compare xpath/css vs id,name >> then ID, name  are first preference
		
//		driver.findElement(By.cssSelector("#username")).sendKeys("swapna.kotte");
//		driver.findElement(By.cssSelector("#password")).sendKeys("test123");
//		driver.findElement(By.cssSelector("#loginBtn")).click();
		
		
		
		
//		
		// 6. linkText - this is only for links
//		<a class="private-link uiLinkWithoutUnderline uiLinkDark m-left-1" href="https://app.hubspot.com/signup/crm" tabindex="0">
//		<i18n-string data-locale-at-render="en-us" data-key="login.signupLink.cta">Sign up</i18n-string></a>

		// here what is the htmltag of sign-up is 	i18n-string not <a
		// i18n-string is child of <a 
		
		//driver.findElement(By.linkText("Sign up")).click();
		
		
		
		
		//7. partiallyLinkText -- not much preferrable as sometimes we could see same text for other elements also
		
		//driver.findElement(By.partialLinkText("Sign")).click();
		
		
		
		
		
		//8 tagName
		
		doQuit();

	}
	
	
	public static WebElement getElement(By locator)
	{
		WebElement element=driver.findElement(locator);
		return element;
		
	}
	
	public static void doSendKeys(By locator, String value)
	{
		getElement(locator).sendKeys(value);
	}
	
	public static void doClick(By locator)
	{
		getElement(locator).click();
	}
	
	public static void doQuit()
	{
		driver.quit();	
	}
	

}
