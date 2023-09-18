Feature: Login Functionality

  User Story:
  As a user, I should be able to create a poll by clicking on Poll tab under Active Stream.

  1. User should be able to add users by selecting multiple contacts from Employees and Department's contact lists.
  2. User should be able to add questions and multiple answers.
  3. User should be able to delete questions and multiple answers.
  4. User should be able to provide multiple choice to attendees by selecting the Allow multiple choice checkbox.
  5. User should be able to create a poll with mandatory fields.

  Background: For the scenarios below, user can create a poll via Poll tab on active stream page.
    Given user is on the login page

    When user enters the Marketing username
    And user enters the Marketing password
    And user clicks on the login button
    Then user lands on the main page

  Scenario: User should be able to add users by selecting multiple contacts from Employees and Department's contact lists.
    When user click POLL tab under active stream page
#    And user type a poll title
    And user click Add more btn on To field
    Then user by selecting multiple contacts from Employees and Department's contact lists.

  Scenario: User should be able to add questions and multiple answers.
    When user click on question field and type question.
    And user click on answer fields and type multiple answers
    And user click on add question to make multiple questions poll.
    Then click the SEND btn

  Scenario: User should be able to delete  multiple answers.
    When user click on more button
    And user hover over mouse on edit option
    Then user hover over answer box to delete by clicking on X and then confirm with OK on pop-up screen.

  Scenario: User should be able to delete questions.
    When user click on more button
    And user hover over mouse on delete option
    Then user confirm on pop screen by clicking on OK

  Scenario: User should be able to provide multiple choice to attendees by selecting the Allow multiple choice checkbox.
    When user click on more button
    And user hover over mouse on edit option
    Then user can click Allow multiple choice checkbox and confirm with send button

  Scenario: User should be able to create a poll with mandatory fields.
    When user must be filled up Mandatory fields; Message title, recipient,  a question,  two answers
    Then user click send button



