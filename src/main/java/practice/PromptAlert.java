package practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PromptAlert {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.toolsqa.com/handling-alerts-using-selenium-webdriver/");
		WebElement ele = driver.findElement(By.xpath("//button[text()='Prompt Pop up']"));
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click()",ele);
		
		Alert a  = driver.switchTo().alert();
		System.out.println(a.getText());
		
		a.sendKeys("Hello sumit bhai");
		Thread.sleep(3000);
		a.accept();
		driver.findElement(By.xpath("(//span/span[text()='Blogs'])[1]")).click();
		driver.close();
		
		

	}

}
