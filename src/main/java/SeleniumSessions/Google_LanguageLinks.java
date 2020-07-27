package SeleniumSessions;





import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Google_LanguageLinks {

	static WebDriver driver;
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		 driver= new ChromeDriver();
		
		driver.get("https://www.google.co.in/");
		languageClick(" ");
		
		
		
	}
	
	/**
	 * 
	 * @param langName
	 */
	
	public static void languageClick(String langName)
	{
		
		List<WebElement> list =   driver.findElements(By.xpath(" "));
		
		int size=list.size();
		
		System.out.println(size);
		
		
		for(int i=0; i< size; i++)
		{
			String text= list.get(i).getText();
			System.out.println(text);
			
			if(text.equals(""))
			{
				list.get(i).click();
				break;
			}
		}
		
		driver.quit();
		
		
	}

}
