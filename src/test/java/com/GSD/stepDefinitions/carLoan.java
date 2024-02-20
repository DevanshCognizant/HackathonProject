//This is implementation of login.feature file
package com.GSD.stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.GSD.utils.baseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import com.GSD.pageObjects.loginPage;
import com.GSD.pageObjects.beCognizantPage;
import com.GSD.passwordEncryption.*;

public class carLoan {

	static loginPage lp ;
	static beCognizantPage bcp;
	
	@Given("user opens car loan portal in EMICalculator")
	public void user_opens_car_loan_portal_in_emi_calculator() {
		
		lp = new loginPage(baseClass.getDriver());
		lp.openLoanCalc();    
	}
	
	@When("user enters loan amount")
	public void user_enters_loan_amount() {
		lp.initialpos();
		lp.loanAmount();
	}
	
	@Then("check if loan amount slider is working")
	public void check_if_loan_amount_slider_is_working() {
		lp.actualpos();
		if(lp.initialAmt!=lp.actualAmt)
		Assert.assertTrue(true);
	}
	
	@When("user enters interest rate")
	public void user_enters_interest_rate() {
		lp.initialpos();
		lp.interestRate();
	}

	@Then("check if interest rate slider is working")
	public void check_if_interest_rate_slider_is_working() {
		lp.actualpos();
		if(lp.initialInt!=lp.actualInt)
			Assert.assertTrue(true);
	}
	
	@When("user enters loan tenure")
	public void user_enters_loan_tenure() {
		lp.initialpos();
		lp.loanTenure();
	}
	
	@Then("check if loan tenure slider is working")
	public void check_if_loan_tenure_slider_is_working() {
		lp.actualpos();
		if(lp.initialInt!=lp.actualInt)
			Assert.assertTrue(true);
	}
	
	@When("user selects EMI in advance options")
	public void user_selects_emi_in_advance_options() {
		lp.scrollToElem1();
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
	public void user_selects_emi_in_arrears_options() {
		lp.scrollToElem2();
		lp.emiSelect2();
		//lp.yearSelect();
	}
	@Then("user prints first month interest amount and principal amount")
	public void user_prints_first_month_interest_amount_and_principal_amount() throws InterruptedException {
		Thread.sleep(2000);
		 lp.prinicipalamount(); 
		 lp.interestamount();
	}
}
