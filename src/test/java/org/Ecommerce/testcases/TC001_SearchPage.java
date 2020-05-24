package org.Ecommerce.testcases;

import java.util.concurrent.TimeUnit;

import org.Ecommerce.pageobjects.Baseclass;
import org.Ecommerce.pageobjects.Searchpage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC001_SearchPage  extends Baseclass{

	WebDriver driver;
	
	
	@Test
	public void test() throws Exception {
		driver=new ChromeDriver();
		driver.get(URL);
		Searchpage SP=new Searchpage(driver);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		SP.searchbutton("dress");
		Thread.sleep(3000);
		SP.searchicon();
		Thread.sleep(3000);
		SP.sortbutton();
		
		
	}
}
