package practice;



import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertPractice {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.toolsqa.com/handling-alerts-using-selenium-webdriver/");
		Thread.sleep(3000);
		WebElement simpleAlert = driver.findElement(By.xpath("//button[text()='Simple Alert']"));
		//simpleAlert.click();
		//Actions action = new Actions(driver);
		//action.click(simpleAlert).build().perform();
		//action.moveToElement(simpleAlert).click(simpleAlert).build().perform();
		//Thread.sleep(6000);
		//driver.quit();
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click()",simpleAlert);
		Alert a = driver.switchTo().alert();
		
		//alert text verification
		if(a.getText().contains("simple Alert")) {
			System.out.println("Alert text is correct");
		}
		else {
			System.out.println("Alert text is incorrect ");
		}
		Thread.sleep(3000);
		a.accept();
		Thread.sleep(6000);
		driver.quit();

	}

}
