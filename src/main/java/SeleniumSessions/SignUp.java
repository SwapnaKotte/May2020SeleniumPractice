package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignUp {

	public static void main(String[] args) throws InterruptedException {
		
		String browser= "chrome";
		WebDriverFactory wf= new WebDriverFactory();
		
		WebDriver driver= wf.launchBrowser(browser);
		
		wf.launchURL("https://www.orangehrm.com/orangehrm-30-day-trial/");
		
		System.out.println(wf.getPageTitle());
		
		
		By firstName= By.id("Form_submitForm_FirstName");
		By lastName= By.id("Form_submitForm_LastName");
		By country=By.id("Form_submitForm_Country");
		
		ElementUtil e1 = new ElementUtil(driver);
		
		e1.doSendKeys(firstName, "Swapna");
		e1.doSendKeys(lastName, "M");
		//e1.doSelectValuesByValue(country, "India");
		e1.doSelectByVisibleText(country, "India");
		
		Thread.sleep(5000);
		wf.closeBrowser();
		

	}

}
