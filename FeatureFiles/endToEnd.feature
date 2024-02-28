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
      | amount  | rate | tenure |
      | 1500000 |  9.5 |      1 |
      | 2000000 |  8.5 |      2 |

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
      | amount  | rate | tenure |
      | 3000000 |  8.5 |      4 |
      | 1000000 |  7.5 |      5 |

  Scenario Outline: User enters home loan details
    Given user is on home loan emi calculator portal
    When user enters home value "<homeVal>"
    And user enters margin "<margin>"
    And user enters loan insurance "<loanIns>"
    When user enters home loan interest rate "<rate>"
    And user enters loan tenure in year "<year>"
    And user enters loan fees and charges "<fees>"
    And user enters start month
    When user enters one time expenses "<oneExp>"
    And user enters property taxes/year "<taxes>"
    And user enters home insurance/year "<homeins>"
    And user enters maintainance expenses/month "<mainExp>"
    When user scroll to the table
    Then user store the data in excel file

    Examples: 
      | homeVal | margin | loanIns | rate | year | fees  | oneExp | taxes | homeins | mainExp |
      | 4000000 |     30 |  250000 |  9.5 |   10 |  3.5  |     15 |  0.35 |    0.15 |    3000 |
     

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
      | loanAmt | rate | tenure | fees  |
      | 1500000 |  9.5 |      6 | 12000 |
      | 1800000 |  7.5 |      7 | 13000 |

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
      | emi   | rate | tenure | fees |
      | 20000 |   11 |      4 | 9000 |
      | 22000 |   13 |      5 | 8000 |

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
      | loanAmt | emi   | rate | fees  |
      | 1500000 | 22000 |   11 | 11000 |
      | 1700000 | 22100 |    9 | 10000 |

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
      | loanAmt | emi   | tenure | fees |
      | 1200000 | 20000 |      4 | 9000 |
     
