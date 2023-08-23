package First_Package;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;





public class Workingwithnavigatemethods {

	public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated method stub

		WebDriver driver  = new ChromeDriver();
		//main method = selenium
		//sub method = chrome webdriver , firefox webdriver ,opera webdriver,safariwebdriver,IEwebdri,edge driver
		driver.navigate().to("https://www.google.com//");
		Thread.sleep(2000);
		
		driver.navigate().to("https://www.facebook.com//");
		Thread.sleep(2000);
		driver.navigate().to("https://www.amazon.com//");
		
		driver.navigate().back();
		Thread.sleep(2000);
		
		driver.navigate().forward();
		
		driver.navigate().refresh();
		
		
		
		
		
		
		
		
		
		
	}

}
