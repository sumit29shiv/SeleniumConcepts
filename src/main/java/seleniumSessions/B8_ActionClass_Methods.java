package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class B8_ActionClass_Methods {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		// click and send keys using action class
		
    	WebElement emailEle = driver.findElement(By.id("email"));
//		//emailEle.clear();
//		WebElement pwdEle = driver.findElement(By.name("pass"));
//		//pwdEle.clear();
//		WebElement loginEle = driver.findElement(By.name("login"));
		Actions action = new Actions(driver);
//		action.sendKeys(emailEle,"sumit.shivhare29@gmail.com").perform();
//		action.sendKeys(pwdEle,"12345").perform();
//		action.click(loginEle).perform();
		
		// using generic method
//		By email = (By.id("email"));
//		By pwd = (By.name("pass"));
//		By login = (By.name("login"));
//		
//		doSenKeysUsingActionClass(email,"sumit@gmail.com");
//		doSenKeysUsingActionClass(pwd,"12345");
//		doClickUsingActionClass(login);
		action.moveToElement(emailEle).sendKeys(emailEle,"Hello").build().perform();
		
		

	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void doSenKeysUsingActionClass(By locator,String value) {
		
		Actions action = new Actions(driver);
		action.sendKeys(getElement(locator), value).perform();;
		
	}
	
	public static void doClickUsingActionClass(By locator) {
		Actions action = new Actions(driver);
		action.click(getElement(locator)).perform();
	}
	
	public static void doSendkeysUsingMoveToElement(By locator, String value) {
		Actions action = new Actions(driver);
		action.moveToElement(getElement(locator)).sendKeys(getElement(locator),value).build().perform();
		
		
	}
	
	public static void doClickUsingMoveToElement(By locator) {
		Actions action = new Actions(driver);
		action.moveToElement(getElement(locator)).click(getElement(locator)).build().perform();
		
		
	}

}
