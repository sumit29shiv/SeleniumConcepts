package seleniumSessions;


import org.openqa.selenium.support.ui.ExpectedConditions;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class A7_ElementUtils {
	
	WebDriver driver;
	
	public A7_ElementUtils(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}
	
	public void doSendKeys(By locator,String value) {
		getElement(locator).sendKeys(value);
	}
	
	public void doClick(By locator) {
		getElement(locator).click();
	}
	
	public By getLocator(String value) {
		return By.id(value);
	}
	
	public String getElementText(By locator) {
		return getElement(locator).getText();
	}
	
	public Boolean isElementDisplayed(By locator) {
		return getElement(locator ).isDisplayed();
		
	}
	
    public Integer getElementsCountUsingTagName(String tagName) {
    	return driver.findElements(By.tagName(tagName)).size();
    }
    
    public List<String> getAttributeList(String tagName, String attributeName) {
    	List<String> attributeList = new ArrayList<String>();
    	List<WebElement> elementList  = driver.findElements(By.tagName(tagName));
    	for(WebElement e: elementList) {
    		String attributeValue = e.getAttribute(attributeName);
    		attributeList.add(attributeValue);
    	}
    	return attributeList;
    
    }
	
    public void doClickFromList(By locator,String value) {
    	List<WebElement> LinkList = getElements(locator);
    	for(WebElement e : LinkList ) {
			String text = e.getText();
			//System.out.println(text);
			if(text.equals(value)) {
				e.click();
				System.out.println("clicked");
				break;
			}
			
		}
    	
    	
    }
   
    public void doSelectDropDownByVisibleText(By locator,String text) {
    	WebElement dropDown = getElement(locator);
		Select select = new Select(dropDown);
		select.selectByVisibleText(text);
    }
    
    public List<String> getdropDownOptionsValueFromSelectTag(By locator) {
    	List<String> optionsValueList = new ArrayList<String>();
    	Select select = new Select(getElement(locator));
    	List<WebElement> optionList = select.getOptions();
    	for(int i =0; i<optionList.size();i++) {
    		optionsValueList.add(optionList.get(i).getText());
    	
    }
		return optionsValueList;
    }
    
  //****************** Alert utils ************************
    public void acceptAlert() {
		driver.switchTo().alert().accept();
	}
    
	
	public void dismissAlert() {
		
		driver.switchTo().alert().dismiss();
		
	}
	
	
	public String getAlertText() {
		return driver.switchTo().alert().getText();
	}
	
	
	public void enterAlertText(String text) {
		driver.switchTo().alert().sendKeys(text);
	}
	
	
	public void uploadFile(By locator,String fileName) {
		getElement(locator).sendKeys(fileName);
		
		
	}
	
	//****************** Actions utils ************************
	public void doSenKeysUsingActionClass(By locator,String value) {
		Actions action = new Actions(driver);
		action.sendKeys(getElement(locator), value).perform();;
		
	}
	
	public void doClickUsingActionClass(By locator) {
		Actions action = new Actions(driver);
		action.click(getElement(locator)).perform();
	}
	
	public void doSendkeysUsingMoveToElement(By locator, String value) {
		Actions action = new Actions(driver);
		action.moveToElement(getElement(locator)).sendKeys(getElement(locator),value).build().perform();
		
		
	}
	
	public void doClickUsingMoveToElement(By locator) {
		Actions action = new Actions(driver);
		action.moveToElement(getElement(locator)).click(getElement(locator)).build().perform();
		
		
	}
	
	//****************** Wait utils ************************
	
	public WebElement waitForElementToBeLocated(By locator,int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver,timeOut);
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}
	
	public Boolean waitForTitleToBePresent(String titleValue, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver,timeOut);
		return wait.until(ExpectedConditions.titleIs(titleValue));
	}
	
	
}
