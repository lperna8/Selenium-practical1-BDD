Feature: Test the search functionality on Amazon website

Scenario: User should be able to search on Appium book in Amazon
Given User is on Amazons landing page
When User searches for Appium book
Then Search results are displayed

Scenario: User should select the 10th book from the search results page
Given User is on Search results page
When User reviews the Appium book search results
Then user selects the 10th book


Scenario: User adds the book to the cart
Given User selected the 10th book
When User checks the ratings of the books
Then User adds the book to the cart
And user reviews the total price of the book