Feature: User navigates to loan calculator

  Scenario Outline: User validates EMI Calculator
    Given user is on EMI calculator portal
    When user enters emi loan amount "<loanAmt>"
    Then check if emi loan amount slider is working
    When user enters emi interest rate "<rate>"
    Then check if emi interest rate slider is working
    When user enters emi loan tenure "<tenure>"
    Then change tenure to month from year
    And check if emi loan tenure slider is working
    When user enters emi loan fees and charges "<fees>"
    Then check if emi loan fees and charges is working
    And check if emi calculator emi schemes visible
    And check if emi calculator total payment table visible
    And check if emi calculator graph visible
    And check if emi calculator year on year table visible
    
    Examples:
    | loanAmt | rate | tenure | fees |
    | 1500000 | 9.5  |   6    | 12000|
    | 1800000 | 7.5  |   7    | 13000|
    
  Scenario Outline: User validates loan amount calculator
    Given user is on loan amount calculator
    When user enters emi "<emi>"
    Then check if emi slider is working
    When user enters loan amount interest rate "<rate>"
    Then check if loan interest rate slider is working
    When user enters loan amount tenure "<tenure>"
    Then change calculator tenure to month from year
    And check if amount loan tenure slider is working
    When user enters loan Fees and charges "<fees>"
    Then check if loan fees and charges slider is working
    And check if loan amount calculator emi schemes visible
    And check if loan amount calculator total payment table visible
    And check if loan amount calculator graph visible
    And check if loan amount calculator year on year table visible
    
    Examples:
    | emi | rate | tenure | fees |
    |20000|  11  |   4    | 9000 |
    |22000|  13  |   5    | 8000 |

  Scenario Outline: User validates loan tenure calculator
    Given user is on loan tenure calculator
    When user enters loan amount "<loanAmt>"
    Then check if calculator loan amount slider is working
    When user enters calculator emi "<emi>"
    Then check if calculator emi slider is working
    When user enters interest rate "<rate>"
    Then check if calculator interest rate slider is working
    When user enters calculator Fees and charges "<fees>"
    Then check if calculator fees and charges slider is working
    And check if loan tenure calculator emi schemes visible
    And check if loan tenure calculator total payment table visible
    And check if loan tenure calculator graph visible
    And check if loan tenure calculator year on year table visible
    
    Examples:
    | loanAmt | emi | rate | fees |
    | 1500000 |22000|  11  | 11000|
    | 1700000 |22100|  9   | 10000|
    
  Scenario Outline: User validates interest rate calculator
    Given user is on interest rate calculator
    When user enters interest loan amount "<loanAmt>"
    Then check if interest loan amount slider is working
    When user enters interest emi "<emi>"
    Then check if interest emi slider is working
    When user enters loan tenure "<tenure>"
    Then change interest loan tenure to month from year
    And check if interest rate calculator loan tenure slider is working
    When user enters interest rate Fees and charges "<fees>"
    Then check if interest rate fees and charges slider is working
    And check if interest rate calculator emi schemes visible
    And check if interest rate calculator total payment table visible
    And check if interest rate calculator graph visible
    And check if interest rate calculator year on year table visible
    
    Examples:
    | loanAmt | emi | tenure | fees|
    | 1200000 |20000|   4    |9000 |
    | 1400000 |25000|   6    |8000 |