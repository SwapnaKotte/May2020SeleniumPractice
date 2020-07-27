package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JQueryDropDownConcept {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		 driver= new ChromeDriver();
		
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		
		By inputBox=By.id("justAnInputBox");
		driver.findElement(inputBox).click();
		
		By checks=By.cssSelector("span.comboTreeItemTitle");	
		
//	selectChoiceValues(checks,"choice 7");
//		
//		selectChoiceValues(checks,"choice 6 2 3");
//		
//		selectChoiceValues(checks,"choice 5");
//		
//	selectChoiceValues(checks,"choice 2 1");
		
		// UseCases:
		
		// single value collection
		//multiple values collection
		// Select all 
		
		// String...  this is called three dot operator
		
//		selectChoiceValues(checks,"choice 7","choice 6 2 3","choice 5","choice 2 1");
		
	selectChoiceValues(checks,"ALL");
		
		Thread.sleep(5000);
		driver.quit();
		
		
		
	}
	
	// Handling all cases 
	
	public static void selectChoiceValues(By locator, String... value)
	{
List<WebElement> checksList=driver.findElements(locator);

System.out.println(checksList.size());

if(! value[0].equalsIgnoreCase("all"))
{
		
		for(int i=0 ; i< checksList.size(); i++) {
			
			System.out.println(checksList.get(i).getText());
			String text=checksList.get(i).getText();
			
			for (int k=0; k<value.length;k++)
				
			{
		   if(text.equals(value[k]))
		   {
			   checksList.get(i).click();
		   System.out.println("Checked   : "+ value[k]);
		   }
		   
			}
		}
		
}
else
{
	for(int i=0 ; i <checksList.size();i++)
	{
		try {
		checksList.get(i).click();
		}catch(Exception e )
		{
			
		}
	}
	

//Exception in thread "main" org.openqa.selenium.ElementNotInteractableException: element not interactable 
	// because some elements might not displayed/not able to select all 45 elements 
	// this exceptio handled by adding try catch block
	

}
		
	}
	
	
//	public static void selectChoiceValues(By locator, String... value)
//	{
//List<WebElement> checksList=driver.findElements(locator);
//		
//		for(int i=0 ; i< checksList.size(); i++) {
//			
//			System.out.println(checksList.get(i).getText());
//			String text=checksList.get(i).getText();
//			
//			for (int k=0; k<value.length;k++)
//				
//			{
//		   if(text.equals(value[k]))
//		   {
//			   checksList.get(i).click();
//		   System.out.println("Checked   : "+ value[k]);
//		   }
//		   
//			}
//		}
//		
//	}

//	public static void selectChoiceValues(By locator, String value)
//	{
//List<WebElement> checksList=driver.findElements(locator);
//		
//		for(int i=0 ; i< checksList.size(); i++) {
//			
//			System.out.println(checksList.get(i).getText());
//			String text=checksList.get(i).getText();
//			
//		   if(text.equals(value))
//			   checksList.get(i).click();
//		}
//		
//	}
	
	
	
}
