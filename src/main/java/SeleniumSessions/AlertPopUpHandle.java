package SeleniumSessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertPopUpHandle {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// JS Pop up alert
		
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		 
		 driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		 driver.findElement(By.name("proceed")).click();
		
	Alert alert=driver.switchTo().alert();
	
	System.out.println(alert.getText());
	
	String text=alert.getText();
	if(text.equals("Please enter a valid user name"))
	{
		System.out.println("it is correct tex msg");
	}
	else
	{
		System.out.println("not proper msg");
	}
	Thread.sleep(3000);
	
	alert.accept();
	

//	alert.dismiss();  // kind of ESC key
	
	driver.switchTo().defaultContent();
	
	
	
driver.quit();
		

	}

}
