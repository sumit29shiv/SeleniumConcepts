package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class A7_HubSpotLoginTest {

	public static void main(String[] args) throws InterruptedException {
		
		A6_BrowserUtils br = new A6_BrowserUtils();
		WebDriver driver = br.startBrowser("chrome");
		br.navigateToURL("https://app.hubspot.com/login");
		Thread.sleep(6000);
		
		
	    //By locators
		By email = By.id("username");
		By pwd = By.id("password");
		
		A7_ElementUtils elUtil = new A7_ElementUtils(driver);
		elUtil.doSendKeys(email,"test@gmail.com");
		elUtil.doSendKeys(pwd,"12345");
		br.closeBrowser();
		

	}

}
