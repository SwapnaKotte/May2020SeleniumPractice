package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsRightClickOption {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// In html language - RIGHT CLICK is called Context Menu
		// how will we do rightClick thru selenium
		// THIS IS CONTEXTCLICK 
		
		WebDriverManager.chromedriver().setup();
		 driver= new ChromeDriver();
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		
        By rightClickMe=By.xpath("//span[text()='right click me']");
        
        Actions ac= new Actions(driver);
        
       // ac.contextClick().perform();; // this one do right click whereever the mouse is available that time 
        ac.contextClick(getElement(rightClickMe)).perform();; // this performs right click on the respective locator element.
        
        
        By options= By.xpath("//ul[@class='context-menu-list context-menu-root']/li[contains(@class,'context-menu-icon')]");
        
        List<WebElement>  list=driver.findElements(options);
        
        System.out.println(list.size());
        String label= "copy";
        
        for ( int i=0; i< list.size();i++)
        {
        	String text= list.get(i).getText();
        	System.out.println(text);
        	
        	if(text.equalsIgnoreCase(label))
        	{
        		list.get(i).click();
        		break;
        	}
        }
//    System.out.println(driver.getTitle());
        
        // when we clicked on rightclick >>> Copy/edit/cut/.... anythig on this page, one ALERT pop up came.. 
        // so not able to perform getTitle function as driver moves to JS Popup
        //Exception in thread "main" org.openqa.selenium.UnhandledAlertException: 
        //unexpected alert open: {Alert text : clicked: copy}

        
        Alert alert=driver.switchTo().alert();
        
     System.out.println(alert.getText());
     Thread.sleep(2000);
    
     alert.accept();
   //  alert.dismiss();
    // we are trying to perform DISMISS ACTION here but actually alert popup got closed by accept actio
     // so Exception in thread "main" org.openqa.selenium.NoAlertPresentException: no such alert

     
     System.out.println(driver.getTitle());
        
		Thread.sleep(2000);
        driver.quit();
	}
	
	public static WebElement getElement(By locator)
	{
		WebElement element = driver.findElement(locator);
		return element;
		
	}
	
	

}
