package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class B3_FileUploadPopUp {
	
	static WebDriver driver;

	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/howto/howto_html_file_upload_button.asp");
		//WebElement ele_chosseFile = driver.findElement(By.id("myFile"));
		
		By file = By.id("myFile");
		
		// this concept work when HTML attribute contains type=file
		//ele_chosseFile.sendKeys("/Users/sumitshivhare/Desktop/Untitled Document.pdf"); 
		uploadFile(file,"/Users/sumitshivhare/Desktop/Untitled Document.pdf");

	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void uploadFile(By locator,String fileName) {
		getElement(locator).sendKeys(fileName);
		
		}

}
