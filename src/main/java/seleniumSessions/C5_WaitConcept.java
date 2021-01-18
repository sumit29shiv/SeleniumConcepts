package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class C5_WaitConcept {
	
	public static void main(String[] args) {
		
	
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		A7_ElementUtils util = new A7_ElementUtils(driver);
		driver.get("https://app.hubspot.com/login");
		 By uname = (By.id("username"));
		 By pwd = (By.id("password"));
		 By signUp = (By.linkText("Sign up"));
		 
		 //WebDriverWait wait = new WebDriverWait(driver,10);
		 //WebElement ele_uname = wait.until(ExpectedConditions.presenceOfElementLocated(uname));
		 //ele_uname.sendKeys("test@gmail.com");
		 //driver.findElement(pwd).sendKeys("12345");
		 util.waitForElementToBeLocated(uname,10).sendKeys("test@gmail.com");
		 driver.findElement(pwd).sendKeys("12345");
		 util.waitForElementToBeLocated(signUp,5).click();
		 
	}	

}
