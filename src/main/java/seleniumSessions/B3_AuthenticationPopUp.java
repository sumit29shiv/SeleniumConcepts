package seleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class B3_AuthenticationPopUp {

	public static void main(String[] args) {
		
		String uname = "admin";
		String pwd = "admin";
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		//driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		driver.get("https://"+uname+":"+pwd+"@"+"the-internet.herokuapp.com/basic_auth");

	}

}
