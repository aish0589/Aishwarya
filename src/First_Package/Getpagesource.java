package First_Package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;	

public class Getpagesource {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		String pagesource = driver.getPageSource();
		
		
		System.out.println("driver pagesource"+pagesource);
		
		
		
		
		
		
		
		
		
		
	}

}
