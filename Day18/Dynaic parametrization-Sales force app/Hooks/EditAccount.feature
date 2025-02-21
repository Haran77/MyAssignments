Feature: Edit account functionality in leaptaps app
@reg
Scenario: Edit an account in Leaftaps app

When Click on Find accounts option
When Enter account name as 'Haranya' in Account name field
When Click on Find account
When Select first account
When Click on Edit
When Edit decription as 'Java selenium tester'
When Click on save
Then Account should be edited