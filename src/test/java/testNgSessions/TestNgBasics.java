package testNgSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNgBasics {
	
	 // testNg-- testing new generation
	 // unit testing framework
	 // it is used to design maintain and run the testcases
	static WebDriver driver;
	
	@Test
	public void verifyPageTitleTest() {
		
		String title = driver.getTitle();
		Assert.assertEquals(title, "Free QA Automation Tools Tutorial for Beginners with Examples");
	}
	
	@BeforeMethod
	public void setUp() {
		String baseUrl = "https://www.toolsqa.com/";
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(baseUrl);
	}
	
	@AfterMethod
	public void closeURL() {
		driver.quit();
	}
}
