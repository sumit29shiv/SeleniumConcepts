package practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ConfirmationAlert {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.toolsqa.com/handling-alerts-using-selenium-webdriver/");
		Thread.sleep(4000);
		WebElement ele = driver.findElement(By.xpath("//button[text()='Confirm Pop up']"));
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click()",ele);
		Alert a = driver.switchTo().alert();
		Thread.sleep(3000);
		if(a.getText().equals("Confirm Pop up")) {
			System.out.println("aleet text is correct");
		}
		else {
			System.out.println("alert text is incorrect");
		}
		Thread.sleep(3000);
		//a.accept();
		a.dismiss();
		System.out.println("Alert dismissed successfully");
		Thread.sleep(3000);
		driver.close();
		

	}

}
