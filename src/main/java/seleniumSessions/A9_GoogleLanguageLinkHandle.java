package seleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A9_GoogleLanguageLinkHandle {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		By langLink =  By.xpath("//div[@id='SIvCob']/a");
		A7_ElementUtils util = new A7_ElementUtils(driver);
		util.doClickFromList(langLink, "தமிழ்");
		
//		List<WebElement> langLink = driver.findElements(By.xpath("//div[@id='SIvCob']/a"));
//		
//		for(WebElement e : langLink ) {
//			String text = e.getText();
//			System.out.println(text);
//			if(text.equals("मराठी")) {
//				e.click();
//				System.out.println("clicked");
//				break;
//			}
//			
//		}

	}

}
