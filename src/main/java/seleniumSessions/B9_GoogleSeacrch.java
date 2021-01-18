package seleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class B9_GoogleSeacrch {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Naveen Automation Labs");
		Thread.sleep(5000);
		List<WebElement> optionList = driver.findElements(By.xpath("//ul//div[@class='sbl1']"));
		
		for(int i = 0;i<optionList.size();i++) {
			String text = optionList.get(i).getText();
			System.out.println(text);
		
	}
		
		driver.quit();
	
	}
		
	
		

}
