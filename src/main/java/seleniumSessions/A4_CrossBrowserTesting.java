package seleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A4_CrossBrowserTesting {
	
	static WebDriver driver; // this line or 15th line

	public static void main(String[] args) {
		
		//WebDriver driver = null;
		String browser = "firefox";
		
		if(browser.equals("chrome")) {
			
			
			WebDriverManager.chromedriver().setup();
			System.out.println("Launcing Chrome Browser..");
			driver = new ChromeDriver();
		}
		else if(browser.equals("firefox")){
			
			WebDriverManager.firefoxdriver().setup();
			System.out.println("Launcing FireFox Browser..");
			driver = new FirefoxDriver();
		}
		else if(browser.equals("IE")) {
			
			WebDriverManager.iedriver().setup();
			System.out.println("Launcing IE Browser..");
			System.out.println("Launching IE..");
		}
		else {
			
			System.out.println("Please pass correct browser.. "+ browser);
		}
		
		driver.get("https://www.google.com");
		String title = driver.getTitle();
		System.out.println("Title is"+" "+title);
		driver.quit();
		
			

	}

}
