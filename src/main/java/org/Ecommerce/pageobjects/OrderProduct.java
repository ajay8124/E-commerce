package org.Ecommerce.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class OrderProduct {
	
		WebDriver driver;

			public OrderProduct(WebDriver driver) {
				
				this.driver=driver;
				PageFactory.initElements(driver, this);
			}
			
			@FindBy(xpath="//*[@id=\"center_column\"]/ul/li[2]/div/div/div[3]/div/div[2]/a[2]")
			WebElement Morebutton;
			@FindBy(xpath="//*[@id=\"quantity_wanted_p\"]/a[2]")
			WebElement plusicon;
			@FindBy(xpath="//*[@id='group_1']")
			WebElement size;
			@FindBy(xpath="//*[@id=\"color_8\"]")
			WebElement color;
			@FindBy(xpath="//*[@id=\"add_to_cart\"]")
			WebElement addtocart;
			@FindBy(xpath="//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span")
			WebElement checkout;
			
			@FindBy(xpath="//*[@id=\"center_column\"]/p[2]/a[1]/span")
			WebElement proccedtocheckout;
			@FindBy(xpath="//*[@id=\"center_column\"]/form/p/button/span")
			WebElement proceedtocheckout3;
			@FindBy(xpath="//*[@id='cgv']")
			WebElement checkbox;
			@FindBy(xpath="//*[@id=\"form\"]/p/button/span")
			WebElement proceedtocheckout4;
			
			@FindBy(xpath="//*[@id='HOOK_PAYMENT']/div[1]/div/p/a")
			WebElement paybywire;
			@FindBy(xpath="//*[@id=\"cart_navigation\"]/button/span")
			WebElement confirmorder;
			

			public void morebutton() {
				Morebutton.click();
				}
			public void plusicon() {
				plusicon.click();
			}
			
			public WebElement size() {
				Select sel =new Select(size);
				sel.selectByValue("2");
				return size;
			}
			
			public void color() {
				color.click();
			}
			public void addtocart() {
				addtocart.click();
			}
			public void checkout() {
				checkout.click();
			}
			public void proccedtocheckout() {
				proccedtocheckout.click();
			}
			public void proceedtocheckout3() {
				proceedtocheckout3.click();
			}
			
			public void checkbox() {
				checkbox.click();
			}
			public void proceedtocheckout4() {
				proceedtocheckout4.click();
			}
			
			
			public void paybywire() {
				paybywire.click();
			}
			
			public void confirmorder() {
				confirmorder.click();
			}
			
}

