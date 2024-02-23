//This is the implementation of navigation.feature file
package com.GSD.stepDefinitions;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;

import com.GSD.utils.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import com.GSD.pageObjects.*;


public class homeLoan {

	static oneCognizantPage ocp;
	static beCognizantPage bcp;
	
	@Given("user is on home loan emi calculator portal")
	public void user_is_on_home_loan_emi_calculator_portal() {

		ocp = new oneCognizantPage(baseClass.getDriver());
		//ocp.scrolltop();
		ocp.clickcalc();
		ocp.clickHomeEMI();
		
	}
	
	@When("user enters home value")
	public void user_enters_home_value() {
		ocp.homeprice();
	}

	@When("user enters margin")
	public void user_enters_margin() {
	   ocp.downpayment();
	}

	@When("user enters loan insurance")
	public void user_enters_loan_insurance() {
		
		ocp.insuranceamount();
	}

	/*@Then("user checks loan amount")
	public void user_checks_loan_amount() {
		
		ocp.homeloanamount();
	}*/
	
	@When("user enters home loan interest rate")
	public void user_enters_home_loan_interest_rate() {
		ocp.homeinterest();
	}
	
	@When("user enters loan tenure in year")
	public void user_enters_loan_tenure_in_year() {
		
		ocp.hometerm();
	}
	
	@When("user enters loan fees and charges")
	public void user_enters_loan_fees_and_charges() {
		
		ocp.loanfees();
	}
	
	
	@When("user enters one time expenses")
	public void user_enters_one_time_expenses() {
	  ocp.onetime();
	}

	@When("user enters property taxes\\/year")
	public void user_enters_property_taxes_year() {
	 ocp.propertytaxes();
	}

	@When("user enters home insurance\\/year")
	public void user_enters_home_insurance_year() {
	ocp.homeinsurance();
	}

	@When("user enters maintainance expenses\\/month")
	public void user_enters_maintainance_expenses_month() {
	   ocp.maintainexp();
	}
	
	@When("user enters start month")
	public void user_enters_start_month() {
		ocp.selectmonth();
	}

	@Given("user entered home loan details and home owner expenses")
	public void user_entered_home_loan_details_and_home_owner_expenses() {
	    ocp.scrolltoele();
	    ocp.Elements();
	}

	@When("user scroll to the table")
	public void user_scroll_to_the_table() {
	   ocp.scrolltotable();
	}

	@Then("user store the data in excel file")
	public void user_store_the_data_in_excel_file() throws IOException {
	   ocp.writeExcelSheet();
	}

		
}
