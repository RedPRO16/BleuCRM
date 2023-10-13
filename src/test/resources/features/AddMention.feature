Feature: As a user, I should be able to add link, insert video, mention,  quote, add tag in message.
  User Story:
  1. User should be able to add mentions
  2. User should be able to attach a link to the specified text.
  3. User should be able to insert YouTube and Vimeo videos.
  4. User should be able to cancel links and videos before sending the message
  5. User should be able to add quotes.
  6. User should be able to add tags to messages and also remove tags before sending the message

  Background: For the scenarios below, user should be login successfully.
    Given user is on the login page
    When user enters the HR username
    And user enters the HR password
    And user clicks on the login button
    And user clicks on the send messages button
    Then user lands on the main page

@LUE-1523
  Scenario: User should be able to add mentions
    When user clicks on the Add Mention button
    And user clicks on the Employees and Department Button
    And user clicks on the hr2@cybertekschool.com
    And user clicks on the Add More button
    And user clicks on the Employees and Department Button
    And user clicks on the helpdesk22@cybertekschool.com
    Then verify the added contacts are displayed on the To box





