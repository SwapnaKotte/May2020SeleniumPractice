package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsMovetoElementConcept {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		 driver= new ChromeDriver();
		driver.get("http://mrbool.com/how-to-create-menu-with-submenu-using-css-html/26146");
		Thread.sleep(2000);
		By content=By.className("menulink");
		
		Actions ac= new Actions(driver);
		ac.moveToElement(getElement(content)).perform();
		
		Thread.sleep(2000);
		
		//ac.click(driver.findElement(By.linkText("COURSES"))).perform();;
		
		ac.click(driver.findElement(By.xpath("//*[@id=\"headermenudesktop\"]/ul/li/ul/li[2]/a"))).perform();
		
		Thread.sleep(2000);
		driver.quit();

	}
	
	public static WebElement getElement(By locator)
	{
		WebElement element= driver.findElement(locator);
		
		return element;
		
	}

}
