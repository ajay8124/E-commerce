package org.Ecommerce.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyWishlist {
	
	WebDriver driver;

	public MyWishlist(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@id=\"center_column\"]/div/div[2]/ul/li/a")
	WebElement mywishlist; 

	@FindBy(xpath="//*[@id=\"name\"]")
	WebElement name;
	
	@FindBy(xpath="//*[@id=\"submitWishlist\"]")
	WebElement savebutton;
	
	@FindBy(xpath="//*[@id=\"mywishlist\"]/ul/li[1]/a")
	WebElement Backaccount;
	
	
	public void mywishlist() {
		mywishlist.click();
	}
	
	public void name(String txt) {
		name.sendKeys(txt);
	}
	
	public void save() {
		savebutton.click();
	}
		
	
	public void Backaccount() {
		Backaccount.click();
		
	}
	
	

}
