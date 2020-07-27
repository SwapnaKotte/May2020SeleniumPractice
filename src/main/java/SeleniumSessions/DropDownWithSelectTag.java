package SeleniumSessions;



import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownWithSelectTag {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		
		 driver= new ChromeDriver();
		
		//driver.get("https://www.facebook.com/");

		 driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		 
		 By country=By.id("Form_submitForm_Country");
		 
		 doSelectByVisibleText(country,"Brazil");
		 
		 
		 
		 
//		By month=By.id("month");
//		By day=By.id("day");
//		By year=By.id("year");		
//		
//		doSelectByVisibleText(month,"May");
//		doSelectByVisibleText(day,"12");
//		doSelectByVisibleText(year,"2010");
//		
//		doSelectByIndex(month,9);
//		doSelectByIndex(day,12);
//		doSelectByIndex(year,20);
//		
//		doSelectByValue(month,"10");
//		doSelectByValue(day,"18");
//		doSelectByValue(year,"1998");
		
		
	//	WebElement day=driver.findElement(By.id("day"));
		
		
		//Select select= new Select(day);
		
		//under select class we don't have default constructor with 0 args .
		// it has only one parameter constructor with one argument and arg type is WebElement
		
//		select.selectByVisibleText("14");
//		select.selectByIndex(9);
//		select.selectByValue("5");
//		
		//<option value="5">May</option>  here value is 5 and when we perform getText() then we will see May .
		
		//doDropDownGetOptions(month);
		
		List<String> list=new ArrayList<String>();
		  // list=doDropDownGetOptions(month);
		
		   list=doDropDownGetOptions(country);
 
		System.out.println("\n\n"+ list);
		
		
	Thread.sleep(5000);
		
		driver.quit();
		
		
	}
	
	public static WebElement getElement(By locator)
	{
		WebElement element=driver.findElement(locator);
		
		return element;
		
	}
	
	public static void doSelectByVisibleText(By locator, String text)
	{
		Select select = new Select(getElement(locator));
		select.selectByVisibleText(text);
		
	}
	
	
	
	public static void doSelectByIndex(By locator,int index)
	{
		Select select = new Select(getElement(locator));
		select.selectByIndex(index);
	}
	
	public static void doSelectByValue(By locator,String value)
	{
		Select select = new Select(getElement(locator));
		select.selectByValue(value);
	}
	
	
	public static List<String> doDropDownGetOptions(By locator)
	{
		Select select = new Select(getElement(locator));
		
		List<WebElement> dropdownlist=select.getOptions();
		List<String> list=new ArrayList<String>();
		
		
		for(int i=0; i<dropdownlist.size();i++)
		{
		System.out.println(dropdownlist.get(i).getText());
		list.add(dropdownlist.get(i).getText());
		
		}
		
		return list;
		
		
		
	}
	

}
