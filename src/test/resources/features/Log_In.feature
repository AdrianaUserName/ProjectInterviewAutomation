Feature: WebDriver Crossinx Log In

  Scenario: Validate Unsuccessful Access
    Given I access the webdriver Crossinx
    When I enter an incorrect username
    And I enter an incorrect password
    And I click on the login button to access
    Then an error message occurred

