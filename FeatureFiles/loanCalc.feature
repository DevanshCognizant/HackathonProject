Feature: User navigates to loan calculator
	Scenario: User validates EMI Calculator
		Given: user is on EMI calculator portal
		When user enters loan amount 
    Then check if loan amount slider is working 
    When user enters interest rate
    Then check if interest rate slider is working
    When user enters loan tenure
    Then change tenure to month from year
    And check if loan tenure slider is working
  Scenario: User validates loan amount calculator
  	Given: user is on loan amount calculator
  	When user enters emi 
    Then check if emi slider is working 
    When user enters interest rate
    Then check if interest rate slider is working
    When user enters loan tenure
    Then change tenure to month from year
    And check if loan tenure slider is working
    When user enters Fees and charges
    Then check if fees and charges slider is working
  Scenario: User validates loan tenure calculator
  	Given user is on loan tenure calculator
  	When user enters loan amount 
    Then check if loan amount slider is working 
    When user enters emi
    Then check if emi slider is working
    When user enters interest rate
    Then check if interest rate slider is working
    When user enters Fees and charges
    Then check if fees and charges slider is working
  Scenario: User validates interest rate calculator
  	Given user is on interest rate calculator
  	When user enters loan amount 
    Then check if loan amount slider is working 
    When user enters emi
    Then check if emi slider is working
    When user enters loan tenure
    Then change tenure to month from year
    And check if loan tenure slider is working
    When user enters interest rate
    Then check if interest rate slider is working
    When user enters Fees and charges
    Then check if fees and charges slider is working