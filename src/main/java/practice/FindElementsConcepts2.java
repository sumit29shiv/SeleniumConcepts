package practice;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindElementsConcepts2 {
	
	static WebDriver driver;
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		
		//List<WebElement> ele_imagesList = driver.findElements(By.tagName("img"));
		//System.out.println("Total no of images on page: "+ele_imagesList.size());
		System.out.println("Number of images: "+getElementsCount("img"));
		System.out.println("Number of links: "+getElementsCount("a"));
		System.out.println("Number of input field: "+getElementsCount("input"));
		
		By link = (By.tagName("a"));
		
		System.out.println("<---------------------->");
		List<String> srcList = getAttributeList("img","src");
		for(String e: srcList) {
			System.out.println(e);
		}
		
		System.out.println("<---------------------->");
		List<String>hrefValueList  = getAttributeList("a", "href");
		for(String e: hrefValueList) {
			String text = e;
			System.out.println(text);
		}
		
		

		
		
//		for(WebElement e : ele_imagesList) {
//			
//			String atr_src = e.getAttribute("src");
//			System.out.println(atr_src);
//			
//		}
		
	}
	
	public static WebElement getElement(By locator) {
		
		return driver.findElement(locator);
		
	}
	
	public static String getElementText(By locator) {
		
		return getElement(locator).getText();
		
	}
	
	public static boolean isElementDisplayed(By locator) {
		
		return getElement(locator).isDisplayed();
	}
	
	public static void doSendKeys(By locator,String value) {
		
		getElement(locator).sendKeys(value);
	}
	
	public static int getElementsCount(String tagName) {
		
		return driver.findElements(By.tagName(tagName)).size();
	}
	
	public static List<WebElement> getElements(By locator) {
		 return driver.findElements(locator);
	}
	
	public static List<String> getAttributeList(String tagName,String attributeName) {
		
		List<String> attributeList = new ArrayList<String>();
		List<WebElement> eleList = driver.findElements(By.tagName(tagName));
		for(int i=0;i<eleList.size();i++) {
			String value = eleList.get(i).getAttribute(attributeName);
			attributeList.add(value);
		}
		return attributeList;
		
	}
	
	public static void getElementsText(String tagName) {
		
	}
	


}
