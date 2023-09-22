Feature: User should be able to add quotes.

  Background: For the scenarios below, user should be login successfully.
    Given user is on the login page
    When user enters the HR username
    And user enters the HR password
    And user clicks on the login button
    And user clicks on the send messages button
    Then user lands on the main page

  Scenario:  User should be able to add quotes.

    When user clicks on the quotes button
    And user enters "quotes"
    Then user verify that quotes is displayed