package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDropConcept {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://jqueryui.com/resources/demos/droppable/default.html");
		
		By source=By.id("draggable");
		
		By target=By.id("droppable");
		
		WebElement sourceElement=driver.findElement(source);
		WebElement targetElement =driver.findElement(target);
		
			Actions ac= new Actions ( driver);
			
		//	ac.clickAndHold(sourceElement).
		// moveToElement(targetElement).
			//release().
			//build().
			//perform(); - it works 
			
		//	ac.dragAndDrop(sourceElement, targetElement).build().perform(); -- this is also works even though we used build on single ction
			
			ac.dragAndDrop(sourceElement, targetElement).perform(); // this is fine as we have only one action no need to use build
			
		Thread.sleep(3000);
		
		driver.quit();
	}

}
