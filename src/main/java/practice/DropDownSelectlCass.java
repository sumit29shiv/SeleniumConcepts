package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownSelectlCass {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		WebElement ele_noOfEmp = driver.findElement(By.name("NoOfEmployees"));
		
		Select select = new Select(ele_noOfEmp);
		select.selectByIndex(6);
		Thread.sleep(3000);
		select.selectByValue("301 - 350");
		Thread.sleep(3000);
		select.selectByVisibleText("601 - 700");
		Thread.sleep(3000);
		driver.quit();
		

	}

}
