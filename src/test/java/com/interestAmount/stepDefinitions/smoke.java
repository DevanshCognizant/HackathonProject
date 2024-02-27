package com.interestAmount.stepDefinitions;

import org.junit.Assert;

import com.interestAmount.pageObjects.calcLoanPage;
import com.interestAmount.pageObjects.carLoanPage;
import com.interestAmount.pageObjects.homeLoanPage;
import com.interestAmount.utils.baseClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class smoke {
	static carLoanPage cp;
	static homeLoanPage hp;
	static calcLoanPage lp = new calcLoanPage(baseClass.getDriver());
	
	@Given("user navigated to home page")
	public void user_navigated_to_home_page() {
		cp = new carLoanPage(baseClass.getDriver());
	}
	@When("user click on car loan button")
	public void user_click_on_car_loan_button() {
		Assert.assertTrue(cp.carLoan.isDisplayed()); 
		cp.carLoan.click();
	}
	
	@Given("user navigated to car loan portal")
	public void user_navigated_to_car_loan_portal() {
		cp.openLoanCalc();
	}
	@When("user validate loan amount text box")
	public void user_validate_loan_amount_text_box() {
		Assert.assertTrue(cp.loanAmt.isDisplayed()); 
	}
	@When("user validate rate text box")
	public void user_validate_rate_text_box() {
		Assert.assertTrue(cp.loanInt.isDisplayed()); 
	}
	@When("user validate loan tenure")
	public void user_validate_loan_tenure() {
		Assert.assertTrue(cp.loanTerm.isDisplayed()); 
	}
	@When("user validate EMI in advance")
	public void user_validate_emi_in_advance() {
		Assert.assertTrue(cp.webElement.isDisplayed()); 
	}
	@When("user validate EMI in arrears")
	public void user_validate_emi_in_arrears() {
		Assert.assertTrue(cp.Emi.isDisplayed()); 
	}
	
	@Given("user navigated to home loan page")
	public void user_navigated_to_home_loan_page() {
		hp = new homeLoanPage(baseClass.getDriver());
		hp.clickcalc();
		hp.clickHomeEMI();
	}
	@When("user validate home loan details text box")
	public void user_validate_home_loan_details_text_box() {
		Assert.assertTrue(hp.homeEMI.isDisplayed());
		Assert.assertTrue(hp.homePrice.isDisplayed());
		Assert.assertTrue(hp.downPayment.isDisplayed());
		Assert.assertTrue(hp.homeLoanIns.isDisplayed());
		Assert.assertTrue(hp.homeLoanAmt.isDisplayed());
		Assert.assertTrue(hp.homeLoanInterest.isDisplayed());
		Assert.assertTrue(hp.homeLoanTerm.isDisplayed());
		Assert.assertTrue(hp.loanFees.isDisplayed());
	}
	@When("user validate home owner expenses text box")
	public void user_validate_home_owner_expenses_text_box() {
		Assert.assertTrue(hp.oneTime.isDisplayed());
		Assert.assertTrue(hp.propertyTaxes.isDisplayed());
		Assert.assertTrue(hp.homeIns.isDisplayed());
		Assert.assertTrue(hp.maintainExp.isDisplayed());
	}
	@When("user validate year on year table")
	public void user_validate_year_on_year_table() {
		Assert.assertTrue(hp.table.isDisplayed());
	}
	
	
	@Given("user navigate to emi calculator page")
	public void user_navigate_to_emi_calculator_page() {
	    lp.openloancalc();
	}
	@When("user validated emi loan amount text box")
	public void user_validated_emi_loan_amount_text_box() {
		Assert.assertTrue(lp.LoanAmount.isDisplayed());
	}
	@When("user validated emi rate text box")
	public void user_validated_emi_rate_text_box() {
		Assert.assertTrue(lp.Interest.isDisplayed());
	}
	@When("user validated emi loan tenure text box")
	public void user_validated_emi_loan_tenure_text_box() {
		Assert.assertTrue(lp.Term.isDisplayed());
	}
	@When("user changed tenure from month to year")
	public void user_changed_tenure_from_month_to_year() {
	    
	}
	@When("user validated emi fees text box")
	public void user_validated_emi_fees_text_box() {
		Assert.assertTrue(lp.Fees.isDisplayed());
	}
	
	
	@Given("user navigated to loan amount calculator page")
	public void user_navigated_to_loan_amount_calculator_page() {
	    lp.clickloanamt();
	}
	@When("user validated emi amount text box")
	public void user_validated_emi_amount_text_box() {
		Assert.assertTrue(lp.LoanAmount.isDisplayed());
	}
	@When("user validated loan rate text box")
	public void user_validated_loan_rate_text_box() {
		Assert.assertTrue(lp.Interest.isDisplayed());
	}
	@When("user validated loan tenure text box")
	public void user_validated_loan_tenure_text_box() {
		Assert.assertTrue(lp.Term.isDisplayed());
	}
	@When("user validated loan tenure change from month to year")
	public void user_validated_loan_tenure_change_from_month_to_year() {
	    
	}
	@When("user validated loan fees text box")
	public void user_validated_loan_fees_text_box() {
		Assert.assertTrue(lp.Fees.isDisplayed());
	}
	

	@Given("user navigated to loan tenure calculator")
	public void user_navigated_to_loan_tenure_calculator() {
	   lp.clickloantenure();
	}
	@When("user validated tenure loan amount text box")
	public void user_validated_tenure_loan_amount_text_box() {
		Assert.assertTrue(lp.LoanAmount.isDisplayed());
	}
	@When("user validated tenure EMI text box")
	public void user_validated_tenure_emi_text_box() {
		Assert.assertTrue(lp.Emi.isDisplayed());
	}
	@When("user validated tenure rate text box")
	public void user_validated_tenure_rate_text_box() {
		Assert.assertTrue(lp.Term.isDisplayed());
	}
	@When("user validated fees text box")
	public void user_validated_fees_text_box() {
		Assert.assertTrue(lp.Fees.isDisplayed());
	}
	
	
	@Given("user navigated to interest rate calculator")
	public void user_navigated_to_interest_rate_calculator() {
	    lp.clickinterest();
	}
	@When("user validated rate loan amount text box")
	public void user_validated_rate_loan_amount_text_box() {
		Assert.assertTrue(lp.LoanAmount.isDisplayed());
	}
	@When("user validated rate emi text box")
	public void user_validated_rate_emi_text_box() {
		Assert.assertTrue(lp.Emi.isDisplayed());
	}
	@When("user validated rate tenure text box")
	public void user_validated_rate_tenure_text_box() {
		Assert.assertTrue(lp.Term.isDisplayed());
	}
	@When("user validated tenure change from month to year")
	public void user_validated_tenure_change_from_month_to_year() {
	 
	}
	@When("user validated rate fees text box")
	public void user_validated_rate_fees_text_box() {
		Assert.assertTrue(lp.Fees.isDisplayed());
	}
}	
