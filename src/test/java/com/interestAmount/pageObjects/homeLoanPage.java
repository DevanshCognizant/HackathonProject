package com.interestAmount.pageObjects;

import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.interestAmount.utils.excelUtils;

public class homeLoanPage extends basePage {

	public homeLoanPage(WebDriver driver) {
		super(driver);
		
	}
	
	public String loanAmount , element;
	List<WebElement> Elements;
	String fileName=System.getProperty("user.dir")+"/src/test/resources/HomeLoan.xlsx";
	
	@FindBy(xpath="//*[@class='navbar-brand']")
	WebElement scrollTop;										
	JavascriptExecutor js = (JavascriptExecutor) driver;
	
	@FindBy(xpath="//*[@id='menu-item-dropdown-2696']")	
	WebElement clickCalc;
	
	@FindBy(xpath="//*[@class='dropdown-item'][1]")								
	WebElement homeEMI;
	
	@FindBy(xpath="//*[@id='homeprice']")
	WebElement homePrice;
	
	@FindBy(xpath="//*[@id='downpayment']")
	WebElement downPayment;
	
	@FindBy(xpath="//*[@id='homeloaninsuranceamount']")
	WebElement homeLoanIns;
	
	@FindBy(xpath="homeloanamount")
	WebElement homeLoanAmt;
	
	@FindBy(xpath="//*[@id='homeloaninterest']")
	WebElement homeLoanInterest;
	
	@FindBy(xpath="//*[@id='homeloanterm']")
	WebElement homeLoanTerm;
	
	@FindBy(xpath="//*[@id='loanfees']")
	WebElement loanFees;
	
	@FindBy(xpath="//*[@id='onetimeexpenses']")
	WebElement oneTime;
	
	@FindBy(xpath="//*[@id='propertytaxes']")
	WebElement propertyTaxes;
	
	@FindBy(xpath="//*[@id='homeinsurance']")
	WebElement homeIns;
	
	@FindBy(xpath="//*[@id='maintenanceexpenses']")
	WebElement maintainExp;
	
	@FindBy(xpath="//*[@id='monthlyprincipalandinterestterm']")
	WebElement scrollToEle;
	
	@FindBy(xpath="(//*[@class='col-4 currency lastdef'])")
	WebElement mainexp;
	
	@FindBy(xpath="(//*[@class='col-3 col-sm-2 col-lg-1'])")
	WebElement scrollToTable;
	
	@FindBy(xpath="//*[@id='startmonthyear']")
	WebElement cal;
	
	@FindBy(xpath="//*[@class='month focused active']")
	WebElement month;
	
	@FindBy(xpath = "//*[@class='row no-margin yearlypaymentdetails']")
	List<WebElement> HomeExcelRow;
	
	@FindBy(xpath = "//*[@class='row no-margin yearlypaymentdetails']/td")
	List<WebElement> homeExcelElements;	
	
	/*public void scrolltop() {									//Method to get the full username
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", scrollTop);
	}*/
	
	public void clickcalc() {						//Method to pass the value into searchbar
		
		clickCalc.click();
	}
	
	public void clickHomeEMI() {										//Method to click on GSDButton														
		homeEMI.click();
	}
	
	public void homeprice(String homeVal) {										//Method for handling the multiple windows
		homePrice.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
		homePrice.sendKeys(homeVal);
	}
	
	public void downpayment(String margin) {
		downPayment.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
		downPayment.sendKeys(margin);
	}
	
	public void insuranceamount(String loanIns) {
		homeLoanIns.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
		homeLoanIns.sendKeys(loanIns);
	}
	
	
	public void homeinterest(String rate) {
		homeLoanInterest.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
		homeLoanInterest.sendKeys(rate);
	}
	
	public void hometerm(String year) {
		homeLoanTerm.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
		homeLoanTerm.sendKeys(year);
	}
	
	public void loanfees(String fees) {
		loanFees.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
		loanFees.sendKeys(fees);
	}
	
	public void onetime(String oneExp) {
		oneTime.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
		oneTime.sendKeys(oneExp);
	}
	
	public void propertytaxes(String taxes) {
		propertyTaxes.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
		propertyTaxes.sendKeys(taxes);
	}
	
	public void homeinsurance(String homeins) {
		homeIns.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
		homeIns.sendKeys(homeins);
	}
	
	public void maintainexp(String mainExp) {
		maintainExp.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
		maintainExp.sendKeys(mainExp);
	}
	
	public void selectmonth() {
		cal.click();
		month.click();
	}
	
	public void scrolltoele() {
		js.executeScript("arguments[0].scrollIntoView();", scrollToEle);

	}
	
	public void Elements() {
	Elements = driver.findElements(By.xpath("//*[@class='col-4 currency']"));
	
	/*for(int i=0;i<Elements.size();i++) {
		element = driver.findElement(By.xpath("(//*[@class='col-4 currency'])["+i+"]")).getText();
		System.out.println(element);
	 }*/
	
	System.out.println("Maintainance Expense: "+mainexp.getText());
	}
	
	public void scrolltotable() {
		js.executeScript("arguments[0].scrollIntoView();", scrollToTable);
	}
	
	public void writeExcelSheet() throws IOException {
		int a=0;
		for(int i =1; i<HomeExcelRow.size()+1;i++) {
			for(int j=0;j<7;j++) {
				String celData = homeExcelElements.get(a).getText();
				excelUtils.setCellData(fileName, "Sheet1", i, j, celData);
				a++;
			}
		}
	}
	
}
