package org.Ecommerce.testcases;

import java.util.concurrent.TimeUnit;

import org.Ecommerce.pageobjects.Baseclass;
import org.Ecommerce.pageobjects.Loginpage;
import org.Ecommerce.pageobjects.MyWishlist;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC007_Wishlist extends Baseclass{
	
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
		MyWishlist mw =new MyWishlist(driver);
		mw.mywishlist();
		Thread.sleep(2000);
		mw.name("test");
		Thread.sleep(2000);
		mw.save();
		Thread.sleep(2000);
		mw.Backaccount();
		
		}
			
		

}
