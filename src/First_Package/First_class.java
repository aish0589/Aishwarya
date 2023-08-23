package First_Package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class First_class {

	public static void main(String[] args)throws Exception
	{
		
		WebDriver driver  = new ChromeDriver();
		//main method = selenium
		//sub method = chrome webdriver , firefox webdriver ,opera webdriver,safariwebdriver,IEwebdri,edge driver
		driver.get("https://www.google.com//");
		Thread.sleep(2000);
		System.out.println("pgm pushed github");
		driver.navigate().to("https://www.facebook.com//");
		//Thread.sleep(2000);
		driver.get("https://www.facebook.com//");
	
		

	}

}
