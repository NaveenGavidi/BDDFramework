Feature: BigSmall Site AutoMate

Scenario Outline: BigSmall contact page Validation

Given User lands on Home Page
When click contact us tab in footer
And Enter the name "<name>" email "<email>" and message "<message>" and click on send
Then Thankyou message displayed 

Examples:
| name | email | message |
| demoOne	| demo123@gmail.com | need some Extra features |