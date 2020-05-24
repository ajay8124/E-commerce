package org.Ecommerce.pageobjects;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class Baseclass {
	
	WebDriver driver;
public static String URL ="http://automationpractice.com/index.php" ;
public static String Emailid="test@123gmail.com";
public static String password="test123";

	
	@BeforeClass
	public void launchbrowser() {
		driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","D:\\APTITUDE\\chromedriver.exe");
		Logger logger=Logger.getLogger("E-commerce");
		 PropertyConfigurator.configure("Log4j.properties");
		 driver.get(URL);
		 
		 
		
		
	}
	
	
	public void teardwon()
	{
			
			driver.quit();
			}
	}


