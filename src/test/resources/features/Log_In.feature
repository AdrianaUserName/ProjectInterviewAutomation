Feature: WebDriver Crossinx Log In

  Scenario: Validate Unsuccessful Access
    Given I access the webdriver Crossinx
    When I click on the login button
    And I enter an incorrect first name
    And I enter an incorrect password
    And I click on the login button to access
    Then an error message occurred

