Feature: Login Campus Functionality

  @Regression
  Scenario: Login Admin Account
    Given User is on login page
    When User enter admin credentials
    Then User should login successfully