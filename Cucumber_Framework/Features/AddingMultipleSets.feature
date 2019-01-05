@additionmanysets
Feature: Addition of two number
Scenario Outline: Adding two number
	 Given Two integer numbers <param_1> and <param_2>
    When user adds number
    Then output should be displayed
		
		Examples:
		| param_1 | param_2 |
		| 1 | 2 |
		| 3 |3 |
		