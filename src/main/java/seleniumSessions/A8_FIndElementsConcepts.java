package seleniumSessions;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class A8_FIndElementsConcepts {

	public static void main(String[] args) {
		
		A6_BrowserUtils br = new A6_BrowserUtils();
		WebDriver driver = br.startBrowser("chrome");
		br.navigateToURL("https://www.amazon.in/");
		
		
		//get total no. of links on the webpage
		List <WebElement> linkList  =  driver.findElements(By.tagName("a"));
		System.out.println("Total no of links on page: "+linkList.size());
		
		// get text from each link
		// ignoring blank text in hyperlink
		for (int i=0;i<linkList.size();i++) {
			String text = linkList.get(i).getText();
			if(!text.isEmpty()) {
			System.out.println(i+"--> "+text);
		}
		}
		br.quitBrowser();

	}

}
