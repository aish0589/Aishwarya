package First_Package;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.*;


public class Windowhandles {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		
		//windowtab window,windowtype.tab ,window(windowtype,window)
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		
		
		driver.get("https://www.google.com/");	
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		
		
		driver.get("https://www.amazon.com/");
		
	//   Set<String>  windows = driver.getWindowHandles();
	   
	 //  System.out.println(windows.size());
	   
	  // driver.get("https://www.googgle.com/");
	   
	   driver.switchTo().newWindow(WindowType.WINDOW);
	   
	   driver.get("https://www.google.com/");
	  
	   
	   
	   
	   Set <String> windows = driver.getWindowHandles();
	   System.out.println(windows.size());
	   
	   
	   driver.quit();
	 
	}

}
