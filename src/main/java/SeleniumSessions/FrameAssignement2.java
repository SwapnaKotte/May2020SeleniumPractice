package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameAssignement2 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://jqueryui.com/draggable/");
		
		By themes= By.xpath("//*[@id=\'menu-top\']/li[4]/a");
		
		driver.findElement(themes).click();
		
		System.out.println(driver.getTitle());
		
		Thread.sleep(5000);
		
		driver.navigate().back();
		
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"content\"]/iframe")));
		
		By drag=By.id("draggable");
		
		System.out.println(driver.findElement(drag).isDisplayed());
		
		if(driver.findElement(drag).isDisplayed())
		      System.out.println(driver.findElement(drag).getText() );
		else
			System.out.println("Not able to reach DROP HERE Label");
		
		Thread.sleep(5000);
	
		driver.switchTo().defaultContent();
		
		By support= By.xpath("//*[@id=\"menu-top\"]/li[6]/a");
		
		driver.findElement(support).click();
		
		System.out.println(driver.getTitle());
		
		Thread.sleep(5000);
		driver.quit();

	}

}
