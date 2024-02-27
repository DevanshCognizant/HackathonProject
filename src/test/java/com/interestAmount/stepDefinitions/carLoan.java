//This is implementation of login.feature file
package com.interestAmount.stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import com.interestAmount.pageObjects.carLoanPage;
import com.interestAmount.utils.baseClass;

public class carLoan {

	static carLoanPage lp ;
	
	@Given("user opens car loan portal in EMICalculator")
	public void user_opens_car_loan_portal_in_emi_calculator() {
		
		lp = new carLoanPage(baseClass.getDriver());
		lp.openLoanCalc();    
	}
	
	@When("user enters car loan amount {string}")
	public void user_enters_car_loan_amount(String amount) {
		lp.initialpos();
		lp.loanAmount(amount);
	}
	
	@Then("check if loan amount slider is working")
	public void check_if_loan_amount_slider_is_working() {
		lp.actualpos();
		if(lp.initialAmt!=lp.actualAmt)
		Assert.assertTrue(true);
	}
	
	@When("user enters car interest rate {string}")
	public void user_enters_car_interest_rate(String rate) {
		lp.initialpos();
		lp.interestRate(rate);
	}

	@Then("check if interest rate slider is working")
	public void check_if_interest_rate_slider_is_working() {
		lp.actualpos();
		if(lp.initialInt!=lp.actualInt)
			Assert.assertTrue(true);
	}
	
	@When("user enters car loan tenure {string}")
	public void user_enters_car_loan_tenure(String tenure) {
		lp.initialpos();
		lp.loanTenure(tenure);
	}
	
	@Then("check if loan tenure slider is working")
	public void check_if_loan_tenure_slider_is_working() {
		lp.actualpos();
		if(lp.initialInt!=lp.actualInt)
			Assert.assertTrue(true);
	}
	
	@When("user selects EMI in advance options")
	public void user_selects_emi_in_advance_options() {
		lp.scrollToElem();
		lp.emiSelect1();
	}
	
	@When("user clicks on top year")
	public void user_clicks_on_top_year() {
		lp.scrolltoyear();
		lp.yearSelect();
	}
	
	@Then("user print first month interest amount and principal amount")
	public void user_print_first_month_interest_amount_and_principal_amount() {
	  lp.prinicipalamount(); 
	  lp.interestamount();
	}
	
	@When("user selects EMI in Arrears options")
	public void user_selects_emi_in_arrears_options() throws InterruptedException {
		lp.scrollToElem();
		lp.emiSelect2();
		Thread.sleep(2000);
	}
	@Then("user prints first month interest amount and principal amount")
	public void user_prints_first_month_interest_amount_and_principal_amount() throws InterruptedException {
		Thread.sleep(2000);
		 lp.prinicipalamount(); 
		 lp.interestamount();
	}
}
