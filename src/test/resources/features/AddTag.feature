Feature: User should be able to add tags to messages and also remove tags before sending the message

  Background: For the scenarios below, user should be login successfully.
    Given user is on the login page
    When user enters the HR username
    And user enters the HR password
    And user clicks on the login button
    And user clicks on the send messages button
    Then user lands on the main page
@"LUE-1526"
  Scenario: User should be able to add tags to messages and also remove tags before sending the message
    When user clicks on the add tag button
    And user enters the "tag"
    And user clicks on the add button
    And user deletes the tag before sending the message
    Then user verifies that the tag is deleted