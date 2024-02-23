Feature: User navigates to EMICalculator

  Scenario: User calculate interest amount & principal amount for one month
    Given user opens car loan portal in EMICalculator
    When user enters car loan amount
    Then check if loan amount slider is working
    When user enters car interest rate
    Then check if interest rate slider is working
    When user enters car loan tenure
    Then check if loan tenure slider is working

  Scenario: User selects EMI schemes
    When user selects EMI in advance options
    And user clicks on top year
    Then user print first month interest amount and principal amount
    When user selects EMI in Arrears options
    And user clicks on top year
    Then user prints first month interest amount and principal amount
