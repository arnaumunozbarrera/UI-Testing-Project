Feature: FilterProduct

Scenario: Search product
Given the user is in the index page
When the user clicks on search bar button
And the user clicks on submit product search
Then product result list appears

Scenario: Add product filters
Given the product result list appears
When the user clicks on filter1 button 
And the user clicks on filter2 button 
And the user clicks on filter3 button 
And the user clicks on filter4 button 
And the user clicks on filter5 button 
Then the new product result list appears