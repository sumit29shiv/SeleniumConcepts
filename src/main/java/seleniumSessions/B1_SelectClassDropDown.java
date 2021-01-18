package seleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class B1_SelectClassDropDown {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		By indus_dropdown = (By.id("Form_submitForm_Industry"));
		By country_dropdown = (By.id("Form_submitForm_Country"));
		
		A7_ElementUtils util = new A7_ElementUtils(driver);
		util.doSelectDropDownByVisibleText(indus_dropdown,"Education");
		util.doSelectDropDownByVisibleText(country_dropdown,"Barbados");
//		WebElement indus_dropDown = driver.findElement(By.id("Form_submitForm_Industry"));
//		Select select = new Select(indus_dropDown);
//		select.selectByVisibleText("Education");
//		select.selectByValue("media");
//		Thread.sleep(3000);
//		select.selectByIndex(13);
//		
//		List<WebElement> industryOptionsList = select.getOptions();
//		System.out.println("no of options: "+industryOptionsList.size());
//		for(int i=0;i<industryOptionsList.size();i++) {
//			String optionText = industryOptionsList.get(i).getText();
//			System.out.println(optionText);
//		}
		
		List<String> indus_dropDoen_value = util.getdropDownOptionsValueFromSelectTag(indus_dropdown);
		for(String e : indus_dropDoen_value) {
			System.out.println(e);
		}
		
		driver.close();
	
		
		
		
		
		
		

	}

}
