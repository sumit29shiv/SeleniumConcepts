package seleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A5_CrossBrowserTestingSwitchCase {

	public static void main(String[] args) {
		
		String chromeDriverPath = "/Users/sumitshivhare/Tools/drivers/chromedriver";
		String firefoxDriverPath = "/Users/sumitshivhare/Tools/drivers/geckodriver";
		WebDriver driver = null;
		String browser = "firefox";
		
		switch (browser) {
		case "chrome":
			//WebDriverManager.chromedriver().setup();
			System.setProperty("webdriver.chrome.driver",chromeDriverPath);
			driver = new ChromeDriver();
			break;
		
		case "firefox":
			//WebDriverManager.firefoxdriver().setup();
			System.setProperty("webdriver.gecko.driver",firefoxDriverPath);
			driver = new FirefoxDriver();
			break;
			
		case "safari":
			WebDriverManager.chromedriver().setup();
			driver = new SafariDriver();
			break;
			
		default:
			System.out.println("Please use correct browser.."+ browser);
			break;
		}
		
		driver.get("https://www.google.com");
		String title = driver.getTitle();
		System.out.println("Title is: "+ title);
		driver.quit();

	}

}
