Feature: Creating an account in Salesforce application using dynamic parameter

@Regression
Scenario Outline: Create an account with valid steps

And Enter Account name as <accountname>
And Select ownership as Public
And Click on Save
Then Account should be created and verified

Examples:
|accountname|
|'Haranya'|
