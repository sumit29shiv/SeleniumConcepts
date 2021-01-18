package seleniumSessions;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A9_FindElementsTotalnumberOfImages {

	public static void main(String[] args) {
		
		WebDriver driver = null;
		
	
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		//List <WebElement> imgList = driver.findElements(By.tagName("img"));
		A7_ElementUtils util = new A7_ElementUtils(driver);
//		int noOfImages = util.getElementsCountUsingTagName("img");
//		System.out.println("Total no. images on page: "+noOfImages);
//		//System.out.println("List of links: "+util.getAttributeList("img", "src"));
//		List<String> linkList = util.getAttributeList("img","src");
//		
//		for(int i=0;i<linkList.size();i++) {
//			System.out.println(linkList.get(i));
//		}
//		
		System.out.println("Total no. of links on page: "+util.getElementsCountUsingTagName("a"));
		List<String> listOfLink = util.getAttributeList("a","href");
		for(String e: listOfLink) {
			System.out.println(e);
		}
		
		
		
		
//	for(int i=0; i<imgList.size();i++) {
//		String src = imgList.get(i).getAttribute("src");
//			System.out.println(src);
//		}
		
		
	
		

	}

}
