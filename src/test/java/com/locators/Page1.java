 package com.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utility.libGlobal;

public class Page1 extends libGlobal  {
	public Page1() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="username")
	private WebElement txtuserName;
	@FindBy(id="password")
	private WebElement txtPassword;
	@FindBy(id="login")
	private WebElement btnLogin;
	public WebElement getTxtuserName() {
		return txtuserName;
	}
	public WebElement getTxtPassword() {
		return txtPassword;
	}
	public WebElement getBtnLogin() {
		return btnLogin;
	}
	// main methods
	
	
	

}
