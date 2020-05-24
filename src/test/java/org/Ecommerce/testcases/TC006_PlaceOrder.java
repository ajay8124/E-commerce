package org.Ecommerce.testcases;

import java.util.concurrent.TimeUnit;

import org.Ecommerce.pageobjects.Addtocart;
import org.Ecommerce.pageobjects.Baseclass;
import org.Ecommerce.pageobjects.Loginpage;
import org.Ecommerce.pageobjects.OrderProduct;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC006_PlaceOrder extends Baseclass{
	
	WebDriver driver;

	@Test
	public void test() throws Exception {
		driver=new ChromeDriver();
		driver.get(URL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		Addtocart ac=new Addtocart(driver);
		ac.womentab();
		Thread.sleep(2000);
		ac.listbutton();
		Thread.sleep(2000);
		OrderProduct op =new OrderProduct(driver);
		op.morebutton();
		Thread.sleep(2000);
		op.plusicon();
		Thread.sleep(2000);
		op.size();
		Thread.sleep(2000);
		op.color();
		Thread.sleep(2000);
		op.addtocart();
		Thread.sleep(2000);
		op.checkout();
		Thread.sleep(2000);
		op.proccedtocheckout();
		Thread.sleep(2000);
		Loginpage lp=new Loginpage(driver);
		lp.emaid("test@123456gmail.com");
		Thread.sleep(2000);
		lp.password("test123");
		Thread.sleep(2000);
		lp.signinbutton();
		op.proceedtocheckout3();
		Thread.sleep(2000);
		op.checkbox();
		Thread.sleep(2000);
		op.proceedtocheckout4();
		Thread.sleep(2000);
		op.paybywire();
		Thread.sleep(2000);
		op.confirmorder();
		
		

}
	}
