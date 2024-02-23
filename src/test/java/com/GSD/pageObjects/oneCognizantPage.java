package com.GSD.pageObjects;

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

import com.GSD.utils.excelUtils;

public class oneCognizantPage extends basePage {

	public oneCognizantPage(WebDriver driver) {
		super(driver);
		
	}
	
	public String loanAmount , element;
	List<WebElement> Elements;
	String fileName=System.getProperty("user.dir")+"/src/test/resources/HomeLoan.xlsx";
	
	@FindBy(xpath="//*[@class='navbar-brand']")
	WebElement scrollTop;										//Finding the WebElement beCogNews
	JavascriptExecutor js = (JavascriptExecutor) driver;
	
	@FindBy(xpath="//*[@id='menu-item-dropdown-2696']")	//Finding the WebElement oneCTitle
	WebElement clickCalc;
	
	@FindBy(xpath="//*[@class='dropdown-item'][1]")								//Finding the WebElement search
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
	
	public void homeprice() {										//Method for handling the multiple windows
		homePrice.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
		homePrice.sendKeys("4000000");
	}
	
	public void downpayment() {
		downPayment.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
		downPayment.sendKeys("30");
	}
	
	public void insuranceamount() {
		homeLoanIns.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
		homeLoanIns.sendKeys("250000");
	}
	
	/*public void homeloanamount() {
		//homeLoanAmt.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
		loanAmount = homeLoanAmt.getText();
	}*/
	
	public void homeinterest() {
		homeLoanInterest.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
		homeLoanInterest.sendKeys("9.5");
	}
	
	public void hometerm() {
		homeLoanTerm.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
		homeLoanTerm.sendKeys("10");
	}
	
	public void loanfees() {
		loanFees.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
		loanFees.sendKeys("35000");
	}
	
	public void onetime() {
		oneTime.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
		oneTime.sendKeys("15");
	}
	
	public void propertytaxes() {
		propertyTaxes.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
		propertyTaxes.sendKeys("0.35");
	}
	
	public void homeinsurance() {
		homeIns.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
		homeIns.sendKeys("0.15");
	}
	
	public void maintainexp() {
		maintainExp.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
		maintainExp.sendKeys("3000");
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
