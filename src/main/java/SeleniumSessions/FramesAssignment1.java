package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FramesAssignment1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://classic.crmpro.com");
		
		By username=By.name("username");
		By password=By.name("password");
		By login=By.xpath("//*[@id=\'loginForm\']/div/div/input");
		
		//batchautomation 
		//Test@12345 
		
		driver.findElement(username).sendKeys("batchautomation");
		driver.findElement(password).sendKeys("Test@12345");
		driver.findElement(login).click();
		
		System.out.println("Logged in "+driver.getTitle() );
		
		driver.switchTo().frame("mainpanel");
		
		By contacts=By.xpath("//*[@id=\'navmenu\']/ul/li[4]/a");
		
		driver.findElement(contacts).click();
		
		System.out.println(driver.findElement(contacts).getText() + " " +driver.getTitle());
		
		
		Thread.sleep(5000);
		
		//driver.switchTo().defaultContent();
		
		By logout= By.xpath("/html/body/table[1]/tbody/tr[2]/td[1]/div/table/tbody/tr/td[4]/a");
		
		driver.findElement(logout).click();
		
		System.out.println("Logout" + "  "+ driver.getTitle());
		
		
		
		
		
		Thread.sleep(5000);
		driver.quit();
	}

}
