package com.GSD.pageObjects;

import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.GSD.utils.*;

public class GSDPage extends basePage {

	public GSDPage(WebDriver driver) {
		super(driver);
		
	}
	
	public String initialLoanSlider, initialEmiSlider, initialRateSlider, initialTenSlider, initialFeesSlider, actualLoanSlider, actualEmiSlider, actualRateSlider, actualTenSlider, actualFeesSlider;
	
	@FindBy(xpath="//*[@class='dropdown-toggle nav-link']")								//Finding the WebElement iframe
	WebElement clickCalc;
	
	@FindBy(xpath="(//*[@class='dropdown-item'])[2]")						//Finding the WebElement GSDTitle
	WebElement clickLoan;
	
	@FindBy(xpath="//*[@id='loanamount']")
	WebElement LoanAmount;
	
	@FindBy(xpath="//*[@id='loaninterest']")
	WebElement Interest;
	
	@FindBy(xpath="//*[@id='loanterm']")
	WebElement Term;
	
	@FindBy(xpath="//*[@id='loanfees']")
	WebElement Fees;
	
	@FindBy(xpath="//*[@id='loan-amount-calc']")
	WebElement clickLoanAmt;
	
	@FindBy(xpath="//*[@id='loanemi']")
	WebElement Emi;
	
	@FindBy(xpath="//*[@id='loan-tenure-calc']")
	WebElement clickLoanTenure;
	
	@FindBy(xpath="//*[@id='interest-rate-calc']")
	WebElement clickInterest;
	
	@FindBy(xpath="(//*[@class='ui-slider-handle ui-corner-all ui-state-default'])[1]")
	WebElement loanAmtSlider;
	
	@FindBy(xpath="(//*[@class='ui-slider-handle ui-corner-all ui-state-default'])[2]")
	WebElement emiSlider;
	
	@FindBy(xpath="(//*[@class='ui-slider-handle ui-corner-all ui-state-default'])[3]")
	WebElement rateSlider;
	
	@FindBy(xpath="(//*[@class='ui-slider-handle ui-corner-all ui-state-default'])[4]")
	WebElement tenSlider;
	
	@FindBy(xpath="(//*[@class='ui-slider-handle ui-corner-all ui-state-default'])[5]")
	WebElement feesSlider;
	
	public void openloancalc() {
		clickCalc.click();
		clickLoan.click();
	}
	
	public void clickloanamt() {
		clickLoanAmt.click();
	}
	
	public void clickloantenure() {
		clickLoanTenure.click();
	}
	
	public void clickinterest() {
		clickInterest.click();
	}
	
	public void emiloanamount() {
		LoanAmount.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
		LoanAmount.sendKeys("1500000");
	}
	
	public void emiinterest() {
		Interest.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
		Interest.sendKeys("9.5");
	}
	
	public void emiloanterm() {
		Term.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
		Term.sendKeys("6");
	}
	
	public void emiloanfees() {
		Fees.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
		Fees.sendKeys("12000");
	}
	
	
	public void emiamt() {
		Emi.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
		Emi.sendKeys("20000");
	}
	
	public void emirate() {
		Interest.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
		Interest.sendKeys("11");
	}
	
	public void emiterm() {
		Term.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
		Term.sendKeys("4");
	}
	
	public void emifees() {
		Fees.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
		Fees.sendKeys("9000");
	}
	
	public void tenureamt() {
		LoanAmount.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
		LoanAmount.sendKeys("1500000");
	}
	
	public void tenureemi() {
		Emi.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
		Emi.sendKeys("22000");
	}
	
	public void tenurerate() {
		Interest.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
		Interest.sendKeys("11");
	}
	
	public void tenurefees() {
		Fees.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
		Fees.sendKeys("11000");
	}
	
	public void intloanamt() {
		LoanAmount.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
		LoanAmount.sendKeys("1200000");
	}
	
	public void intloanemi() {
		Emi.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
		Emi.sendKeys("20000");
	}
	
	public void intloanterm() {
		Term.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
		Term.sendKeys("4");
	}
	
	public void intloanfees() {
		Fees.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
		Fees.sendKeys("9000");
	}
	
	public void initialEMIpos() {
		initialLoanSlider = loanAmtSlider.getAttribute("style");
		initialRateSlider = rateSlider.getAttribute("style");
		initialTenSlider = tenSlider.getAttribute("style");
		initialFeesSlider = feesSlider.getAttribute("style");
	}
	
	public void initialAmountpos() {
		initialEmiSlider = emiSlider.getAttribute("style");
		initialRateSlider = rateSlider.getAttribute("style");
		initialTenSlider = tenSlider.getAttribute("style");
		initialFeesSlider = feesSlider.getAttribute("style");
	}
	
	public void initialTenurepos() {
		initialLoanSlider = loanAmtSlider.getAttribute("style");
		initialEmiSlider = emiSlider.getAttribute("style");
		initialRateSlider = rateSlider.getAttribute("style");
		initialFeesSlider = feesSlider.getAttribute("style");
	}
	
	public void initialRatepos() {
		initialLoanSlider = loanAmtSlider.getAttribute("style");
		initialEmiSlider = emiSlider.getAttribute("style");
		initialTenSlider = tenSlider.getAttribute("style");
		initialFeesSlider = feesSlider.getAttribute("style");
	}
	
	public void actualloansliderpos() {
		actualLoanSlider = loanAmtSlider.getAttribute("style");
	}
	
	public void actualemisliderpos() {
		actualEmiSlider = emiSlider.getAttribute("style");
	}
	
	public void actualratesliderpos() {
		actualRateSlider = rateSlider.getAttribute("style");
	}
	
	public void actualtensliderpos() {
		actualTenSlider = tenSlider.getAttribute("style");
	}
	
	public void actualfeesslider() {
		actualFeesSlider = feesSlider.getAttribute("style");
	}
}