Feature: Create Account functionality of Leaftaps application

Scenario: Create an account in Leaftaps app

Given Enter Username as 'Demosalesmanager'
Given Enter password as 'crmsfa'
When Click on Login Button
When Click on CRMSFA link
When Click on Accounts option
When Click on Create account option
When Enter account name as 'nila'
When Enter description as 'sta'
When Give create account
Then Account should be created