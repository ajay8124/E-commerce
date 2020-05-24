package org.Ecommerce.pageobjects;

import java.awt.Desktop.Action;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Addtocart {

	
WebDriver driver;

	public Addtocart(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@id=\"block_top_menu\"]/ul/li[1]/a")
	WebElement womentab;
	
	@FindBy(xpath="//*[@id=\"list\"]/a/i")
	WebElement listbutton;
	@FindBy(xpath="//*[@id=\"selectProductSort\"]")
	WebElement sortby;
	@FindBy(xpath="//*[@id=\"center_column\"]/ul/li[1]/div/div/div[3]/div/div[2]/a[1]/span")
	WebElement addtocart;
	@FindBy(xpath="//*[@id=\"layer_cart\"]/div[1]/div[1]/span")
	WebElement closewindow;
	
	@FindBy(xpath="//*[@id=\"layered_price_slider\"]")
	WebElement  slider;
	
	
	public void womentab() {
		womentab.click();
	}
	
	public void listbutton() {
		listbutton.click();
	}
	
	public WebElement  sortby() {
		Select sel=new Select(sortby);
		sel.selectByValue("price:asc");
		return sortby;
	}
	public void addtocart () {
		addtocart.click();
		
		
	}
	
	public void closewindow() {
		closewindow.click();
	}
	
	
	public WebElement slider() throws Exception {
		

		Actions moveSlider = new Actions(driver);
		Thread.sleep(4000);
	org.openqa.selenium.interactions.Action action =moveSlider.dragAndDropBy(slider, 50, 0).build();

		action.perform();
		return slider;      
	        
		
	}
}

