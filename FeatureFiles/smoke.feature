Feature: Smoke cases for interest calculator

@smoke
Scenario: Validate car loan button 
Given user navigated to home page
When user click on car loan button

@smoke
Scenario: Validate car loan functionalites 
Given user navigated to car loan portal
When user validate loan amount text box
And user validate rate text box
And user validate loan tenure

@smoke
Scenario: Validate EMI schemes
When user validate EMI in advance
And user validate EMI in arrears

@smoke
Scenario: Validate home loan page
Given user navigated to home loan page
When user validate home loan details text box
And user validate home owner expenses text box
And user validate year on year table

@smoke
Scenario: Validate EMI calculator
Given user navigate to emi calculator page
When user validated emi loan amount text box
And user validated emi rate text box
And user validated loan tenure text box
And user changed tenure from month to year
And user validated emi fees text box

@smoke
Scenario: Validate Loan amount calculator
Given user navigated to loan amount calculator page
When user validated emi amount text box
And user validated loan rate text box
And user validated loan tenure text box
And user validated tenure change from month to year
And user validated fees text box

@smoke
Scenario: Validate loan tenure calculator
Given user navigated to loan tenure calculator
When user validated tenure loan amount text box
And user validated tenure EMI text box
And user validated tenure rate text box
And user validated fees text box

@smoke
Scenario: Validate interest rate calculator
Given user navigated to interest rate calculator
When user validated rate loan amount text box
And user validated rate emi text box
And user validated rate tenure text box
And user validated tenure change from month to year
And user validated rate fees text box