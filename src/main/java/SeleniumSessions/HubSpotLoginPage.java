package SeleniumSessions;

public class HubSpotLoginPage {

	public static void main(String[] args) throws InterruptedException {
		
		String browser="chrome";
		String URL="http://www.google.com";
		WebDriverFactory wf=new WebDriverFactory();
		
		wf.launchBrowser(browser);
		wf.launchURL(URL);
		
		Thread.sleep(5000);
		
		System.out.println(wf.getPageTitle());
		String actualTitle=wf.getPageTitle();
		
		if(actualTitle.equals("google"))
			System.out.println("page title is correct");
		else
			System.out.println("page title is not correct ---" + actualTitle);
		  
		System.out.println(wf.getPageCurrentURL());
		
		
        wf.closeBrowser();
		

	}

}
