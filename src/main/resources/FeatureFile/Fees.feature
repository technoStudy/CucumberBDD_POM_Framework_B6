Feature: Fees Functionality

  Background:
    Given User is on login page
    When User enter admin credentials
    Then User should login successfully


  Scenario Outline: Add Fees
    And User create Fee "<name>" and "<code>" and "<intCode>" and "<priority>"
    Then Success message should be displayed

    Examples:
      | name          | code    | intCode   | priority |
      | HalitTestFee1 | 0109991 | paypal    | 7514     |
      | HalitTestFee2 | 0109929 | applePay  | 7625     |
      | HalitTestFee3 | 0239991 | googlePay | 7535     |