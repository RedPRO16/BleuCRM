@hasan
Feature: Message sending functionality
  User story :
  1. User should be able to send a message by filling in the mandatory fields.
  2. The message delivery should be to 'All employees' by default and should be changeable.
  3. User should be able to cancel sending messages at any time before sending.


  Background:
    Given user is on the login page
    When user enters the Marketing username
    And user enters the Marketing password
    And user clicks on the login button
    Then user lands on the main page

  Scenario:  User should be able to send a message by filling in the mandatory fields.
    And user click message header
    And user writes message to the message field
    Then user should send the message

  Scenario: The message delivery should be to 'All employees' by default and should be changeable.
    And user click message header
    And user verify To field , default to All employees
    Then user should change the To field from All employee to whatever wants

  Scenario: User should be able to cancel sending messages at any time before sending.
    And user click message header
    And user writes message to the message field
    And verify cancel button is clickable
    Then user should be click cancel button any time