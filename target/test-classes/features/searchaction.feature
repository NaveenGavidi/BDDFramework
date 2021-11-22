Feature: BigSmall Site AutoMate

Scenario Outline: BigSmall search tab Validation

Given User lands on Home Page
When user enter a product name "<product>" and click on search 
Then result page title is verified

Examples:
	| product |
	| key chains |