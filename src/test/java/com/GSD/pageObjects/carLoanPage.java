package com.GSD.pageObjects;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class carLoanPage extends basePage {

	public carLoanPage(WebDriver driver) {
		super(driver);
		
	}
	
	String pAmount,iAmount;
	public String initialAmt, actualAmt, initialInt, actualInt, initialTen, actualTen;
	
	@FindBy(id="car-loan")							//Finding the WebElement username
	WebElement carLoan;
	
	@FindBy(id="loanamount")						//Finding the WebElement next
	WebElement loanAmt;
	
	@FindBy(id="loaninterest")						//Finding the WebElement password
	WebElement loanInt;
	
	@FindBy(id="loanterm")						//Finding the WebElement signin
	WebElement loanTerm;
	
	@FindBy(xpath="(//*[@class='btn btn-secondary active'])[2]")							//Finding the WebElement yes
	WebElement webElement;  //remember me after sign in 
	
	@FindBy(xpath="(//*[@class='btn btn-secondary'])[2]")
	WebElement Emi;
	
	@FindBy(xpath="//*[@id='yearheader']")
	WebElement scrollToYear;
	
	@FindBy(xpath="//*[@id='year2024']")
	WebElement year;
	
	@FindBy(xpath="(//*[@class='col-3 col-sm-2 currency'])[3]")
	WebElement principalAmount;
	
	@FindBy(xpath="(//*[@class='col-3 col-sm-2 currency'])[4]")
	WebElement interestAmount;
	
	@FindBy(xpath="//*[@id=\"loanamountslider\"]/span")
	WebElement amountslider;
	
	@FindBy(xpath="//*[@id=\"loaninterestslider\"]/span")
	WebElement interestslider;
	
	@FindBy(xpath="//*[@id=\"loantermslider\"]/span")
	WebElement loanslider;
	
	public void openLoanCalc() {					//Method for passing the username 
		
		carLoan.click();
		
	}
	
	public void loanAmount(String amount) {									//Method for clicking next button
		loanAmt.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
		loanAmt.sendKeys(amount);
	}
	
	public void interestRate(String rate) {						//Method for passing the password
		loanInt.clear();
		loanInt.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
		loanInt.sendKeys(rate);
	}
	
	public void loanTenure(String tenure) {									//Method for clicking signin button
		loanTerm.clear();
		loanTerm.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
		loanTerm.sendKeys(tenure);
	}
	
	
	public void scrollToElem() {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", webElement);

	}
	
	public void emiSelect1() {
		Emi.click();
	}
	
	public void scrolltoyear() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", scrollToYear);
	}
	
	public void yearSelect() {
		year.click();
	}
	
	public void prinicipalamount() {
		pAmount = principalAmount.getText();
		System.out.println(pAmount);
	}
	
	public void interestamount() {
		iAmount = interestAmount.getText();
		System.out.println(iAmount);
	}
	
	
	public void emiSelect2() {
		Emi.click();
		Emi.click();
	}
	
	public void initialpos() {
		initialAmt = amountslider.getAttribute("style");
		System.out.println("Initial Amount slider: "+initialAmt);
		
		initialInt = interestslider.getAttribute("style");
		System.out.println("Initial Interest slider: "+initialInt);
		
		initialTen = loanslider.getAttribute("style");
		System.out.println("Initial Loan slider: "+initialTen);
	}
	
	public void actualpos() {
		actualAmt = amountslider.getAttribute("style");
		System.out.println("Actual amount slider : "+actualAmt);
		
		actualInt = interestslider.getAttribute("style");
		System.out.println("Actual interest slider : "+actualInt);
		
		actualTen = loanslider.getAttribute("style");
		System.out.println("Actual Loan slider: "+actualTen);
	}

}