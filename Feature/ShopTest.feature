#Author: r.ratnakar@accenture.com

@tag
Feature: Argos Website Automation

  @tag1
  Scenario: Test Case to add two expensive items from the Laptop Category to the basket.
    Given open the URL
    And click on the shop menu
    Then click on the technology option
    And click on the Laptop option
    And click on the Macbook option
    Then select the high to low price option from the dropdown
    And add the first item to the basket
    And click on the continue shopping button
    Then add the second item to the basket
    And click on the navigate to trolley option
    Then I close the browser
