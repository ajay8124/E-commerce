package org.Ecommerce.testcases;

import java.util.concurrent.TimeUnit;

import org.Ecommerce.pageobjects.Baseclass;
import org.Ecommerce.pageobjects.Forgotpassword;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC005_Forgotpassword extends Baseclass {
	WebDriver driver;

	@Test
	public void test() throws Exception {
		driver=new ChromeDriver();
		driver.get(URL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		Forgotpassword fp=new Forgotpassword(driver);
		fp.signin();
		Thread.sleep(2000);
				fp.forgotpassword();
				Thread.sleep(2000);
				fp.eamiladress("test@12345gmail.com");
				Thread.sleep(2000);
				fp.repassword();
				
}
}
