package org.Ecommerce.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
public WebDriver Driver;
	 
	
	public Loginpage(WebDriver driver) {
		this.Driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")
	WebElement signin;
	@FindBy(xpath="//*[@id='email']")
	WebElement emailadress;
	@FindBy(xpath="//*[@id=\"passwd\"]")
	WebElement password;
	@FindBy(xpath="//*[@id=\"SubmitLogin\"]/span")
	WebElement signinbutton;
	@FindBy(xpath="//*[@id=\"header\"]/div[2]/div/div/nav/div[2]/a")
	WebElement signout;
	@FindBy(xpath="//*[@id=\"login_form\"]/div/p[1]/a")
	WebElement forgotpassword;
	
	 public void signin() {
		   signin.click();
	   }
	 public void emaid(String txt) {
		 emailadress.sendKeys(txt);
		 
	 }
	 
	 public void password(String txt) {
		 password.sendKeys(txt);
	 }
	
	public void signinbutton() {
		signinbutton.click();
	}
	public void signout() {
		signout.click();
	}
	
	public void forgotpassword() {
		forgotpassword.click();
	}

}
