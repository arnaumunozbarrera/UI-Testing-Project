Feature: Compare2Products

Scenario: Search products to compare
Given the user is in the index page
When the user clicks on search bar button
And the user clicks on submit product search
Then product result list appears

Scenario: Add products to compare
Given the product result list appears
When the user clicks on compare button for product1
And the user clicks on compare button for product2
Then the compare now option appears

Scenario: Show comparison
Given the compare now option appears
When the user clicks on compare now
Then the comparison between products appears

Scenario: Exit comparison
Given the comparison between products appears
When the user clicks on the exit comparison button
And the user clicks on confirm exit comparison
Then previous product added appear