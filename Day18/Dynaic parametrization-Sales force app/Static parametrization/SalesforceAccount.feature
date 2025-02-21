Feature: Creating an account in Salesforce application using dynamic parameter

Scenario: Create an account with valid steps

When Click on toggle icon
And Select View all option
And Select Accounts option
And Search for account
And Select first account
And Click the dropdown icon
And Select Edit
And Set type to Tech partner
And Set industry to Healthcare
And Enter the billing address as 'Chennai'
And Enter shipping address as 'Coimbatore'
And Set customer priority to low
And Set SLA to Silver
And Set Active to no
And Set Upsell opportunity to no
And Enter unique num in the phone field as '9998876543'
And Click save
Then verify phone number