package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A5_Locators {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://app.hubspot.com/login");
		Thread.sleep(5000);
		
		//1. id
		
		// 1st approach
//		driver.findElement(By.id("username")).sendKeys("sumit@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("12345");
		
//      2nd approach
//		WebElement email = driver.findElement(By.id("username"));
//		WebElement pwd =  driver.findElement(By.id("password"));
//		email.sendKeys("sumit@gmail.com");
//		pwd.sendKeys("12345");
		
		// 3rd apporoach(creating By locators)
//		By email = By.id("username");
//		By pwd = By.id("password");
		
//		WebElement email_ele = driver.findElement(email);
//		WebElement pwd_ele = driver.findElement(pwd);
//		
//		email_ele.sendKeys("sumit@gmail.com");
//		pwd_ele.sendKeys("12345");
		
		//4th approach
//		getElement(email).sendKeys("Sumit@gmail.com");
//		getElement(pwd).sendKeys("12345");
		
		//5th approach
//		doSendKeys(email, "sumit@gmail.com");
//		doSendKeys(pwd, "12345");
		
		//6th approach
		String email_id = "username";
		String pwd_id = "password";	
		
		doSendKeys(getLocator(email_id),"sumit@gmail.com");
		doSendKeys(getLocator(pwd_id), "123");
		}
	
	
		
		public static WebElement getElement(By locator) {
			return driver.findElement(locator);
		}
		
		public static void doSendKeys(By locator,String value) {
			getElement(locator).sendKeys(value);
		}
		
		public static void doClick(By locator) {
			getElement(locator).click();
		}
		
		public static By getLocator(String value) {
			return By.id(value);
		}
		
	
	

}
