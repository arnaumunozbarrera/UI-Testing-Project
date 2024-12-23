Feature: ReadFrequentQuestions

Scenario: Show Lateral Tab Info

Given the user is in the index page
When the user clicks on menu
Then the lateral tab info appears

Scenario: Go to sale your devices

Given the lateral tab info appears
When the user clicks on sale your devices
Then sale your devices page appears

Scenario: Read the frequent questions

Given sale your devices page appears
When user clicks on how it works the rebuy of devices
Then the answer appears