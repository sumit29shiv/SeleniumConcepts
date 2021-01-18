package seleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class C4_ScrollUP_ScrollDown_ScrollintoView {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
		driver.get("http://classic.crmpro.com/");
		Thread.sleep(4000);
		JavaScriptUtil js = new JavaScriptUtil(driver);
		//js.scrollPageDown();
		//js.scrollPageDown("400");
		//js.scrollPageUp();
		WebElement alertele = driver.findElement(By.xpath("//h3[contains(text(),'Task & Event')]"));
		js.scrollIntoView(alertele);

	}

}
