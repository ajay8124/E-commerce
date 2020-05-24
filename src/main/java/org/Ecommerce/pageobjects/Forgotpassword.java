package org.Ecommerce.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Forgotpassword {
	
public WebDriver Driver;
	 
	
	public Forgotpassword(WebDriver driver) {
		this.Driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")
	WebElement signin;
	@FindBy(xpath="//*[@id=\"login_form\"]/div/p[1]/a")
	WebElement forgotpassword;
	@FindBy(xpath="//*[@id=\"email\"]")
	WebElement Emailadress;
	@FindBy(xpath="//*[@id=\"form_forgotpassword\"]/fieldset/p/button/span")
	WebElement reterivepassword;
	public void signin() {
		   signin.click();
	   }
	
	public void forgotpassword() {
		forgotpassword.click();
	}
	public void eamiladress(String txt) {
		Emailadress.click();
	}
	public void repassword() {
		reterivepassword.click();
	}

}
