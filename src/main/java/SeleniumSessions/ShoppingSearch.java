package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ShoppingSearch {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php");
		
		By search=By.id("search_query_top");
		String searchText="dress";
		
//		searchText="shirt";
//		searchText="printed";
	
		driver.findElement(search).sendKeys(searchText);
		
		Thread.sleep(5000);
		
		By result=By.xpath("//li[@class='ac_even']");
		
		List<WebElement> list= driver.findElements(result);
		
		System.out.println(list.size());
		
		for(int i=0; i< list.size();i++)
			System.out.println(list.get(i).getText());
		
		driver.quit();
		

	}

}
