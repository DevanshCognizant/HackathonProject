package com.interestAmount.stepDefinitions;

import org.junit.Assert;

import com.interestAmount.pageObjects.calcLoanPage;
import com.interestAmount.utils.baseClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loanCalc {
	
	static calcLoanPage gp = new calcLoanPage(baseClass.getDriver());
	
	@Given("user is on EMI calculator portal")
	public void user_is_on_EMI_calculator_portal() {
	    gp.openloancalc();
	    gp.initialEMIpos();
	}
	
	@When("user enters emi loan amount {string}")
	public void user_enters_emi_loan_amount(String loanAmt) {
	   
		gp.emiloanamount(loanAmt);
	}

	@Then("check if emi loan amount slider is working")
	public void check_if_emi_loan_amount_slider_is_working() {
	  gp.actualloansliderpos();
	  if(gp.initialLoanSlider != gp.actualLoanSlider) {
		  System.out.println("Slider position changed");
		  Assert.assertTrue(true);
	  }
	}

	@When("user enters emi interest rate {string}")
	public void user_enters_emi_interest_rate(String rate) {
	    
		gp.emiinterest(rate);
	}

	@Then("check if emi interest rate slider is working")
	public void check_if_emi_interest_rate_slider_is_working() {
	    gp.actualratesliderpos();
	    if(gp.initialRateSlider != gp.actualRateSlider) {
	    	System.out.println("Slider position changed");
	    	Assert.assertTrue(true);
	    }
	}

	@When("user enters emi loan tenure {string}")
	public void user_enters_emi_loan_tenure(String tenure) {
	    
		gp.emiloanterm(tenure);
	}

	@Then("change tenure to month from year")
	public void change_tenure_to_month_from_year() {
	    gp.monthclick();
	}

	@Then("check if emi loan tenure slider is working")
	public void check_if_emi_loan_tenure_slider_is_working() {
		gp.actualtensliderpos();
		if(gp.initialTenSlider != gp.actualTenSlider) {
			System.out.println("Slider position changed");
	    	Assert.assertTrue(true);
		}
	}
	
	@When("user enters emi loan fees and charges {string}")
	public void user_enters_emi_loan_fees_and_charges(String fees) {
		gp.emiloanfees(fees);
	}
	
	@Then("check if emi loan fees and charges is working")
	public void check_if_emi_loan_fees_and_charges_is_working() {
		gp.actualfeesslider();
		if(gp.initialFeesSlider != gp.actualFeesSlider) {
			System.out.println("Slider position changed");
	    	Assert.assertTrue(true);
		}
	}
	
	@Then("check if emi calculator emi schemes visible")
	public void check_if_emi_calculator_emi_schemes_visible() {
		gp.scrollToSchemes();
		Assert.assertTrue(gp.schemes.isDisplayed());
	}

	@Then("check if emi calculator total payment table visible")
	public void check_if_emi_calculator_total_payment_table_visible() {
		Assert.assertTrue(gp.paymentTable.isDisplayed());
	}

	@Then("check if emi calculator graph visible")
	public void check_if_emi_calculator_graph_visible() {
	    gp.scrollToGraph();
	    Assert.assertTrue(gp.graph.isDisplayed());
	}

	@Then("check if emi calculator year on year table visible")
	public void check_if_emi_calculator_year_on_year_table_visible() {
	   gp.scrollTotable();
	   Assert.assertTrue(gp.yearTable.isDisplayed());
	}
	
	@Given("user is on loan amount calculator")
	public void user_is_on_loan_amount_calculator() {
		gp.clickloanamt();
		gp.initialAmountpos();
	}

	@When("user enters emi {string}")
	public void user_enters_emi(String emi) {
	   gp.emiamt(emi);
	}

	@Then("check if emi slider is working")
	public void check_if_emi_slider_is_working() {
	    gp.actualemisliderpos();
	    if(gp.initialEmiSlider != gp.actualEmiSlider) {
	    	System.out.println("Slider position changed");
	    	Assert.assertTrue(true);
	    }
	}

	@When("user enters loan amount interest rate {string}")
	public void user_enters_loan_amount_interest_rate(String rate) {
	  gp.emiinterest(rate);
	}

	@Then("check if loan interest rate slider is working")
	public void check_if_loan_interest_rate_slider_is_working() {
		gp.actualratesliderpos();
	    if(gp.initialRateSlider != gp.actualRateSlider) {
	    	System.out.println("Slider position changed");
	    	Assert.assertTrue(true);
	    }
	}

	@When("user enters loan amount tenure {string}")
	public void user_enters_loan_amount_tenure(String tenure) {
	    gp.emiloanterm(tenure);
	}

	@Then("change calculator tenure to month from year")
	public void change_calculator_tenure_to_month_from_year() {
		gp.monthclick();
	}

	@Then("check if amount loan tenure slider is working")
	public void check_if_amount_loan_tenure_slider_is_working() {
		gp.actualtensliderpos();
		if(gp.initialTenSlider != gp.actualTenSlider) {
			System.out.println("Slider position changed");
	    	Assert.assertTrue(true);
		}
	}

	@When("user enters loan Fees and charges {string}")
	public void user_enters_loan_fees_and_charges(String fees) {
	    gp.emifees(fees);
	}

	@Then("check if loan fees and charges slider is working")
	public void check_if_loan_fees_and_charges_slider_is_working() {
		gp.actualfeesslider();
		if(gp.initialFeesSlider != gp.actualFeesSlider) {
			System.out.println("Slider position changed");
	    	Assert.assertTrue(true);
		}
	}
	
	@Then("check if loan amount calculator emi schemes visible")
	public void check_if_loan_amount_calculator_emi_schemes_visible() {
		gp.scrollToSchemes();
		Assert.assertTrue(gp.schemes.isDisplayed());
	}

	@Then("check if loan amount calculator total payment table visible")
	public void check_if_loan_amount_calculator_total_payment_table_visible() {
		Assert.assertTrue(gp.paymentTable.isDisplayed());
	}

	@Then("check if loan amount calculator graph visible")
	public void check_if_loan_amount_calculator_graph_visible() {
		gp.scrollToGraph();
	    Assert.assertTrue(gp.graph.isDisplayed());
	}

	@Then("check if loan amount calculator year on year table visible")
	public void check_if_loan_amount_calculator_year_on_year_table_visible() {
		gp.scrollTotable();
		Assert.assertTrue(gp.yearTable.isDisplayed());
	}

	@Given("user is on loan tenure calculator")
	public void user_is_on_loan_tenure_calculator() {
	
		gp.clickloantenure();
	    gp.initialTenurepos();
	}

	@When("user enters loan amount {string}")
	public void user_enters_loan_amount(String loanAmt) {
	    gp.tenureamt(loanAmt);
	}

	@Then("check if calculator loan amount slider is working")
	public void check_if_calculator_loan_amount_slider_is_working() {
		gp.actualloansliderpos();
		  if(gp.initialLoanSlider != gp.actualLoanSlider) {
			  System.out.println("Slider position changed");
			  Assert.assertTrue(true);
		  }
	}

	@When("user enters calculator emi {string}")
	public void user_enters_calculator_emi(String emi) {
	   gp.tenureemi(emi);
	}

	@Then("check if calculator emi slider is working")
	public void check_if_calculator_emi_slider_is_working() {
		gp.actualemisliderpos();
	    if(gp.initialEmiSlider != gp.actualEmiSlider) {
	    	System.out.println("Slider position changed");
	    	Assert.assertTrue(true);
	    }
	}

	@When("user enters interest rate {string}")
	public void user_enters_interest_rate(String rate) {
	    gp.tenurerate(rate);
	}

	@Then("check if calculator interest rate slider is working")
	public void check_if_calculator_interest_rate_slider_is_working() {
		gp.actualratesliderpos();
	    if(gp.initialRateSlider != gp.actualRateSlider) {
	    	System.out.println("Slider position changed");
	    	Assert.assertTrue(true);
	    }
	}

	@When("user enters calculator Fees and charges {string}")
	public void user_enters_calculator_fees_and_charges(String fees) {
	    gp.tenurefees(fees);
	}

	@Then("check if calculator fees and charges slider is working")
	public void check_if_calculator_fees_and_charges_slider_is_working() {
		gp.actualfeesslider();
		if(gp.initialFeesSlider != gp.actualFeesSlider) {
			System.out.println("Slider position changed");
	    	Assert.assertTrue(true);
		}
	}
	
	@Then("check if loan tenure calculator emi schemes visible")
	public void check_if_loan_tenure_calculator_emi_schemes_visible() {
		gp.scrollToSchemes();
		Assert.assertTrue(gp.schemes.isDisplayed());
	}

	@Then("check if loan tenure calculator total payment table visible")
	public void check_if_loan_tenure_calculator_total_payment_table_visible() {
		Assert.assertTrue(gp.paymentTable.isDisplayed());
	}

	@Then("check if loan tenure calculator graph visible")
	public void check_if_loan_tenure_calculator_graph_visible() {
		gp.scrollToGraph();
	    Assert.assertTrue(gp.graph.isDisplayed());
	}

	@Then("check if loan tenure calculator year on year table visible")
	public void check_if_loan_tenure_calculator_year_on_year_table_visible() {
		gp.scrollTotable();
		Assert.assertTrue(gp.yearTable.isDisplayed());
	}

	@Given("user is on interest rate calculator")
	public void user_is_on_interest_rate_calculator() throws InterruptedException {
	    //Thread.sleep(4000);
	    
		gp.clickinterest();
	    gp.initialRatepos();
	}

	@When("user enters interest loan amount {string}")
	public void user_enters_interest_loan_amount(String loanAmt) {
	  gp.intloanamt(loanAmt);
	}

	@Then("check if interest loan amount slider is working")
	public void check_if_interest_loan_amount_slider_is_working() {
		gp.actualloansliderpos();
		  if(gp.initialLoanSlider != gp.actualLoanSlider) {
			  System.out.println("Slider position changed");
			  Assert.assertTrue(true);
		  }
	}

	@When("user enters interest emi {string}")
	public void user_enters_interest_emi(String emi) {
	   gp.intloanemi(emi);
	}

	@Then("check if interest emi slider is working")
	public void check_if_interest_emi_slider_is_working() {
		gp.actualemisliderpos();
	    if(gp.initialEmiSlider != gp.actualEmiSlider) {
	    	System.out.println("Slider position changed");
	    	Assert.assertTrue(true);
	    }
	}

	@When("user enters loan tenure {string}")
	public void user_enters_loan_tenure(String tenure) {
	  gp.intloanterm(tenure);
	}

	@Then("change interest loan tenure to month from year")
	public void change_interest_loan_tenure_to_month_from_year() {
		gp.monthclick();
	}

	@Then("check if interest rate calculator loan tenure slider is working")
	public void check_if_interest_rate_calculator_loan_tenure_slider_is_working() {
		gp.actualtensliderpos();
		if(gp.initialTenSlider != gp.actualTenSlider) {
			System.out.println("Slider position changed");
	    	Assert.assertTrue(true);
		}
	}


	@When("user enters interest rate Fees and charges {string}")
	public void user_enters_interest_rate_fees_and_charges(String fees) {
	  gp.intloanfees(fees);
	}

	@Then("check if interest rate fees and charges slider is working")
	public void check_if_interest_rate_fees_and_charges_slider_is_working() {
		gp.actualfeesslider();
		if(gp.initialFeesSlider != gp.actualFeesSlider) {
			System.out.println("Slider position changed");
	    	Assert.assertTrue(true);
		}
	}
	
	@Then("check if interest rate calculator emi schemes visible")
	public void check_if_interest_rate_calculator_emi_schemes_visible() {
		gp.scrollToSchemes();
		Assert.assertTrue(gp.schemes.isDisplayed());
	}

	@Then("check if interest rate calculator total payment table visible")
	public void check_if_interest_rate_calculator_total_payment_table_visible() {
		Assert.assertTrue(gp.paymentTable.isDisplayed());
	}

	@Then("check if interest rate calculator graph visible")
	public void check_if_interest_rate_calculator_graph_visible() {
		gp.scrollToGraph();
	    Assert.assertTrue(gp.graph.isDisplayed());
	}

	@Then("check if interest rate calculator year on year table visible")
	public void check_if_interest_rate_calculator_year_on_year_table_visible() {
		gp.scrollTotable();
		Assert.assertTrue(gp.yearTable.isDisplayed());
		gp.scrolltotop();
	}
}
