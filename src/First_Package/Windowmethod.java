package First_Package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.*;

public class Windowmethod {

	public static void main(String[] args) throws Exception
	{
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		Thread.sleep(2000);
		
		
		
		
		driver.switchTo().newWindow(WindowType.TAB);
		
		
		driver.get("https://www.myntra.com");
		
		
		driver.switchTo().newWindow(WindowType.TAB);
		
		Thread.sleep(2000);
		
		
				
				
				
	}}