package org.Ecommerce.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Signuppage {
	
	
	public WebDriver Driver;
	 
	
	public Signuppage(WebDriver driver) {
		this.Driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	//test@123456gmail.com
	//test123
	@FindBy(xpath="//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")
	WebElement signin;
	@FindBy(xpath="//*[@id=\"email_create\"]")
	//*[@id="email_create"]
	WebElement Emailadress;
	@FindBy(xpath="//*[@id=\"SubmitCreate\"]/span")
	WebElement createanaccount;
	@FindBy(xpath="//*[@id=\"id_gender1\"]")
	WebElement Mradiobutton;
	@FindBy(xpath="//*[@id=\"customer_firstname\"]")
	WebElement Firstname;
	@FindBy(xpath="//*[@id=\"customer_lastname\"]")
	WebElement Lastname;
	@FindBy(xpath="//*[@id=\"passwd\"]")
	WebElement password;
	@FindBy(xpath="//*[@id=\"days\"]")
	WebElement days;
	@FindBy(xpath="//*[@id=\"months\"]")
	WebElement months;
	@FindBy(xpath="//*[@id=\"years\"]")
	WebElement years;
	@FindBy(xpath="//*[@id=\"firstname\"]")
	WebElement firstname;
	@FindBy(xpath="//*[@id=\"lastname\"]")
	WebElement lastname;
	@FindBy(xpath="//*[@id=\"company\"]")
	WebElement compnay;
	@FindBy(xpath="//*[@id=\"address1\"]")
	WebElement adress;
	@FindBy(xpath="//*[@id=\"city\"]")
	WebElement city;
	@FindBy(xpath="//*[@id=\"id_state\"]")
	WebElement state;
	@FindBy(xpath="//*[@id=\"postcode\"]")
	WebElement zipcode;
	@FindBy(xpath="//*[@id=\"id_country\"]")
	WebElement country;
	
	@FindBy(xpath="//*[@id=\"phone_mobile\"]")
	WebElement moblile;
	@FindBy(xpath="//*[@id=\"alias\"]")
	WebElement Myadress;
	@FindBy(xpath="//*[@id=\"submitAccount\"]/span")
	WebElement registerbutton;
	
   public void signinbutton() {
	   signin.click();
   }
	   public void emailbutton(String txt) {
		   Emailadress.sendKeys(txt);
	   }
	 
	   public void createaccount() {
		   createanaccount.click();
	   }
	   public  WebElement radiobutton() {
		   Mradiobutton.click();
		return Mradiobutton;
	   }
	   
	   public void firstname(String txt) {
		   Firstname.sendKeys(txt);
	   }
	   public void lastname(String txt) {
		   Lastname.sendKeys(txt);
	   }
	   public void password(String txt) {
		   password.sendKeys(txt);
	   }
	   public WebElement days() {
		   Select sel=new Select(days);
		   sel.selectByValue("2");
		   return days;
	   }
	   public WebElement months() {
		   Select sel=new Select(months);
		   sel.selectByValue("2");
		   return months;
	   }
	   public WebElement years() {
		   Select sel=new Select(years);
		   sel.selectByValue("2020");
		   return years;
	   }
	   
	   public void Firstname(String txt) {
		   firstname.sendKeys(txt);
	   }
	   public void Lastname(String txt) {
		   lastname.sendKeys(txt);
	   }
	   
	   
	   public void company(String txt) {
		   compnay.sendKeys(txt);
	   }
	   public void adress(String txt) {
		   adress.sendKeys(txt);
	   }
	   public void city(String txt) {
		   city.sendKeys(txt);
	   }
	   public WebElement state() {
		   Select sel=new Select(state);
		   sel.selectByValue("2");
		   return state;
		   
	   }
	   public void zipcode(String txt) {
		   zipcode.sendKeys(txt);
	   }
	   public WebElement country() {
		   Select sel=new Select(country);
		   sel.selectByValue("21");
		   return state;
	   }
	   
	   public void mobliephone(String txt) {
		   moblile.sendKeys(txt);
	   }
	   public void myadress(String txt) {
		   Myadress.sendKeys(txt);
	   }
		   
		public void registerbutton() {
			registerbutton.click();
		}
		   
}
		   
	   
	   
	   
	   
	   
	   
	   
		   
	   
	   
	   
   

