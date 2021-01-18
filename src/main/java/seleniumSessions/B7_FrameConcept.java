package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class B7_FrameConcept {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.londonfreelance.org/courses/frames/index.html");
		//driver.switchTo().frame("main");
		//driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='main']")));
		driver.switchTo().frame(4);
		//driver.switchTo().parentFrame()
		WebElement ele_h2 = driver.findElement(By.tagName("h2"));
		String text = ele_h2.getText();
		System.out.println(text);
		driver.switchTo().defaultContent();
		
		

	}

}
