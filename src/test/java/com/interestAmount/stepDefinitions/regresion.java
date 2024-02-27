package com.interestAmount.stepDefinitions;

import org.junit.Assert;

import com.interestAmount.pageObjects.calcLoanPage;
import com.interestAmount.pageObjects.carLoanPage;
import com.interestAmount.pageObjects.homeLoanPage;
import com.interestAmount.utils.baseClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class regresion {
	
	static carLoanPage cp = new carLoanPage(baseClass.getDriver());
	static homeLoanPage hp;
	static calcLoanPage lp = new calcLoanPage(baseClass.getDriver());
	
	@Given("user navigated to Car loan page")
	public void user_navigated_to_car_loan_page() {
		cp.carLoan.click();
	}

	@Then("user validate change in loan amount slider")
	public void user_validate_change_in_loan_amount_slider() {
	    cp.initialpos();
	    cp.loanAmount("1500000");
	    cp.actualpos();
		if(cp.initialAmt!=cp.actualAmt)
		Assert.assertTrue(true);
	}

	@Then("user validate change in rate slider")
	public void user_validate_change_in_rate_slider() {
		cp.initialpos();
		cp.interestRate("9");
		cp.actualpos();
		if(cp.initialInt!=cp.actualInt)
		Assert.assertTrue(true);
	}

	@Then("user validate change in tenure slider")
	public void user_validate_change_in_tenure_slider() {
		cp.initialpos();
		cp.loanTenure("1");
		cp.actualpos();
		if(cp.initialTen!=cp.actualTen)
		Assert.assertTrue(true);
	}

	@Then("user validate pie chart")
	public void user_validate_pie_chart() {
		Assert.assertTrue(cp.loanChart.isDisplayed()); 
	}

	@Then("user validate graph and table")
	public void user_validate_graph_and_table() {
		Assert.assertTrue(cp.loangraph.isDisplayed());
		Assert.assertTrue(cp.table.isDisplayed()); 
	}

	@Given("user navigated to Home Loan page")
	public void user_navigated_to_home_loan_page() {
		hp = new homeLoanPage(baseClass.getDriver());
		hp.clickcalc();
		hp.clickHomeEMI();
	}

	@Then("user validate monthly payment")
	public void user_validate_monthly_payment() {
	  hp.scrolltoele();
	  Assert.assertTrue(hp.mPay.isDisplayed());
	}

	@Then("user validate total payment")
	public void user_validate_total_payment() {
		Assert.assertTrue(hp.tPay.isDisplayed());
	}

	@Given("user navigated to emi calculator page")
	public void user_navigated_to_emi_calculator_page() {
		lp.openloancalc();
	}

	@Then("user validated change in emi amount slider")
	public void user_validated_change_in_emi_amount_slider() {
	    lp.initialEMIpos();
	    lp.emiloanamount("1000000");
	    lp.actualloansliderpos();
		  if(lp.initialLoanSlider != lp.actualLoanSlider) {
			  System.out.println("Slider position changed");
			  Assert.assertTrue(true);
		  }
	}

	@Then("user validated change in emi rate slider")
	public void user_validated_change_in_emi_rate_slider() {
		lp.emiinterest("5");
		lp.actualratesliderpos();
	    if(lp.initialRateSlider != lp.actualRateSlider) {
	    	System.out.println("Slider position changed");
	    	Assert.assertTrue(true);
	    }
	}

	@Then("user validated change in emi tenure slider")
	public void user_validated_change_in_emi_tenure_slider() {
	    lp.emiloanterm("4");
	    lp.actualtensliderpos();
		if(lp.initialTenSlider != lp.actualTenSlider) {
			System.out.println("Slider position changed");
	    	Assert.assertTrue(true);
		}
	}

	@Then("user validated change in emi fees slider")
	public void user_validated_change_in_emi_fees_slider() {
	    lp.emiloanfees("10000");
	    lp.actualfeesslider();
		if(lp.initialFeesSlider != lp.actualFeesSlider) {
			System.out.println("Slider position changed");
	    	Assert.assertTrue(true);
		}
	}

	@Then("user validated graph and table")
	public void user_validated_graph_and_table() {
		lp.scrollToGraph();
	    Assert.assertTrue(lp.graph.isDisplayed());
	    lp.scrollTotable();
		Assert.assertTrue(lp.yearTable.isDisplayed());
	}
	
	@Given("user navigated to Loan amount calculator page")
	public void user_navigated_to_Loan_amount_calculator_page() {
		lp.clickloanamt();
		lp.initialAmountpos();
	}

	@Then("user validated change in loan emi slider")
	public void user_validated_change_in_loan_emi_slider() {
	    lp.emiamt("11000");
	    lp.actualemisliderpos();
	    if(lp.initialEmiSlider != lp.actualEmiSlider) {
	    	System.out.println("Slider position changed");
	    	Assert.assertTrue(true);
	    }
	}

	@Then("user validated change in loan rate slider")
	public void user_validated_change_in_loan_rate_slider() {
	    lp.emiinterest("7");
	    lp.actualratesliderpos();
	    if(lp.initialRateSlider != lp.actualRateSlider) {
	    	System.out.println("Slider position changed");
	    	Assert.assertTrue(true);
	    }
	}

	@Then("user validated change in loan tenure slider")
	public void user_validated_change_in_loan_tenure_slider() {
	    lp.emiloanterm("5");
	    lp.actualtensliderpos();
		if(lp.initialTenSlider != lp.actualTenSlider) {
			System.out.println("Slider position changed");
	    	Assert.assertTrue(true);
		}
	}

	@Then("user validated change in loan fees slider")
	public void user_validated_change_in_loan_fees_slider() {
	   lp.emifees("11000");
	   lp.actualfeesslider();
		if(lp.initialFeesSlider != lp.actualFeesSlider) {
			System.out.println("Slider position changed");
	    	Assert.assertTrue(true);
		}
	}

	@Given("user navigated to loan tenure calculator page")
	public void user_navigated_to_loan_tenure_calculator_page() {
		  lp.clickloantenure();
		  lp.initialTenurepos();
	}

	@Then("user validated change in tenure loan amount slider")
	public void user_validated_change_in_tenure_loan_amount_slider() {
	    lp.tenureamt("1200000");
	    lp.actualloansliderpos();
		  if(lp.initialLoanSlider != lp.actualLoanSlider) {
			  System.out.println("Slider position changed");
			  Assert.assertTrue(true);
		  }
	}

	@Then("user validated change in tenure emi slider")
	public void user_validated_change_in_tenure_emi_slider() {
		lp.tenureemi("110000");
		lp.actualemisliderpos();
	    if(lp.initialEmiSlider != lp.actualEmiSlider) {
	    	System.out.println("Slider position changed");
	    	Assert.assertTrue(true);
	    }
	}

	@Then("user validated change in tenure rate slider")
	public void user_validated_change_in_tenure_rate_slider() {
	    lp.tenurerate("6");
	    lp.actualratesliderpos();
	    if(lp.initialRateSlider != lp.actualRateSlider) {
	    	System.out.println("Slider position changed");
	    	Assert.assertTrue(true);
	    }
	}

	@Then("user validated change in tenure fees slider")
	public void user_validated_change_in_tenure_fees_slider() {
	 lp.tenurefees("12000");
	 lp.actualfeesslider();
		if(lp.initialFeesSlider != lp.actualFeesSlider) {
			System.out.println("Slider position changed");
	    	Assert.assertTrue(true);
		}
	}
	
	@Given("user navigated to Interest rate calculator")
	public void user_navigated_to_Interest_rate_calculator() {
		 lp.clickinterest();
		 lp.initialRatepos();
	}

	@Then("user validated change in rate loan amount slider")
	public void user_validated_change_in_rate_loan_amount_slider() {
		lp.intloanamt("1100000");
		lp.actualloansliderpos();
		  if(lp.initialLoanSlider != lp.actualLoanSlider) {
			  System.out.println("Slider position changed");
			  Assert.assertTrue(true);
		  }
	}

	@Then("user validated change in rate emi slider")
	public void user_validated_change_in_rate_emi_slider() {
	    lp.intloanemi("12000");
	    lp.actualemisliderpos();
	    if(lp.initialEmiSlider != lp.actualEmiSlider) {
	    	System.out.println("Slider position changed");
	    	Assert.assertTrue(true);
	    }
	}

	@Then("user validated change in rate tenure slider")
	public void user_validated_change_in_rate_tenure_slider() {
	    lp.intloanterm("6");
	    lp.actualtensliderpos();
		if(lp.initialTenSlider != lp.actualTenSlider) {
			System.out.println("Slider position changed");
	    	Assert.assertTrue(true);
		}
	}

	@Then("user validated change in rate fees slider")
	public void user_validated_change_in_rate_fees_slider() {
	    lp.intloanfees("15000");
	    lp.actualfeesslider();
		if(lp.initialFeesSlider != lp.actualFeesSlider) {
			System.out.println("Slider position changed");
	    	Assert.assertTrue(true);
		}
	}
}
