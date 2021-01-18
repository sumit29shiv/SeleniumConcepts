package seleniumSessions;

public class A6_LoginPageMain {

	public static void main(String[] args) {
		
		A6_BrowserUtils br = new A6_BrowserUtils();
		br.startBrowser("chrome");
		br.lauchURL("http://google.com");
		String title = br.getPageTitle();
		System.out.println("Page title is: "+title);
		
		if(title.equals("Google")) {
			System.out.println("Correct title");
		}
		else {
			System.out.println("Incorrect title");
		}
		
		br.closeBrowser();
		

	}

}
