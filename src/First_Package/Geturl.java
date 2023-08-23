package First_Package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Geturl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver  = new ChromeDriver();
		//main method = selenium
		driver.get("https://www.google.com//");
		//sub method = chrome webdriver , firefox webdriver ,opera webdriver,safariwebdriver,IEwebdri,edge driver
	       String Geturl = driver.getCurrentUrl();
	       
	       System.out.println("get current url "+Geturl);
	       
	
	       
	
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
