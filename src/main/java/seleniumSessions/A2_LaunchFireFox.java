package seleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class A2_LaunchFireFox {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","/Users/sumitshivhare/Tools/drivers/geckodriver");
		WebDriver driver = new FirefoxDriver ();
		driver.get("https://www.google.com");
	

	}

}
