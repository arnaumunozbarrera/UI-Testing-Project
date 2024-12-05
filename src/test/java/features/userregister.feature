Feature: UserRegister

Scenario: Show Menu Lateral Tab 
Given the user is in the index page
When the user clicks on user menu 
Then the lateral menu tab info appears

Scenario: Show Register form
Given the user clicks on user menu
When the user clicks on register
Then the user register form appears

Scenario: Show Register Error
Given the user register form appears
When the user completes register form incorrectly
And the user clicks on submit
Then the user register message appears

Scenario: Show Register Success
Given the user register form appears
When the user completes register form correctly
And the user clicks on submit
Then the user register message appears
