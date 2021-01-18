package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindElementsConcept {
	
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Number of links on WebPage: "+links.size());
		for(int i=0; i<links.size(); i++) {
			String text = links.get(i).getText();
			if(! text.isEmpty()) {
				System.out.println(i+"----> "+text);
			}
		}
		driver.quit();
		

	}
	
public static WebElement getElement(By locator) {
		
		return driver.findElement(locator);
		
	}
	
	public static String getElementText(By locator) {
		
		return getElement(locator).getText();
		
	}
	
public static boolean isElementDisplayed(By locator) {
		
		return getElement(locator).isDisplayed();
	}
	
	public static void doSendKeys(By locator,String value) {
		
		getElement(locator).sendKeys(value);
	}
	


}
