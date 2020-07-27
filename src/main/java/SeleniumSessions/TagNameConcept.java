package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TagNameConcept {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		//find total no.of links
		//print the text of each link on console
		
		
		List<WebElement> linkslist=driver.findElements(By.tagName("a")); // here a is html tag
		
		int size=linkslist.size();
		
		System.out.println("totlal no.of links :  "+size);
		
		
		for(int i=0;i<size; i++)
		{
			String text=linkslist.get(i).getText();
			if(!text.isEmpty())
			   System.out.println(text);
		}
		
		
		driver.quit();
	}

}
