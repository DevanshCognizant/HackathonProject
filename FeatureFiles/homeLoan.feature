Feature: Navigating to home loan EMI calculator portal
 
  Scenario: User enters home loan details
    Given user is on home loan emi calculator portal
    When user enters home value
    And user enters margin
    And user enters loan insurance
    Then user checks loan amount
    When user enters interest rate
    And user enters loan tenure in month
    And user enters loan fees and charges
    Then user validates start month and year 

  Scenario: User enters home owner expenses
    Given user is on home loan emi calculator portal
    When user enters one time expenses
    And user enters property taxes/year
    And user enters home insurance/year
    And user enters maintainance expenses/month
  Scenario: User extracts data from year on year table
  	Given user entered home loan details and home owner expenses
  	When user scroll to the table 
  	Then user store the data in excel file