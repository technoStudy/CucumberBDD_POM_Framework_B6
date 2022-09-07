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


  Scenario Outline: Edit Fees
    And User edit Fee "<existingFeeName>" and change it to "<newFeeName>"
    Then Success message should be displayed

    Examples:
      | existingFeeName | newFeeName            |
      | HalitTestFee1   | Updated HalitTestFee1 |
      | HalitTestFee2   | Updated HalitTestFee2 |
      | HalitTestFee3   | Updated HalitTestFee3 |


  Scenario Outline: Delete Fees
    And User delete Fee "<FeeName>"
    Then Success message should be displayed

    Examples:
      | FeeName               |
      | Updated HalitTestFee1 |
      | Updated HalitTestFee2 |
      | Updated HalitTestFee3 |