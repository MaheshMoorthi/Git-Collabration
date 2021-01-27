package com.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utility.libGlobal;

public class Page2 extends libGlobal {
	public Page2() {
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(id="location")
	private WebElement location;
	@FindBy(id="hotels")
	private WebElement hotels;
	@FindBy(id="room_type")
	private WebElement roomType;
	@FindBy(id="room_nos")
	private WebElement noOfRoom;
	@FindBy(id="datepick_in")
	private WebElement datePickin;
	@FindBy(id="datepick_out")
	private WebElement datePickOut;
	@FindBy(id="adult_room")
	private WebElement adultRoom;
	@FindBy(id="child_room")
	private WebElement childRoom;
	@FindBy(id="Submit")
	private WebElement submitbtn;
	public WebElement getLocation() {
		return location;
	}
	public WebElement getHotels() {
		return hotels;
	}
	public WebElement getRoomType() {
		return roomType;
	}
	public WebElement getNoOfRoom() {
		return noOfRoom;
	}
	public WebElement getDatePickin() {
		return datePickin;
	}
	public WebElement getDatePickOut() {
		return datePickOut;
	}
	public WebElement getAdultRoom() {
		return adultRoom;
	}
	public WebElement getChildRoom() {
		return childRoom;
	}
	public WebElement getSubmitbtn() {
		return submitbtn;
	}
	

}
