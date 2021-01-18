package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FramePractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.globalsqa.com/demo-site/frames-and-windows/#iFrame");
		Thread.sleep(6000);
//		List<WebElement> eleTagFrame = driver.findElements(By.tagName("iframe"));
//		System.out.println(eleTagFrame.size());
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@name='globalSqa']")));
		Thread.sleep(6000);
		WebElement ele = driver.findElement(By.xpath("//span[text()='Tools & Trainings']"));
		System.out.println(ele.getText());
		
	}

}
