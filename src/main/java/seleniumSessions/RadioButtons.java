package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButtons {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
			
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		A7_ElementUtils util = new A7_ElementUtils(driver);
		driver.get("https://www.demoqa.com/radio-button");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//label[text()='Yes']")).click();
	}

}
