Feature: AddProductToCart

Scenario: Add product to Cart
Given the user clicks on search bar button
When the user clicks on submit product search
And the user clicks on product container
And the user click on add to cart button
Then cart display appears and contains product

Scenario: Keep Shopping 
Given cart display appears and contains product
When the user click on keep shopping button
Then the product detail info appears

Scenario: Show All Cart
Given the user click on add to cart button
When the user click on go to cart button
Then all cart info appears 