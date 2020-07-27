package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LangaugeLinks {

	public static void main(String[] args) {
		// 
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		
		
		driver.get("https://www.w3schools.com/");
		
		//List<WebElement> list= driver.findElements(By.xpath("//*[@id=\'main\']/div[1]/div[1]/a"));
		//*[@id="mySidenav"]/div/div[1]
		
		List<WebElement> list= driver.findElements(By.xpath("/html/body/div[5]/a"));
		
		
		int size= list.size();
		
		System.out.println(size);
		for(int i=0; i <size; i++)
		{
		System.out.println(list.get(i).getText());
		}
		
		//for(int i=0; i <size; i++)
		//	list.get(i).click();
		
		//Exception in thread "main" org.openqa.selenium.StaleElementReferenceException: stale element reference: 
		//element is not attached to the page document

		for(int i=0; i <list.size(); i++)
		{
		System.out.println(list.get(i).getText());
			
		list.get(i).click();		
		
		//list= driver.findElements(By.xpath("/html/body/div[5]/a"));
		
		}
		
		//Exception in thread "main" org.openqa.selenium.ElementNotInteractableException: element not interactable

		
		
		
		
		driver.quit();
	}

}
