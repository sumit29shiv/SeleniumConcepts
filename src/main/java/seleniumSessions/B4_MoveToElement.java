package seleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class B4_MoveToElement {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		Thread.sleep(4000);
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//WebElement login = driver.findElement(By.id("ctl00_HyperLinkLogin"));
		//WebElement spicClubMem = driver.findElement(By.xpath("//a[contains(text(),'SpiceClub Members')]"));
		//WebElement login_mem = driver.findElement(By.linkText("Member Login"));
		//WebElement login_mem = driver.findElement(By.xpath("//a[contains(text(,'Member Login')]"));
		//Actions act = new Actions(driver);
		//Thread.sleep(4000);
		//act.moveToElement(login).moveToElement(spicClubMem).build().perform();
		//Thread.sleep(4000);
	   // driver.findElement(By.xpath("//a[contains(text(),'Member Login')]")).click();
	    //driver.findElement(By.linkText("Member Login")).click();
		
		By login = By.id("ctl00_HyperLinkLogin");
		By spicClubMem = By.xpath("//a[contains(text(),'SpiceClub Members')]");
		mouseOverToElement(login);
		mouseOverToElement(spicClubMem);;
		
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void mouseOverToElement(By locator) throws InterruptedException {
		Actions act = new Actions(driver);
		Thread.sleep(4000);
		act.moveToElement(getElement(locator));
		
	}

}
