Feature: Navigating to home loan EMI calculator portal
 
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
    | homeVal | margin | loanIns | rate | year | fees | oneExp | taxes | homeins | mainExp |
    | 4000000 |   30   |  250000 |  9.5 |  10  | 35000|   15   |  0.35 |  0.15   |  3000   |
    | 3500000 |   27   |  200000 |   8  |  12  | 30000|   20   |  0.31 |  0.17   |  2700   |    