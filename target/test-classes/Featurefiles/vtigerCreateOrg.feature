@smoke
Feature: Testing the organizations option on vtigercrm

  Scenario: Creaate a new organization in vtigercrm and verify the name of the organizarion
    Given User opens vtigercrm application
    When User logs into vtigercrm application
    And User clicks on the organizations option
    And User clicks on lookup img
    And User enters the organization name
    And User clicks on save button
    And Organization information page is displayed
    Then User verifies the title of the organization
