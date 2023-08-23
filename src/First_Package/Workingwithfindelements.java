package First_Package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.*;
import java.util.List;
import org.openqa.selenium.WebElement;

public class Workingwithfindelements {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		List <WebElement> links = driver.findElements(By.tagName("a"));
		int linkscount = links.size();
		System.out.println("links size"+linkscount);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
