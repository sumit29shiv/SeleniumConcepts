package seleniumSessions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class C2_WindowHandlesConcept {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.popuptest.com/goodpopups.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("Main window title:"+driver.getTitle());
		driver.findElement(By.linkText("Good PopUp #1")).click();
		driver.findElement(By.linkText("Good PopUp #2")).click();
		driver.findElement(By.linkText("Good PopUp #3")).click();
		Set<String> setOfwinId = driver.getWindowHandles();
		List<String> listOfwinID = new ArrayList<String>(setOfwinId);
		System.out.println(listOfwinID);
		
		for(String e : listOfwinID) {
			System.out.println(e);
			
		}
		
		driver.switchTo().window(listOfwinID.get(1));
		System.out.println("Child window title:"+driver.getTitle());
		driver.close();
		
		driver.switchTo().window(listOfwinID.get(2));
		System.out.println("Child window title:"+driver.getTitle());
		driver.close();
		
		driver.switchTo().window(listOfwinID.get(3));
		System.out.println("Child window title:"+driver.getTitle());
		driver.close();
		
		driver.switchTo().window(listOfwinID.get(0));
		driver.close();

	}

}
