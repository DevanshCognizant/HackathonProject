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

	static homeLoanPage ocp;
	
	@Given("user is on home loan emi calculator portal")
	public void user_is_on_home_loan_emi_calculator_portal() {

		ocp = new homeLoanPage(baseClass.getDriver());
		//ocp.scrolltop();
		ocp.clickcalc();
		ocp.clickHomeEMI();
		
	}
	
	@When("user enters home value {string}")
	public void user_enters_home_value(String homeVal) {
		ocp.homeprice(homeVal);
	}

	@When("user enters margin {string}")
	public void user_enters_margin(String margin) {
	   ocp.downpayment(margin);
	}

	@When("user enters loan insurance {string}")
	public void user_enters_loan_insurance(String loanIns) {
		ocp.insuranceamount(loanIns);
	}

	@When("user enters home loan interest rate {string}")
	public void user_enters_home_loan_interest_rate(String rate) {
		ocp.homeinterest(rate);
	}
	
	@When("user enters loan tenure in year {string}")
	public void user_enters_loan_tenure_in_year(String year) {
		
		ocp.hometerm(year);
	}
	
	@When("user enters loan fees and charges {string}")
	public void user_enters_loan_fees_and_charges(String fees) {
		
		ocp.loanfees(fees);
	}
	
	
	@When("user enters one time expenses {string}")
	public void user_enters_one_time_expenses(String oneTime) {
	  ocp.onetime(oneTime);
	}

	@When("user enters property taxes\\/year {string}")
	public void user_enters_property_taxes_year(String taxes) {
	 ocp.propertytaxes(taxes);
	}

	@When("user enters home insurance\\/year {string}")
	public void user_enters_home_insurance_year(String homeins) {
	ocp.homeinsurance(homeins);
	}

	@When("user enters maintainance expenses\\/month {string}")
	public void user_enters_maintainance_expenses_month(String mainExp) {
	   ocp.maintainexp(mainExp);
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
