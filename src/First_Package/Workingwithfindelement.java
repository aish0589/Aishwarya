package First_Package;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Workingwithfindelement  {

	public static void main(String[] args) throws Exception
		{
		// TODO Auto-generated method stub
       WebDriver  driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/register/");
	WebElement firstname = driver.findElement(By.id("FirstName"));
		//WebElement firstname = driver.findElement(By.id("register-button"));
	//	firstname.submit();
		
		
		firstname.sendKeys("aishwarya");
		Thread.sleep(2000);
		firstname.clear();
		Thread.sleep(2000);
		firstname.sendKeys("aishwaryasingh");
		driver.findElement(By.id("gender-female")).click();
		
	//WebElement firstname = driver.findElement.(By.id("firstname"));
		//lastname
		Thread.sleep(2000);
		//lastname
		driver.findElement(By.id("LastName")).sendKeys("manchikalapad");
		//email
		driver.findElement(By.id("Email")).sendKeys("aishwaryasingh999.com");
		//password
		driver.findElement(By.id("Password")).sendKeys("ajay@123");
		
		driver.findElement(By.id("ConfirmPassword")).sendKeys("ajay@123");
		
		Thread.sleep(2000);
		//driver.findElement(By.id("register-button")).submit();
		
		WebElement registerbutton1 = driver.findElement(By.id("register-button"));
		registerbutton1.submit();
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
