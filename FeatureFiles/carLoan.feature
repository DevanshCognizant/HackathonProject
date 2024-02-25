Feature: User navigates to EMICalculator

  Scenario Outline: User calculate interest amount & principal amount in EMI in advance
    Given user opens car loan portal in EMICalculator
    When user enters car loan amount "<amount>"
    Then check if loan amount slider is working
    When user enters car interest rate "<rate>"
    Then check if interest rate slider is working
    When user enters car loan tenure "<tenure>"
    Then check if loan tenure slider is working
    When user selects EMI in advance options
    And user clicks on top year
    Then user print first month interest amount and principal amount
    
    Examples:
    | amount | rate | tenure |
    | 1500000| 9.5  | 	1		 |
    | 2000000| 8.5  |   2    |
    
    
  Scenario Outline: User calculate interest amount & principal amount in EMI in arrears
    Given user opens car loan portal in EMICalculator
    When user enters car loan amount "<amount>"
    Then check if loan amount slider is working
    When user enters car interest rate "<rate>"
    Then check if interest rate slider is working
    When user enters car loan tenure "<tenure>"
    Then check if loan tenure slider is working
    When user selects EMI in Arrears options
    And user clicks on top year
    Then user prints first month interest amount and principal amount
    
     Examples:
    | amount | rate | tenure |
    | 3000000| 8.5  | 	4		 |
    | 1000000| 7.5  |   5    |
