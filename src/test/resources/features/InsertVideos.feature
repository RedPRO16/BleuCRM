Feature: User should be able to insert YouTube and Vimeo videos. User should be able to cancel
  before sending the message

  Background: For the scenarios below, user should be login successfully.

    Given user is on the login page
    When user enters the HR username
    And user enters the HR password
    And user clicks on the login button
    And user clicks on the send messages button
    Then user lands on the main page

  Scenario: User should be able to insert YouTube and Vimeo videos.

    When user clicks on the insert video button
    And user enters YouTube "video link"
    And user verify that video could seen in the preview section
    And user clicks on the cancel button
    And user again clicks on the insert video button
    And user enters Vimeo "video link"
    And user verify that video could seen in the preview section two
    Then user cancels the video insert before sending the message