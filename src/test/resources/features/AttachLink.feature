Feature: User should be able to attach a link to the specified text.

  Background: For the scenarios below, user should be login successfully.
    Given user is on the login page
    When user enters the HR username
    And user enters the HR password
    And user clicks on the login button
    And user clicks on the send messages button
    Then user lands on the main page
@LUE-1524
  Scenario: User should be able to attach a link to the specified text.
    When user clicks on the link button
    And user types whatever he wants in the link text section
    And user enters the link URL
    And user clicks on the save button
    And user right clicks on the link
    Then user verifies that link is NOT displayed
