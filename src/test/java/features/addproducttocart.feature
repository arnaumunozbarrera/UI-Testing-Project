Feature: AddProductToCart

Scenario: Add product to Cart
Given the product detail info appears
When the user click on add to cart button
Then cart display appears and contains product

Scenario: Show All Cart
Given cart display appears and contains product
When the user click on go to cart button
Then all cart info appears 

Scenario: Keep Shopping 
Given cart display appears and contains product
When the user click on keep shopping button
Then the product detail info appears