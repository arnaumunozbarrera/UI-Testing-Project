Feature: UserLogIn

Scenario: Show Menu Lateral Tab 
Given the user is in the index page
When the user clicks on user menu 
Then the lateral menu tab info appears

Scenario: Show Login form
Given the user clicks on user menu
When the user clicks on login
Then the user login form appears

Scenario: Show Login Error
Given the user login form appears
When the user completes form incorrectly
And the user clicks on submit
Then the user login message appears

Scenario: Show Login Success
Given the user login form appears
When the user completes form correctly
And the user clicks on submit
Then the user login message appears
