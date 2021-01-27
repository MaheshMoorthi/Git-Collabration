package com.stepdef;

import com.locators.Page1;
import com.locators.Page2;
import com.locators.Page3;
import com.locators.Page4;
import com.locators.Page5;
import com.utility.libGlobal;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition extends libGlobal {

	@Given("user want to login the adactin hotel app with valid {string} and {string}")
	public void user_want_to_login_the_adactin_hotel_app_with_valid_and(String string, String string2) {
		launchBrowser();
		loadUrl("http://adactinhotelapp.com/");
		Page1 p1 = new Page1();

		fillText(p1.getTxtuserName(), string);
		fillText(p1.getTxtPassword(), string2);
		click(p1.getBtnLogin());

	}

	@When("user enter the {string},{string},{string},{string},{string},{string},{string},{string} and click the search button")
	public void user_enter_the_and_click_the_search_button(String string, String string2, String string3,
			String string4, String string5, String string6, String string7, String string8) {
		Page2 p2 = new Page2();
		selectDrop(p2.getLocation(), string);
		selectDrop(p2.getHotels(), string2);
		selectDrop(p2.getRoomType(), string3);
		selectDrop(p2.getNoOfRoom(), string4);
		fillText(p2.getDatePickin(), string5);
		fillText(p2.getDatePickOut(), string6);
		selectDrop(p2.getAdultRoom(), string7);
		selectDrop(p2.getChildRoom(), string8);
		click(p2.getSubmitbtn());
	}

	@When("user select the hotel and click continue")
	public void user_select_the_hotel_and_click_continue() {
		Page3 p3 = new Page3();

		click(p3.getHotelSelect());
		click(p3.getSubmitbtn());
	}

	@When("user enter the {string},{string},{string},{string},{string},{string},{string},{string} and clicking the Booknow")
	public void user_enter_the_and_clicking_the_Booknow(String firstname, String lname, String address, String ccnum,
			String cctype, String expmonth, String expyear, String cvv) {
		Page4 p4 = new Page4();
		fillText(p4.getfName(), firstname);
		fillText(p4.getlName(), lname);
		fillText(p4.getAddress(), address);
		fillText(p4.getCcnum(), ccnum);
		selectDrop(p4.getCctype(), cctype);
		selectDrop(p4.getExpMonth(), expmonth);
		selectDrop(p4.getExpYear(), expyear);
		fillText(p4.getCvv(), cvv);
		click(p4.getBookNow());

	}

	@Then("user verify the order id  and close the browser")
	public void user_verify_the_order_id_and_close_the_browser() {

		Page5 p5 = new Page5();
		String value = getValue(p5.getOrderid());
		System.out.println("orderid==============>" + value);
		driver.quit();
	}

}
