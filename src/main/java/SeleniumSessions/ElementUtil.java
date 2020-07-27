package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementUtil {
	
	private WebDriver driver;
	
	public ElementUtil(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	public  WebElement getElement(By locator)
	{
		WebElement element= null;
		
		try
		{
		element=driver.findElement(locator);
		}catch(Exception e)
		{
			System.out.println("element could not be created : " + element);
		}
		
		return element;
		
	}
	
	public void doClick(By locator)
	{
		getElement(locator).click();
		}
	
	
	public void doSendKeys(By locator, String value)
	{
		getElement(locator).sendKeys(value);
	}
	
	public void doGetText(By locator)
	{
		getElement(locator).getText();
		
	}
	
	public boolean doIsDisplayed(By locator)
	{
		return getElement(locator).isDisplayed();
		
	}
	
	/***** ACTIONS CLASS UTILITIES ***************/
	/**
	 * This is Actions class based SendKeys
	 * @param locator
	 * @param value
	 */
	
	public  void doActionsSendKeys(By locator, String value)
	{
		
		Actions ac= new Actions(driver);
		ac.sendKeys(getElement(locator), value).perform();
		
		
	}
	/**
	 * this  is Actions Class based CLICK
	 * @param locator
	 */	
	public void doACtionsClick(By locator)
	{
		Actions ac= new Actions(driver);
		ac.click(getElement(locator)).click().perform();
	}
	
	
	
	public  void doSelectByVisibleText(By locator, String text)
	{
		Select select = new Select(getElement(locator));
		select.selectByVisibleText(text);
		
	}
	
	/******************************* SELECT CLASS UTILITITES  *********************/
	
	public  void doSelectValuesByIndex(By locator,int index)
	{
		Select select = new Select(getElement(locator));
		select.selectByIndex(index);
	}
	
	
	public  void doSelectValuesByValue(By locator,String value)
	{
		Select select = new Select(getElement(locator));
		select.selectByValue(value);
	}
	
	
	public void doSelectValuesByVisibleText(By locator, String text)
	{
		Select select = new Select(getElement(locator));
		select.selectByVisibleText(text);
		
	}
	
	
	public  List<String> getDropDownOptionsValues(By locator)
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
	
	/**** Select Value without using SELECT Class even though SELECT HTML Tag is there as per interview ****/
	/**
	 * 
	 * @param locator
	 * @param value
	 */
	public void selectValuesFromDropDown(By locator, String value)
	{
		List<WebElement>  list=driver.findElements(locator);
		
		//System.out.println("\n"+list.size()+" \n");
	
		for(int i=0; i<list.size(); i++)
		{
			String text = list.get(i).getText();
			//System.out.println(text);
		if(text.equals(value))
		{
		list.get(i).click();
		break;
		}
		
		}
		
	}	
		/*************** These are my wait utiltities ********************/
		
	/*************** These are my wait utiltities ********************/
	
	public String doGetPageTitleWithIsTitle(int timeout, String title)
	{
		
		WebDriverWait wait= new WebDriverWait(driver, timeout);
		wait.until(ExpectedConditions.titleIs(title));
		
		return driver.getTitle();
		
	}
	
	public String doGetPageTitleWithTitleContains(int timeout, String title)
	{
		WebDriverWait wait= new WebDriverWait(driver,timeout);
		
		wait.until(ExpectedConditions.titleContains(title));
		
		return driver.getTitle();
		
	}
	
      public String doGetPageCurrentUrl(int timeout,String urlValue) {
		
		WebDriverWait wait= new WebDriverWait(driver,timeout);
		wait.until(ExpectedConditions.urlContains(urlValue));
		
		return driver.getCurrentUrl();	
		
	}
      
      public  WebElement waitForElementPresent(WebDriver driver, int timeout, By locator)
  	{
      WebDriverWait wait= new WebDriverWait(driver,timeout);
      return	wait.until(ExpectedConditions.presenceOfElementLocated(locator));
  	}
	
	
      public Alert waitForAlertPresent(int timeout)
  	{
  		 WebDriverWait wait= new WebDriverWait(driver, 20);
  		 return wait.until(ExpectedConditions.alertIsPresent());
  	}
      
    public WebElement waitForElementToBeClickable(By locator, int timeout)
    {
    	WebDriverWait wait= new WebDriverWait(driver, timeout);
    	return wait.until(ExpectedConditions.elementToBeClickable(locator));
    	
    }
    
    public void clickWhenReady(By locator, int timeout)
    {
    	WebDriverWait wait= new WebDriverWait(driver, timeout);
     wait.until(ExpectedConditions.elementToBeClickable(locator)).click();;
    	
    }
    
    

}
