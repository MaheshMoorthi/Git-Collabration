package com.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utility.libGlobal;

public class Page3 extends libGlobal {
public Page3() {
	
PageFactory.initElements(driver, this);	
	

}
@FindBy(id="radiobutton_0")
private WebElement hotelSelect;
@FindBy(id="continue")
private WebElement submitbtn;

public WebElement getSubmitbtn() {
	return submitbtn;
}

public WebElement getHotelSelect() {
	return hotelSelect;
}


}
