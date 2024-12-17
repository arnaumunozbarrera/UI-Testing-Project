Feature: MakeAReview

Scenario: Show Search Product 
Given the user is in the index page
When the user clicks on search bar button
And the user clicks on submit product search
Then product result list appears

Scenario: Show Search Product Details
Given product result list appears
When the user clicks on product container
Then the product detail info appears

Scenario: Clicks To Make A Review
Given the product detail info appears
When the user clicks on product reviews button
And the user clicks on make a review button
Then the product form review appears


Scenario: Fill out the form review
Given the product form review appears
When the user fill out the form
Then the review appears