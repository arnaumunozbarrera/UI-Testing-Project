Feature: ChangeSetting

Scenario: Show Menu Lateral Tab 
Given the user is in the index page
When the user clicks on user menu 
Then the lateral menu tab info appears

Scenario: Show Login form
Given the lateral menu tab info appears
When the user clicks on login
Then the user login form appears

Scenario: Show Login Success
Given the user login form appears
When the user completes form correctly
Then the user correct login message appears

Scenario: User goes to settings page
Given the user correct login message appears
When the user goes to settings profile page
And the user goes to his profile
Then settings profile page appears

Scenario: User changes his name
Given settings profile page appears
When user changes profile name
Then the changes on profile message appears

