package seleniumSessions;



import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class B6_RightClickConcept {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		Actions a = new Actions(driver);
		a.contextClick(driver.findElement(By.xpath("//span[text()='right click me']")))
		.perform();
		
		List<WebElement> optionEle = driver.findElements(By.xpath("//ul/li[contains(@class,'context-menu-item context-menu-icon')]"));
		for(int i =0;i<optionEle.size();i++) {
			
			String txt = optionEle.get(i).getText();
			System.out.println(txt);
			if(txt.equals("Paste")) {
				optionEle.get(i).click();
				break;
			}
		}
		
		Alert alert = driver.switchTo().alert();
		String alerttext = alert.getText();
		System.out.println(alerttext);
		alert.accept();
		
		

	}

}
