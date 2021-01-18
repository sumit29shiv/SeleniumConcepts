package seleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A1_WebDriverBasics {

	public static void main(String[] args) {
		
		String chromeDriverPath = "/Users/sumitshivhare/Tools/drivers/chromedriver";
		
		
		System.setProperty("webdriver.chrome.driver",chromeDriverPath);
		
		// open chrome browser
		WebDriver driver = new ChromeDriver();
		
		//launch the URL
		driver.get("http://www.google.com");
		
		//get the title
		String title = driver.getTitle();
		
		//print the title
		System.out.println("Page title is: "+title);
		
		//title validation//check points
		if (title.equals("Google")){
			
			System.out.println("Correct title");
		}
		
		else {
			System.out.println("In correct title");
		}
		
		// get current URL
		String currentURL = driver.getCurrentUrl();
		System.out.println(currentURL);
		
		
		//title validation//check points
		if (currentURL.contains("google")) {
			System.out.println("found the desired text");
		}
		else {
			System.out.println("Did not found desired text");
		}
		
		//get page source
		//String pageSource = driver.getPageSource();
		//System.out.println(pageSource);
		
		
		// quit the browser
		driver.quit();

	}

}
