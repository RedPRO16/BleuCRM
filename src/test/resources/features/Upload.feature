Feature:As a user, I should be able to upload files and pictures as messages
  Background:Verify users from HR can login
Given user is on the login page
When user enters the HR username
And user enters the HR password
And user clicks on the login button
Then user lands on the main page
@LUE-1475
  Scenario: User should be able to upload multiple files at the same time

    And user should click message button
    And user should click upload files button
    And user should choose files for uploading and attach the files to the message
    Then user should see uploaded files under the message
  @LUE-1476
  Scenario: User should be able to upload files in different format

    And user should click message button
    And user should click upload files button
    And user should choose different types files for uploading and attach the files to the message
    Then user clicks the send button
  @LUE-1477
  Scenario: User should be able to upload pictures

    And user should click message button
    And user should click upload files button
    And user should upload picture
    Then user should see uploaded pictures under the message