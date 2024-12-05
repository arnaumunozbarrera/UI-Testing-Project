Feature: SelectCategory

Scenario: Show Lateral Tab Info

Given the user is in the index page
When the user clicks on menu 
Then the lateral tab info appears

Scenario: Show Category Products

Given the user clicks on menu 
When the user clicks on a category 
Then the category products appears