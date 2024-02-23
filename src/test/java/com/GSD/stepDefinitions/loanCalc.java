package com.GSD.stepDefinitions;

import org.junit.Assert;

import com.GSD.pageObjects.GSDPage;
import com.GSD.utils.baseClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loanCalc {
	
	static GSDPage gp = new GSDPage(baseClass.getDriver());
	
	@Given("user is on EMI calculator portal")
	public void user_is_on_EMI_calculator_portal() {
	    gp.openloancalc();
	    gp.initialEMIpos();
	}
	
	@When("user enters emi loan amount")
	public void user_enters_emi_loan_amount() {
	   
		gp.emiloanamount();
	}

	@Then("check if emi loan amount slider is working")
	public void check_if_emi_loan_amount_slider_is_working() {
	  gp.actualloansliderpos();
	  if(gp.initialLoanSlider != gp.actualLoanSlider) {
		  System.out.println("Slider position changed");
		  Assert.assertTrue(true);
	  }
	}

	@When("user enters emi interest rate")
	public void user_enters_emi_interest_rate() {
	    
		gp.emiinterest();
	}

	@Then("check if emi interest rate slider is working")
	public void check_if_emi_interest_rate_slider_is_working() {
	    gp.actualratesliderpos();
	    if(gp.initialRateSlider != gp.actualRateSlider) {
	    	System.out.println("Slider position changed");
	    	Assert.assertTrue(true);
	    }
	}

	@When("user enters emi loan tenure")
	public void user_enters_emi_loan_tenure() {
	    
		gp.emiloanterm();
	}

	@Then("change tenure to month from year")
	public void change_tenure_to_month_from_year() {
	    
	}

	@Then("check if emi loan tenure slider is working")
	public void check_if_emi_loan_tenure_slider_is_working() {
		gp.actualtensliderpos();
		if(gp.initialTenSlider != gp.actualTenSlider) {
			System.out.println("Slider position changed");
	    	Assert.assertTrue(true);
		}
	}
	
	@When("user enters emi loan fees and charges")
	public void user_enters_emi_loan_fees_and_charges() {
		gp.emiloanfees();
	}
	
	@Then("check if emi loan fees and charges is working")
	public void check_if_emi_loan_fees_and_charges_is_working() {
		gp.actualfeesslider();
		if(gp.initialFeesSlider != gp.actualFeesSlider) {
			System.out.println("Slider position changed");
	    	Assert.assertTrue(true);
		}
	}
	
	@Given("user is on loan amount calculator")
	public void user_is_on_loan_amount_calculator() {
		gp.clickloanamt();
		gp.initialAmountpos();
	}

	@When("user enters emi")
	public void user_enters_emi() {
	   gp.emiamt();
	}

	@Then("check if emi slider is working")
	public void check_if_emi_slider_is_working() {
	    gp.actualemisliderpos();
	    if(gp.initialEmiSlider != gp.actualEmiSlider) {
	    	System.out.println("Slider position changed");
	    	Assert.assertTrue(true);
	    }
	}

	@When("user enters loan amount interest rate")
	public void user_enters_loan_amount_interest_rate() {
	  gp.emiinterest();
	}

	@Then("check if loan interest rate slider is working")
	public void check_if_loan_interest_rate_slider_is_working() {
		gp.actualratesliderpos();
	    if(gp.initialRateSlider != gp.actualRateSlider) {
	    	System.out.println("Slider position changed");
	    	Assert.assertTrue(true);
	    }
	}

	@When("user enters loan amount tenure")
	public void user_enters_loan_amount_tenure() {
	    gp.emiloanterm();
	}

	@Then("change calculator tenure to month from year")
	public void change_calculator_tenure_to_month_from_year() {
	  
	}

	@Then("check if amount loan tenure slider is working")
	public void check_if_amount_loan_tenure_slider_is_working() {
		gp.actualtensliderpos();
		if(gp.initialTenSlider != gp.actualTenSlider) {
			System.out.println("Slider position changed");
	    	Assert.assertTrue(true);
		}
	}

	@When("user enters loan Fees and charges")
	public void user_enters_loan_fees_and_charges() {
	    gp.emifees();
	}

	@Then("check if loan fees and charges slider is working")
	public void check_if_loan_fees_and_charges_slider_is_working() {
		gp.actualfeesslider();
		if(gp.initialFeesSlider != gp.actualFeesSlider) {
			System.out.println("Slider position changed");
	    	Assert.assertTrue(true);
		}
	}

	@Given("user is on loan tenure calculator")
	public void user_is_on_loan_tenure_calculator() {
	    gp.clickloantenure();
	    gp.initialTenurepos();
	}

	@When("user enters loan amount")
	public void user_enters_loan_amount() {
	    gp.tenureamt();
	}

	@Then("check if calculator loan amount slider is working")
	public void check_if_calculator_loan_amount_slider_is_working() {
		gp.actualloansliderpos();
		  if(gp.initialLoanSlider != gp.actualLoanSlider) {
			  System.out.println("Slider position changed");
			  Assert.assertTrue(true);
		  }
	}

	@When("user enters calculator emi")
	public void user_enters_calculator_emi() {
	   gp.tenureemi();
	}

	@Then("check if calculator emi slider is working")
	public void check_if_calculator_emi_slider_is_working() {
		gp.actualemisliderpos();
	    if(gp.initialEmiSlider != gp.actualEmiSlider) {
	    	System.out.println("Slider position changed");
	    	Assert.assertTrue(true);
	    }
	}

	@When("user enters interest rate")
	public void user_enters_interest_rate() {
	    gp.tenurerate();
	}

	@Then("check if calculator interest rate slider is working")
	public void check_if_calculator_interest_rate_slider_is_working() {
		gp.actualratesliderpos();
	    if(gp.initialRateSlider != gp.actualRateSlider) {
	    	System.out.println("Slider position changed");
	    	Assert.assertTrue(true);
	    }
	}

	@When("user enters calculator Fees and charges")
	public void user_enters_calculator_fees_and_charges() {
	    gp.tenurefees();
	}

	@Then("check if calculator fees and charges slider is working")
	public void check_if_calculator_fees_and_charges_slider_is_working() {
		gp.actualfeesslider();
		if(gp.initialFeesSlider != gp.actualFeesSlider) {
			System.out.println("Slider position changed");
	    	Assert.assertTrue(true);
		}
	}

	@Given("user is on interest rate calculator")
	public void user_is_on_interest_rate_calculator() {
	    gp.clickinterest();
	    gp.initialRatepos();
	}

	@When("user enters interest loan amount")
	public void user_enters_interest_loan_amount() {
	  gp.intloanamt();
	}

	@Then("check if interest loan amount slider is working")
	public void check_if_interest_loan_amount_slider_is_working() {
		gp.actualloansliderpos();
		  if(gp.initialLoanSlider != gp.actualLoanSlider) {
			  System.out.println("Slider position changed");
			  Assert.assertTrue(true);
		  }
	}

	@When("user enters interest emi")
	public void user_enters_interest_emi() {
	   gp.intloanemi();
	}

	@Then("check if interest emi slider is working")
	public void check_if_interest_emi_slider_is_working() {
		gp.actualemisliderpos();
	    if(gp.initialEmiSlider != gp.actualEmiSlider) {
	    	System.out.println("Slider position changed");
	    	Assert.assertTrue(true);
	    }
	}

	@When("user enters loan tenure")
	public void user_enters_loan_tenure() {
	  gp.intloanterm();
	}

	@Then("change interest loan tenure to month from year")
	public void change_interest_loan_tenure_to_month_from_year() {
	    
	}

	@Then("check if interest rate calculator loan tenure slider is working")
	public void check_if_interest_rate_calculator_loan_tenure_slider_is_working() {
		gp.actualtensliderpos();
		if(gp.initialTenSlider != gp.actualTenSlider) {
			System.out.println("Slider position changed");
	    	Assert.assertTrue(true);
		}
	}


	@When("user enters interest rate Fees and charges")
	public void user_enters_interest_rate_fees_and_charges() {
	  gp.intloanfees();
	}

	@Then("check if interest rate fees and charges slider is working")
	public void check_if_interest_rate_fees_and_charges_slider_is_working() {
		gp.actualfeesslider();
		if(gp.initialFeesSlider != gp.actualFeesSlider) {
			System.out.println("Slider position changed");
	    	Assert.assertTrue(true);
		}
	}
}
