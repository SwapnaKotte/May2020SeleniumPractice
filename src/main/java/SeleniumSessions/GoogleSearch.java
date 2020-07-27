package SeleniumSessions;



import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearch {
//1. Create a generic method to select the single from the list
	
	//2. capture all the suggestions in a list and return
	
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		
	 driver=new ChromeDriver();
		
		driver.get("http://www.google.com");

		By seacrhBox=By.name("q");
		
		driver.findElement(seacrhBox).sendKeys("selenium");
		
		By dropList= By.xpath("//ul[@class='erkvQe']/li//span");
		
		String text= "selenium python";
		Thread.sleep(3000);
		
		List<String> list=captureAllSuggestions(dropList);
		
		for(int i=0; i<list.size();i++)
			System.out.println(list.get(i));
		
		
		selectSingleValue(dropList, text);
		
		
		
		
		Thread.sleep(3000);
		driver.quit();
		
	}
	
	public static void selectSingleValue(By locator,String text)
	{
		
		List<WebElement> list=driver.findElements(locator);
		
		System.out.println(list.size());
		
		
		for(int i=0; i<list.size();i++)
		{
			if(text.equalsIgnoreCase(list.get(i).getText()))
			{
				list.get(i).click();
				System.out.println(driver.getTitle());
				break;
				
				//Exception in thread "main" org.openqa.selenium.StaleElementReferenceException: stale element reference: element is not attached to the page document
//if you dont keep break ... we will get the ablove exception as driver is not able to click anymore further
			}
			
			
		}
		
		
	}
	
	public static List<String> captureAllSuggestions(By locator)
	{
		List<WebElement> list=driver.findElements(locator);
		List<String> suggestionsList= new ArrayList<String>();
		
		
		for(int i=0; i<list.size();i++)
		{
			suggestionsList.add(list.get(i).getText());
		}
		
		return suggestionsList;
	}
	
	
	
}
