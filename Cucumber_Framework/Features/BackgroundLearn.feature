Feature: To learn how to use background
Background: Appication is launched
    Given Browser is launched 
    And Url is entered
Scenario: Login to app
    Given User is in Loginpage
    When User enter credentials
    Then Homepage should be displayed