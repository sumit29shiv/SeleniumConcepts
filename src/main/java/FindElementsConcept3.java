import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;


public class FindElementsConcept3 {
	
	static WebDriver driver;
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
		By langLink = By.xpath("//div[@id='SIvCob']/a");
		
		List<WebElement> langLinkList  = driver.findElements(langLink);
		for(int i =0; i<langLinkList.size();i++) {
			String text = (langLinkList.get(i).getText());
			if(text.equals("ગુજરાતી")) {
				langLinkList.get(i).click();
				break;
			}
			
		
		}
		
		List<String> listOflinkText =  getElementsText(langLink);
		System.out.println(listOflinkText);
		}
	
	

	
	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}
	
	public static List<String> getElementsText(By locator) {
		List<String> listOFValues = new ArrayList<String>();
		List<WebElement> listOfElements = getElements(locator);
		for(int i=0;i<listOfElements.size();i++) {
			String text = listOfElements.get(i).getText();
			listOFValues.add(text);
		}
		return listOFValues;
	}
	
	public static WebElement getElement(By locator) {
			return driver.findElement(locator);
		}
	
	public static void doClick(By locator) {
		getElement(locator).click();
	}

}
