package seleniumSessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class B2_AlertConcept {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(3000);
		
		// switch to alert
		Alert alert = driver.switchTo().alert();
		String alertText = alert.getText();
		if(alertText.equals("Please enter valid user name")) {
			System.out.println("Correct alert text");
		}
		else {
			System.out.println("Incorrect alert text");
		}
		//accept alert
		alert.accept();
		//alert.dismiss(); dismiss the alert
		System.out.println("Alert accepted");
		driver.switchTo().defaultContent();// come back to html dom
		driver.close();


	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void acceptAlert() {
		driver.switchTo().alert().accept();
	}
	
	public static void dismissAlert() {
		
		driver.switchTo().alert().dismiss();
		
	}
	
	public static String getAlertText() {
		return driver.switchTo().alert().getText();
	}
	
	public static void enterValueInAlert(String text) {
		
		driver.switchTo().alert().sendKeys(text);
	}
	
	public static void uploadFile(By locator,String fileName) {
		getElement(locator).sendKeys(fileName);
		
		}
	
	

}
