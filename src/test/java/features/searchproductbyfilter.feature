Feature: SearchProductByFilter

Scenario: Show Search Product 
Given the user is in the index page
When the user clicks on search bar button
And the user clicks on submit product search
Then product result list appears

Scenario: Show List Best Result Of Products
Given product list appears
When the user changes to the best results
Then best product result list appears

Scenario: Show List Of Most Saled Products
Given product list appears
When the user changes to most saled products
Then most saled products result list appears
