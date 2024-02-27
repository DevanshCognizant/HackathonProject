package com.interestAmount.pageObjects;

import java.io.IOException;
import java.time.Duration;
import java.time.Month;
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

import com.interestAmount.utils.*;

public class calcLoanPage extends basePage {

	public calcLoanPage(WebDriver driver) {
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
	
	@FindBy(xpath="(//*[@class='btn btn-secondary active'])[2]")							//Finding the WebElement yes
	WebElement webElement;
	
	@FindBy(xpath="//*[@class='btn-group btn-group-toggle add-check']")
	public WebElement schemes;
	
	@FindBy(xpath="//*[@class='row gutter-left gutter-right']")
	public WebElement paymentTable;
	
	@FindBy(xpath="//*[@class='col-md-4 col-lg-5 control-label']")
	WebElement scrollGraph;
	
	@FindBy(xpath="(//*[@class='highcharts-plot-background'])[2]")
	public WebElement graph;
	
	@FindBy(xpath="(//*[@class='highcharts-legend-box'])[2]")
	WebElement scrollTable;
	
	@FindBy(xpath="//*[@class='btn btn-secondary']")
	WebElement monthClick;
	
	@FindBy(xpath="(//*[@class='btn btn-secondary active'])[1]")
	WebElement activeMonth;
	
	@FindBy(xpath="//*[@id='loanpaymenttable']")
	public WebElement yearTable;
	
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
	
	public void emiloanamount(String loanAmt) {
		LoanAmount.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
		LoanAmount.sendKeys(loanAmt);
	}
	
	public void emiinterest(String rate) {
		Interest.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
		Interest.sendKeys(rate);
	}
	
	public void emiloanterm(String term) {
		Term.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
		Term.sendKeys(term);
	}
	
	public void emiloanfees(String fees) {
		Fees.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
		Fees.sendKeys(fees);
	}
	
	
	public void emiamt(String emi) {
		Emi.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
		Emi.sendKeys(emi);
	}
	
	public void emirate(String rate) {
		Interest.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
		Interest.sendKeys(rate);
	}
	
	public void emiterm(String term) {
		Term.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
		Term.sendKeys(term);
	}
	
	public void emifees(String fees) {
		Fees.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
		Fees.sendKeys(fees);
	}
	
	public void tenureamt(String amt) {
		LoanAmount.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
		LoanAmount.sendKeys(amt);
	}
	
	public void tenureemi(String emi) {
		Emi.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
		Emi.sendKeys(emi);
	}
	
	public void tenurerate(String rate) {
		Interest.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
		Interest.sendKeys(rate);
	}
	
	public void tenurefees(String fees) {
		Fees.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
		Fees.sendKeys(fees);
	}
	
	public void intloanamt(String loanAmt) {
		LoanAmount.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
		LoanAmount.sendKeys(loanAmt);
	}
	
	public void intloanemi(String emi) {
		Emi.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
		Emi.sendKeys(emi);
	}
	
	public void intloanterm(String term) {
		Term.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
		Term.sendKeys(term);
	}
	
	public void intloanfees(String fees) {
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
	
	public void scrollToSchemes() {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", webElement);

	}
	
	public void scrollToGraph() {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", scrollGraph);

	}
	
	public void scrollTotable() {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", scrollTable);

	}
	
	public void monthclick() {
		monthClick.click();
		monthClick.click();
	}
	
}