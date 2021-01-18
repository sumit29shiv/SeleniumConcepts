package seleniumSessions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class C1_JqueryDropDownConcept {
	
	static final String allValueOption = "all";
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		driver.findElement(By.id("justAnInputBox")).click();
		Thread.sleep(3000);
//		List<WebElement> ele_dropDown = driver.findElements(By.xpath("//span[@class='comboTreeItemTitle']"));
//		System.out.println(ele_dropDown.size());
//		for(WebElement e: ele_dropDown) {
//			String value  = e.getText();
//			if (value.equals("choice 2")){
//				e.click();
//			}
//		}
		
		By dropDownButton = (By.xpath("//span[@class='comboTreeItemTitle']"));
		//selectValueFromDropDown(dropDownButton,"choice 4");
		//selectValueFromDropDown(dropDownButton,"choice 2 1");
		//selectValueFromDropDown(dropDownButton,"choice 6 2 2");
		//ArrayList<String> choice = new ArrayList<String>();
		//ArrayList<String> choice = new ArrayList<String>(Arrays.asList("choice 2","choice 6 2 2"));
		ArrayList<String> choice = new ArrayList<String>(Arrays.asList(allValueOption));
//		choice.add("choice 2");
//		choice.add("choice 6 2 2");
		
		selectValueFromDropDown(dropDownButton,choice);
		System.exit(0);
		
		

	}
	
	
	public static void  selectValueFromDropDown(By locator, ArrayList<String> value) {
		List<WebElement> ele_dropDown = driver.findElements(locator);
		System.out.println("no of choices: "+ele_dropDown.size());
		
		if(! value.get(0).equalsIgnoreCase("all")) {
					for(WebElement e: ele_dropDown) {
						String text  = e.getText();
						for(int i = 0;i<value.size();i++) {
							if(text.equals(value.get(i))) {
								e.click();
								break;
				}// if condiiton
			}// inner for loop

	       }// outer for loop
		}else {
			try {
				for(WebElement e: ele_dropDown) {
					e.click();
				}
			}
			catch (Exception e){
			
				
			}
			
			
		}// drop down method
		
	} // main method
}//class

	
	
			
	
		


