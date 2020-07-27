package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameConcept {

	public static void main(String[] args) throws InterruptedException {
		
		//Frame is also a WebElement
		//Frame is also having its own HTML DOM
		//
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("http://www.londonfreelance.org/courses/frames/index.html");
		
	
		
		driver.switchTo().frame(2);
		
		
//		WebElement header= driver.findElement(By.tagName("h2"));
 //     WebElement header= driver.findElement(By.xpath("/html"));
		
		WebElement header= driver.findElement(By.cssSelector("body > h2"));
	
		
		
		System.out.println(header.getText());
		
		Thread.sleep(3000);
		driver.quit();
		
		
		

	}

}
