Feature: Citizenship Functionality

  Background:
    Given User is on login page
    When User enter admin credentials
    Then User should login successfully


  Scenario: Create Citizenship
    When User create Citizenship with "TestHalitCitizen" name and "THC" shortname
    Then Success message should be displayed


  Scenario: Edit Citizenship
    When User edit "TestHalitCitizen" citizenship to "UpdatedHalitCitizenship"
    Then Success message should be displayed


  Scenario: Delete Citizenship
    When User delete "UpdatedHalitCitizenship" citizenship
    Then Success message should be displayed