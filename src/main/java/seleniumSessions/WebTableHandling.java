package seleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTableHandling {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/WebTable.html");
		//List<WebElement> rowValues = driver.findElements(By.xpath("//div[@class='ui-grid-canvas']/div"));
		List<WebElement> columnValues = driver.findElements(By.xpath("//div[@role='button']/span[contains(@class,'ui-grid-header-cell-label')]"));
		
		for (int i=0;i<columnValues.size();i++) {
			
			System.out.println(columnValues.get(i).getText());
		}
		
		Thread.sleep(3000);

	}

}
