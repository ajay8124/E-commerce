package org.Ecommerce.testcases;

import java.util.concurrent.TimeUnit;

import org.Ecommerce.pageobjects.Baseclass;
import org.Ecommerce.pageobjects.Signuppage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC003_RegistrationPage extends Baseclass {
	WebDriver driver;

	@Test
	public void test() throws Exception {
		driver=new ChromeDriver();
		driver.get(URL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		Signuppage sp=new Signuppage(driver);
		sp.signinbutton();
		Thread.sleep(2000);
		sp.emailbutton("test@123456gmail.com");
		Thread.sleep(2000);
		sp.createaccount();
		Thread.sleep(2000);
		sp.radiobutton();
		Thread.sleep(2000);
		sp.Firstname("test");
		Thread.sleep(2000);
		sp.Lastname("test");
		Thread.sleep(2000);
		sp.password("test123");
		Thread.sleep(2000);
		sp.days();
		Thread.sleep(2000);
		sp.months();
		Thread.sleep(2000);
		sp.years();
		Thread.sleep(2000);
		sp.firstname("test");
		Thread.sleep(2000);
		sp.lastname("test");
		Thread.sleep(2000);
		sp.company("test");
		Thread.sleep(2000);
		sp.adress("test");
		Thread.sleep(2000);
		sp.city("test");
		Thread.sleep(2000);
		sp.state();
		Thread.sleep(2000);
		sp.zipcode("10000");
		Thread.sleep(2000);
			sp.country();
			sp.mobliephone("1234567890");
			Thread.sleep(2000);
			sp.myadress("test");
			Thread.sleep(2000);
			sp.registerbutton();
}
	
}
