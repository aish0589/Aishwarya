package First_Package;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;

import org.openqa.selenium.chrome.*;
class Managemethod
{

public static void main(String[] args) throws Exception 
	{
		
		
		WebDriver  driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		driver.manage().window().minimize();
		
		Thread.sleep(1000);
		
		
	}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

