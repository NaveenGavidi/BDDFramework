Feature: BigSmall Site AutoMate

Scenario: BigSmall Cart checkout page Validation

Given User lands on Home Page
When Add one product to cart and click on cart section 
And click on checkout button
Then validate the continue button for payment page is availabe or not
