Feature: Create Account functionality of Leaftaps application
@reg
Scenario Outline: Create an account in Leaftaps app

And Click on Create account option
And Enter account name as <accname>
And Enter description as <desc>
And Give create account
Then Account should be created

Examples:
|accname|desc|
|'Haranya'|'Automation tester'|
|'Haran'|'Manual tester'|