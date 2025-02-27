Feature: Create lead functionality of Leaftaps application
Scenario: Create lead with multiple data

Given Enter the username as 'Demosalesmanager'
Given Enter the password as 'crmsfa'
When Click on the Login
When Click on CRMSFA
When Click on Leads link
When Click on CreateLead link
When Enter company name as 'amazon'
When Enter first name as 'nithya'
When Enter last name as 'varun'
When Click on create lead button
Then Lead should be created
