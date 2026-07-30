Feature: Add to Product


  Background:
    Given user launches the SauceDemo application


  Scenario: Successful login with valid credentials

    When user enters valid username and password

    And clicks on login button

    Then user should be navigated to Products page

    And Add "Sauce Labs Backpack" to the cart