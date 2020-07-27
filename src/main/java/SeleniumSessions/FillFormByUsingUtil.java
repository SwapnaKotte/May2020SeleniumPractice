package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FillFormByUsingUtil {

	public static void main(String[] args) throws InterruptedException {
	
		
		String browser= "chrome";
		//String URL="https://www.orangehrm.com/orangehrm-30-day-trial/";
		
		WebDriverFactory wf= new WebDriverFactory();
		
		WebDriver driver=wf.launchBrowser(browser);
		
		
	    wf.launchURL("https://www.orangehrm.com/orangehrm-30-day-trial/");
	    
	    By firstName=By.id("Form_submitForm_FirstName");
	   By  lastName = By.id("Form_submitForm_LastName");
	    By email= By.id("Form_submitForm_Email");
	    By jobTitle= By.id("Form_submitForm_JobTitle");
	   By noOfEmployees = By.id("Form_submitForm_NoOfEmployees");
	   By company= By.id("Form_submitForm_CompanyName");
	   By industry = By.id("Form_submitForm_Industry");
	   By  phnNum= By.id("Form_submitForm_Contact");
	   By  country=By.id("Form_submitForm_Country");
	   By setDummyData= By.id("Form_submitForm_SetDummyData");
	   
	   ElementUtil e1= new ElementUtil(driver);
	   
	   e1.doSendKeys(firstName, "Swapna");
	   
	   e1.doSendKeys(lastName, "Kotte");
	   
	   e1.doSendKeys(email, "abdfdfc@gmail.com");
	    
	   e1.doSendKeys(jobTitle, "SDET");
	    
	  // e1.doSendKeys(noOfEmployees, "1000");
	   
	  e1.doSelectByVisibleText(noOfEmployees, "801 - 900");  
	  
	   e1.doSendKeys(company, "Google");
	   
	//   e1.doSendKeys(industry, "IT");
	 //  e1.doSelectValuesByIndex(industry, 8);
	  e1.doSelectByVisibleText(industry, "Government - National / Federal (inc Military)");
	   
	  // e1.doSelectValuesByVisibleText(industry, "Telecoms/Communications");
	   /*
	    * Exception in thread "main" org.openqa.selenium.NoSuchElementException: Cannot locate element
	    *  with text: Telecoms/Communications
For documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html
	    */
	   
	   e1.doSendKeys(phnNum, "1234567890");
	   
	 //  e1.doSendKeys(country, value);
	   
	   e1.doSelectByVisibleText(country, "Germany");
	   
	  e1.doClick(setDummyData);
	   
	   Thread.sleep(5000);
	   
	   wf.closeBrowser();
		   

	}

}
