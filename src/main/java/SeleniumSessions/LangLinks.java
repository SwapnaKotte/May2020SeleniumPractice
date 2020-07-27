package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LangLinks {

	public static void main(String[] args) {
		
		// actully I am not getting the Language links on Google page for me . So this is some sample program.
		
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		
		List<WebElement> langLinks = driver.findElements(By.xpath("//*[@id='SIvCob']/a"));

		System.out.println(langLinks.size());
		
		for(int i=0; i<langLinks.size(); i++){
			
			langLinks.get(i).click();
			langLinks = driver.findElements(By.xpath("//*[@id='SIvCob']/a"));
			
		}
	
driver.quit();
	}

}
