Feature: BigSmall Site AutoMate

Scenario: BigSmall wishlist page Validation

Given User lands on Home Page
When click on a product and click on add to cart
And click on wishlist tab on the page
Then validate that the product is available in wishlist or not
