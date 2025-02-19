Feature: Creating an account in Salesforce application

@Regression
Scenario: Create an account with valid steps

When Enter username as dilip@testleaf.com
And Enter password as 'Test@2025'
And Click on login option
And Click on toggle menu button from left corner
And Click on View all
And Click on Sales from App launcher
And Click on Accounts tab
And Click on New button
And Enter Account name as Haranya
And Select ownership as Public
And Click on Save
Then Account should be created and verified

