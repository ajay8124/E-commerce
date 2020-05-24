package org.Ecommerce.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Searchpage {
public WebDriver driver;
	 
	
	public Searchpage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//*[@id='search_query_top']")
	
	WebElement searchbutton;
	//*[@id='content']/div/div/a"
	
	@FindBy(name="submit_search")
	
WebElement searchicon;
	@FindBy(xpath="//*[@id='selectProductSort']")
	WebElement sortbuuton;
	@FindBy(xpath="//*[@id=\"center_column\"]/ul/li[1]/div/div[2]/div[2]/a[1]/span")
	WebElement addtocart;
	
	
	
	public void searchbutton(String txt) {
		 searchbutton.sendKeys(txt);
	}
	
	public void searchicon() {
		searchicon.click();
	}
	
	public WebElement sortbutton() {
		Select sel=new Select(sortbuuton);
		sel.selectByValue("name:asc");
		return sortbuuton;
	}
	//public void addtocart () {
		//addtocart.click();
		
	//}
	
	public void womentab() {
		Actions action =new Actions(driver);
		action.click();
				
	}
	}
	
	
	

