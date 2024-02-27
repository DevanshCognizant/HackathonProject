Feature: Regression cases for Interest Calculator

  @regression
  Scenario: Validate car loan page
    Given user navigated to Car loan page
    Then user validate change in loan amount slider
    And user validate change in rate slider
    And user validate change in tenure slider
    And user validate pie chart
    And user validate graph and table

  @regression
  Scenario: Validate home loan page
    Given user navigated to Home Loan page
    Then user validate monthly payment
    And user validate total payment

  @regression
  Scenario: Validate EMI calculator
    Given user navigated to emi calculator page
    Then user validated change in emi amount slider
    And user validated change in emi rate slider
    And user validated change in emi tenure slider
    And user validated change in emi fees slider
    And user validated graph and table

  @regression
  Scenario: Validate Loan amount calculator
    Given user navigated to Loan amount calculator page
    Then user validated change in loan emi slider
    And user validated change in loan rate slider
    And user validated change in loan tenure slider
    And user validated change in loan fees slider
    And user validated graph and table

  @regression
  Scenario: Validate loan tenure calculator
    Given user navigated to loan tenure calculator page
    Then user validated change in tenure loan amount slider
    And user validated change in tenure emi slider
    And user validated change in tenure rate slider
    And user validated change in tenure fees slider
    And user validated graph and table

  @regression
  Scenario: Validate interest rate calculator
    Given user navigated to Interest rate calculator
    Then user validated change in rate loan amount slider
    And user validated change in rate emi slider
    And user validated change in rate tenure slider
    And user validated change in rate fees slider
    And user validated graph and table
