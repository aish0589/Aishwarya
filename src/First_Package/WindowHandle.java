package First_Package;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.WindowType;


public class WindowHandle 
{

	public static void main(String[] args)
	{
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
		
	String window =driver.getWindowHandle();		
		
		
		System.out.println(window);
		
		driver.get("https://www.facebook.com");
		
		
	String window2 = driver.getWindowHandle();
	
	System.out.println(window2);
	
      driver.get("https://www.face.com/");
      
      String window4 = driver.getWindowHandle();
		
		System.out.println(" jjjjj"+window4);
		
		
		
		
		
		
		
		
		
		
		

	}

}
