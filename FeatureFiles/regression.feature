Feature: Regression cases for Interest Calculator

@regression
Scenario: Validate car loan page
Given user navigated to car loan page
Then user validate change in loan amount slider
And user validate change in rate slider
And user validate change in tenure slider
And user validate pie chart
And user validate graph and table

@regression
Scenario: Validate home loan page
Given user navigated to home loan page
Then user validate monthly payment
And user validate total payment

@regression
Scenario: Validate EMI calculator
Given user navigated to emi calculator page
Then user validated change in amount slider
And user validated change in emi slider
And user validated change in rate slider
And user validated change in tenure slider
And user validated change in fees slider
And user validated graph and table

@regression
Scenario: Validate Loan amount calculator
Given user navigated to loan amount calculator page
Then user validated change in emi slider
And user validated change in rate slider
And user validated change in tenure slider
And user validated change in fees slider
And user validated graph and table

@regression
Scenario: Validate loan tenure calculator
Given user navigated to loan tenure calculator page
Then user validated change in loan amount slider
And user validated change in emi slider
And user validated change in rate slider
And user validated change in fees slider
And user validated graph and table

@regression
Scenario: Validate interest rate calculator
Given user navigated to interest rate calculator
Then user validated change in loan amount slider
And user validated change in emi slider
And user validated change in tenure slider
And user validated change in fees slider
And user validated graph and table