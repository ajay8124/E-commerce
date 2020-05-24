package org.Ecommerce.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Orderhistory {
	
	
		
		public WebDriver Driver;
			 
			
			public Orderhistory(WebDriver driver) {
				this.Driver=driver;
				PageFactory.initElements(driver,this);
			}
			
			
			@FindBy(xpath="//*[@id=\"center_column\"]/div/div[1]/ul/li[1]/a")
			WebElement orderhistorytab;
			@FindBy(xpath="//*[@id=\"order-list\"]/tbody/tr[1]/td[1]")
			WebElement orderref;
			@FindBy(xpath="//*[@id=\"sendOrderMessage\"]/p[2]/select")
			WebElement chooseproduct;
			@FindBy(xpath="//*[@id=\"sendOrderMessage\"]/p[3]/textarea")
			WebElement textarea;
			@FindBy(xpath="//*[@id=\"sendOrderMessage\"]/div/button/span")
			WebElement sendbutton;
			@FindBy(xpath="//*[@id=\"center_column\"]/ul/li[1]/a/span")
			WebElement backtoaccount;
			
		public void orderhistory() {
			orderhistorytab.click();
		}
		public void orderRef() {
			orderref.click();
		}
		
		public WebElement chooseproduct() {
			Select sel =new Select(chooseproduct);
			sel.selectByValue("2");
			return chooseproduct;
			
		}
		
		public void textarea(String txt) {
			textarea.sendKeys(txt);
		}
			
			
			public void sendbutton() {
				sendbutton.click();
			}
    
			public void  backtoaccont() {
				backtoaccount.click();
				
				
			}
}
