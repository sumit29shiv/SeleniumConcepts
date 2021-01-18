package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrangeHRMTest {

	public static void main(String[] args) throws InterruptedException {
		
		A6_BrowserUtils br = new A6_BrowserUtils();
		WebDriver driver = br.startBrowser("chrome");
		br.navigateToURL("https://www.orangehrm.com/orangehrm-30-day-trial/");
		Thread.sleep(3000);
		
		
	    //By locators
		By fName = By.id("Form_submitForm_FirstName");
		By lName = By.id("Form_submitForm_LastName");
		By email = By.id("Form_submitForm_Email");
		By jobTitle = By.id("Form_submitForm_JobTitle");
		By companyName = By.id("Form_submitForm_CompanyName");
		By phoneNum = By.id("Form_submitForm_Contact");
		By text = By.cssSelector(".description");
		
		
		A7_ElementUtils elUtil = new A7_ElementUtils(driver);
		elUtil.doSendKeys(fName, "Sumit");
		elUtil.doSendKeys(lName, "Shivhare");
		elUtil.doSendKeys(email,"test@gmail.com");
		elUtil.doSendKeys(jobTitle,"SQA");
		elUtil.doSendKeys(companyName,"wipro");
		boolean b =  elUtil.isElementDisplayed(phoneNum);
		if(b) {
			System.out.println("Element is visible");
			elUtil.doSendKeys(phoneNum, "9821114112");
		}
		else {
			System.out.println("Element is not visible");
		}
		
		String ele_text = elUtil.getElementText(text);
		System.out.println(ele_text);
		if(ele_text.contains("OrangeHRM trial.")) {
			System.out.println("Correct text");
		}
		else {
			System.out.println("Incorrect text");
		}
		
		
		
		br.closeBrowser();
		
		

	}

}
