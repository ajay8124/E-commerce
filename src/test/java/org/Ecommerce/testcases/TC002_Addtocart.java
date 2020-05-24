package org.Ecommerce.testcases;

import java.util.concurrent.TimeUnit;

import org.Ecommerce.pageobjects.Addtocart;
import org.Ecommerce.pageobjects.Baseclass;
import org.Ecommerce.pageobjects.Searchpage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC002_Addtocart  extends Baseclass{
	
WebDriver driver;
	
	
	@Test
	public void test() throws Exception {
		driver=new ChromeDriver();
		driver.get(URL);
		Addtocart ac=new Addtocart(driver);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		ac.womentab();
		Thread.sleep(2000);
	ac.listbutton();
	Thread.sleep(2000);
	ac.sortby();
	Thread.sleep(2000);
	ac.addtocart();
	Thread.sleep(2000);
	ac.closewindow();
	Thread.sleep(4000);
	ac.slider();
	
}
}

