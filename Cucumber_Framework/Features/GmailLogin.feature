@GmailLogin_Feature
Feature: Login Test
  Description:  Here Im testing the login feature of gmail application
  with valid and invalid credentials

  Background: 
    Given Browser is lanuched
    And gmail url is entered
    Then I should be on the gmail login page

  Scenario: Gmail Login Test With Valid Credentials
    When I enter the valid username "loing@gmail.com"
    And I enter the valid password "123"
    And I click on signing button
    Then I should be seeing the inbox page

  Scenario Outline: Gmail login test with invalid credentials
    When I enter the valid username "<username>"
    And I enter the valid password "<pwd>"
    And I click on signing button
    Then I should be seeing the inbox page

    Examples: 
      | username   | pwd        |
      | viajahsree | sonu123    |
      | archana    | archana234 |
      | soumya     | sian       |
