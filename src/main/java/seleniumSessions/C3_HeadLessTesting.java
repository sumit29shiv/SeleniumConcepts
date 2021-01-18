package seleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class C3_HeadLessTesting {

	public static void main(String[] args) {
		
		//WebDriverManager.chromedriver().setup();
		WebDriverManager.firefoxdriver().setup();
		//ChromeOptions option = new ChromeOptions();
		//option.addArguments("--headless");
		
		
		FirefoxOptions option = new FirefoxOptions();
		option.addArguments("--headless");
		option.addArguments("--disable-notifications"); // to disable chrome notification
		
		//WebDriver driver = new ChromeDriver(option);
		WebDriver driver = new FirefoxDriver(option);
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
	

	}

}
