Feature: Print name and age
Scenario: Print details
    Given Name of person "Archana"
    When User enters age 22
    Then print "Archana" and 22