Feature: Validation Values Test Feature
Scenario: Validation Values Test Scenario
Given User is on Values Validation Page
When User reads all the values
Then Verify the right count of values appear on the screen
Then verify the values on the screen are greater than zero
Then verify the total balance is correct based on the values 
Then values are formatted as currencies
Then verify the total balance matches the sum of the values

