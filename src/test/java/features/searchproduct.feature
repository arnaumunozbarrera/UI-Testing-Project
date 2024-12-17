Feature: SearchProduct

Scenario: Show Search Product 
Given the user is in the index page
When the user clicks on search bar button
And the user clicks on submit product search
Then product result list appears

Scenario: Show Search Product Details
Given product result list appears
When the user clicks on product container
Then the product detail info appears