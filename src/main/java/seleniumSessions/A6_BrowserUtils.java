package seleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A6_BrowserUtils {
	
	WebDriver driver;
	
	public WebDriver startBrowser(String browser) {
		
		/**
		 * This method is used to launch browser
		 * @author sumit shivhare
		 * @params browser
		 * @returns it returns driver object
		 */
		
		if(browser.equals("chrome")) {
			
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if(browser.equals("firefox")){
			
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		else if(browser.equals("IE")) {
			
			WebDriverManager.iedriver().setup();
			System.out.println("Launching IE..");
		}
		else {
			
			System.out.println("Please pass correct browser.. "+ browser);
		}
		
		return driver;
	}
	
	public void lauchURL(String url) {
		/**
		 * This method is used to launch URL
		 * @author sumitshivhare
		 * @params url
		 */
		System.out.println("Url = "+url);
		driver.get(url);
	}
	
	public void navigateToURL(String url) {
		/**
		 * This method is used to navigate to the URL
		 * @author sumitshivhare
		 * @params url
		 */
		driver.navigate().to(url);
	}
	
	public String getPageTitle() {
		/**
		 * This method returns page title
		 * @author sumitshivhare
		 * 
		 */
		return driver.getTitle();
	}
	
	public void quitBrowser() {
		/**
		 * This method is used to quit all browser tabs opened by driver for that particular click
		 * @author sumitshivhare
		 */
		driver.quit();
	}
	
	public void closeBrowser() {
		/**
		 * This method is used to quit current browser tab
		 * @author sumitshivhare
		 */
		driver.close();
	}
	

}
