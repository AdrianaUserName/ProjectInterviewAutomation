Feature: WebDriver Crossinx - Contact Us

  Scenario: Validate Successful Access
    Given I access the webdriver Crossinx Contact Us
    When I enter a first name
    And I enter a last name
    And I enter an email address
    And I enter a comment
    And I click on the submit button
    Then I should be presented with a successful contact us submission message
