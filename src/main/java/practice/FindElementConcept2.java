package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindElementConcept2 {
	
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		//WebElement email_text = driver.findElement(By.id("email"));
		//System.out.println(email_text.isDisplayed());
		
		By email_txt = (By.id("email"));
		By pwd_txt = (By.id("pass"));
		
		if(isElementDisplayed(email_txt)) {
			System.out.println("email field is visible");
			doSendKeys(email_txt, "test@gmail.com");
			
		}
		
		else {
			System.out.println("email field is not visible");
		}
		
		if(isElementDisplayed(pwd_txt)) {
			System.out.println("Password field is visible");
			doSendKeys(pwd_txt, "12345");
		}
		else {
			System.out.println("Password field is not visible");
		}
		
		

	}
	
	public static WebElement getElement(By locator) {
		
		return driver.findElement(locator);
	}
	
	public static boolean isElementDisplayed(By locator) {
		
		return getElement(locator).isDisplayed();
	}
	
	public static void doSendKeys(By locator,String value) {
		getElement(locator).sendKeys(value);
	}

}
