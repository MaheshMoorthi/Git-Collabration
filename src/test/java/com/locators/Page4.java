package com.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utility.libGlobal;

public class Page4 extends libGlobal {
public Page4() {
	
	PageFactory.initElements(driver, this);
	
	
}
@FindBy(id="first_name")
private WebElement fName;
@FindBy(id="last_name")
private WebElement lName;
@FindBy(id="cc_num")
private WebElement ccnum;
@FindBy(id="address")
private WebElement address;
@FindBy(id="cc_type")
private WebElement cctype;
@FindBy(id="cc_exp_month")
private WebElement	expMonth;
@FindBy(id="cc_exp_year")
private WebElement expYear;
@FindBy(id="cc_cvv")
private WebElement cvv;
@FindBy(id="book_now")
private WebElement bookNow;
public WebElement getfName() {
	return fName;
}
public WebElement getlName() {
	return lName;
}
public WebElement getCcnum() {
	return ccnum;
}
public WebElement getAddress() {
	return address;
}
public WebElement getCctype() {
	return cctype;
}
public WebElement getExpMonth() {
	return expMonth;
}
public WebElement getExpYear() {
	return expYear;
}
public WebElement getCvv() {
	return cvv;
}
public WebElement getBookNow() {
	return bookNow;
}

// methods 
}
