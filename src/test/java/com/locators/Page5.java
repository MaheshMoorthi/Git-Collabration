package com.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utility.libGlobal;

public class Page5 extends libGlobal {
	public Page5() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@name='order_no']")
	private WebElement orderid;

	public WebElement getOrderid() {
		return orderid;
	}

}
