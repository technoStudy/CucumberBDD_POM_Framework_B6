Feature: Countries Functionality

  Scenario: Create Country
    Given User is on login page
    When User enter admin credentials
    Then User should login successfully
    When User create Country
    Then Success message should be displayed


  Scenario: Edit Country
    Given User is on login page
    When User enter admin credentials
    Then User should login successfully
    When User edit Country
    Then Success message should be displayed


  Scenario: Delete Country
    Given User is on login page
    When User enter admin credentials
    Then User should login successfully
    When User delete Country
    Then Success message should be displayed