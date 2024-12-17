Feature: SearchShop

Scenario: Show Tab Info
Given the user is in the index page
When the user clicks on shop button menu 
Then the shop location tab info appears

Scenario: Show Search Shop By City
Given the shop location tab info appears
When the user completes search by city
Then the shop info appears

Scenario: Show Search Shop By PostalCode
Given the user clicks on shop button menu 
When the user completes search by postal code
Then the shop info appears