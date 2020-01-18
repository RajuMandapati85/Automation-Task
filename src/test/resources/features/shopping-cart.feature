@cart
Feature: Adding Summer dresses into cart and checkout
    As an Customer when I go to http://automationpractice.com/index.php
    And I add summer dresses into cart
    Then I should be able to go to Sign-in section

    Scenario: Add summer dress into cart
        Given Customer on automation practise home page
        When Customer selects main category "Dresses"
        And Customer selects category "Summer Dresses"
        And Customer adds 2 product into the cart
        And Customer clicks on Proceed to checkout
        And Customer Checkout the Products
        Then Customer should see the Signin page for Checkout
