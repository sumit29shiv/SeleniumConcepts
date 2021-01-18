package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutosuggestiveDropDown {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		
		Thread.sleep(5000);
		//from
		WebElement from = driver.findElement(By.xpath("//span[text()='From']"));
		//from.click();
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click()",from);
		Thread.sleep(3000);
		WebElement fromTextBox = driver.findElement(By.xpath("//input[@placeholder='From']"));
		fromTextBox.clear();
		fromTextBox.sendKeys("Pune");
		Thread.sleep(3000);
		
		
		fromTextBox.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(3000);
		fromTextBox.sendKeys(Keys.ENTER);
		
		
		// to
		WebElement toTextBox = driver.findElement(By.xpath("//input[@placeholder='To']"));
		toTextBox.clear();
		toTextBox.sendKeys("Benguluru");
		Thread.sleep(3000);
		toTextBox.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(3000);
		toTextBox.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		System.out.println("Success");
		driver.close();
		
		
		
		/**
		WebElement pune = driver.findElement(By.xpath("//div[text()='PNQ']"));
		Actions action = new Actions(driver);
		Thread.sleep(3000);
		action.moveToElement(pune).build().perform();
		Thread.sleep(3000);
		action.click(pune);
		
		**/
		
	

	}

}
