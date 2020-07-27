package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownSelectConcept {
	
	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		 driver= new ChromeDriver();
		
		

		 driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		 
		 By country=By.id("Form_submitForm_Country");
		 By industry= By.id("Form_submitForm_Industry");
		 
		// List<String> listCountry= new ArrayList<String>();
		// List<String> listIndustry= new ArrayList<String>();
		 
		 
		 List<String> listCountry=getDropDownOptionsValues(country);
		 List<String> listIndustry=getDropDownOptionsValues(industry);
		 
		 
		 System.out.println("\n printing List<String> here \n" + listCountry);
		 
		 System.out.println("\n printing List<String> here \n" + listIndustry);
			 
		 
//		 WebElement countryEle = driver.findElement(country);
//		 WebElement industryEle=driver.findElement(industry);
//		 Select select= new Select(countryEle);
//		 
//		 List<WebElement> list= select.getOptions();
//		 int size=list.size();
//		 System.out.println(size);
//		 
//		 for(int i=0;i<size; i++)
//			 System.out.println(list.get(i).getText());
//			 
//		 
		
		 
		 driver.quit();

		

	}
	
	
	public static WebElement getElement(By locator)
	{
		WebElement element = driver.findElement(locator);
		return element;
		
	}
	
	
	public static List<String> getDropDownOptionsValues(By locator)
	{
		Select select = new Select(getElement(locator));
		List<WebElement> values=select.getOptions();
		List<String> list= new ArrayList<String>();
		String text;
		
		System.out.println(values.size());
		
		for (int i=0; i<values.size();i++)
		{
			text=values.get(i).getText();
			System.out.println(i+ " ===>>>>  " + text);
			
			list.add(text);
			
		
		}
		
		System.out.println("*****End of this list \n\n");
		
		return list;
		
	}
	

	
	

}
