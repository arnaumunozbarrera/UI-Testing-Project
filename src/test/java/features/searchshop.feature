Feature: SearchShop

Scenario: Show Tab Info
Given the user is in the index page
When the user clicks on shop button menu 
Then the shop location tab info appears

Scenario: Show Search Container
Given the user clicks on shop button menu
When the user enters a location
Then the shop address appears

