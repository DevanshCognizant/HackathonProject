Feature: User navigates to loan calculator

  Scenario: User validates EMI Calculator
    Given user is on EMI calculator portal
    When user enters emi loan amount
    Then check if emi loan amount slider is working
    When user enters emi interest rate
    Then check if emi interest rate slider is working
    When user enters emi loan tenure
    Then change tenure to month from year
    And check if emi loan tenure slider is working
    When user enters emi loan fees and charges
    Then check if emi loan fees and charges is working

  Scenario: User validates loan amount calculator
    Given user is on loan amount calculator
    When user enters emi
    Then check if emi slider is working
    When user enters loan amount interest rate
    Then check if loan interest rate slider is working
    When user enters loan amount tenure
    Then change calculator tenure to month from year
    And check if amount loan tenure slider is working
    When user enters loan Fees and charges
    Then check if loan fees and charges slider is working

  Scenario: User validates loan tenure calculator
    Given user is on loan tenure calculator
    When user enters loan amount
    Then check if calculator loan amount slider is working
    When user enters calculator emi
    Then check if calculator emi slider is working
    When user enters interest rate
    Then check if calculator interest rate slider is working
    When user enters calculator Fees and charges
    Then check if calculator fees and charges slider is working

  Scenario: User validates interest rate calculator
    Given user is on interest rate calculator
    When user enters interest loan amount
    Then check if interest loan amount slider is working
    When user enters interest emi
    Then check if interest emi slider is working
    When user enters loan tenure
    Then change interest loan tenure to month from year
    And check if interest rate calculator loan tenure slider is working
    When user enters interest rate Fees and charges
    Then check if interest rate fees and charges slider is working