Feature: Delete account functionality in leaftaps app
@reg
Scenario: To delete an account in leaftaps app

When Click Find accounts
When Enter Account name as 'Haranya'
When Click on Find Account button
When Select first acc
When Click on Deactivate the account
When Accept the alert
Then Account should be deactivated