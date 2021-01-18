package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindElementConcept {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.freshworks.com/");
//		String h1_text = driver.findElement(By.tagName("h1")).getText();
//		System.out.println(h1_text);
		
		By heading = (By.tagName("h1"));
		By h2Tag = (By.tagName("h2"));
		
		String header_text = getElementText(heading);
		System.out.println(header_text);
		System.out.println(getElementText(h2Tag));
		driver.close();
		
		

	}
	
	public static WebElement getElement(By locator) {
		
		return driver.findElement(locator);
		
	}
	
	public static String getElementText(By locator) {
		
		return getElement(locator).getText();
		
	}

}
