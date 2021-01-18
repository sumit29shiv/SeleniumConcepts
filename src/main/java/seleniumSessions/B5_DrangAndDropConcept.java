package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class B5_DrangAndDropConcept {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/drag-and-drop-demo.html");
		WebElement ele_source = driver.findElement(By.xpath("//span[contains(text(),'Draggable 1')]"));
		WebElement ele_target = driver.findElement(By.id("mydropzone"));
		
		Actions act = new Actions(driver);
		Thread.sleep(5000);
//		act.clickAndHold(ele_source)
//		.moveToElement(ele_target)
//		.release()
//		.build()
//		.perform();
		act.dragAndDrop(ele_source, ele_target).perform();

	}

}
