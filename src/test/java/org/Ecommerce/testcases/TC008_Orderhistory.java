package org.Ecommerce.testcases;

import java.util.concurrent.TimeUnit;

import org.Ecommerce.pageobjects.Baseclass;
import org.Ecommerce.pageobjects.Loginpage;
import org.Ecommerce.pageobjects.Orderhistory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC008_Orderhistory extends Baseclass{
	
	WebDriver driver;

	@Test
	public void test() throws Exception {
		driver=new ChromeDriver();
		driver.get(URL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		Loginpage lp=new Loginpage(driver);
		lp.signin();
		Thread.sleep(2000);
		lp.emaid("test@12345gmail.com");
		Thread.sleep(2000);
		lp.password("test123");
		Thread.sleep(2000);
		lp.signinbutton();
		Orderhistory oh=new Orderhistory(driver);
		oh.orderhistory();
		Thread.sleep(2000);
		oh.orderRef();
		Thread.sleep(2000);
		oh.chooseproduct();
		Thread.sleep(2000);
		oh.textarea("test");
		Thread.sleep(2000);
		oh.sendbutton();
		Thread.sleep(2000);
		oh.backtoaccont();
		
		
			
		}
			
		}


