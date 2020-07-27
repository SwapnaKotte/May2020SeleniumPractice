package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectValueWithoutSelectClass {

	static WebDriver driver;
	static String dob="Jun-21-1984";
	
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		driver= new ChromeDriver();
		
	//	driver.get("https://www.facebook.com/");
//		By month= By.xpath("//select[@id='month']/option");
//		By day= By.xpath("//select[@id='day']/option");
//		By year= By.xpath("//select[@id='year']/option");
//selectValuesFromDropDown(month, dob.split("-")[0]);
//		
//		selectValuesFromDropDown(day, dob.split("-")[1]);
//		
//		selectValuesFromDropDown(year, dob.split("-")[2]);

		
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		 By country= By.xpath("//select[@id='Form_submitForm_Country']/option");
		 
		 
		 selectValuesFromDropDown(country,"India");
		
		 selectValuesFromDropDown(country,"Brazil");
		 
		 
		By industry=By.xpath("//select[@id='Form_submitForm_Industry']/option");

		 selectValuesFromDropDown(industry, "Travel");

		 selectValuesFromDropDown(industry, "Education");
		
		
		
		Thread.sleep(3000);
		
		driver.quit();
		
		

	}
	
	public static void selectValuesFromDropDown(By locator, String value)
	{
		List<WebElement>  list=driver.findElements(locator);
		
		System.out.println("\n"+list.size()+" \n");
	
		for(int i=0; i<list.size(); i++)
		{
			String text = list.get(i).getText();
			System.out.println(text);
		if(text.equals(value))
		{
		list.get(i).click();
		break;
		}
		
		}
		
		
	}

}
