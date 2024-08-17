@smoke
Feature: To test on flipkart application

  Scenario: To search for mobiles under Rs 20000 on flipkart
    Given user opens flipkart applications
    When User searches for mobiles under Rs20000
    Then All mobiles under Rs20000 are displayed
