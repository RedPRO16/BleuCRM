@murat
Feature: Logout Functionality
  Acceptance Criteria:

  1- Verify the users can log out from the app after clicking the “Log Out” button.
  2 - The user can not go to the home page again by clicking the step back button after successfully logging out.
  3-  Users must be logged out if the user is away from the keyboard for 3 minutes (AFK-away from the keyboard)
  (if the user does not do any mouse or keyboard action for 3 minutes)

  Background:Verify users from HR can login
    Given user is on the login page
    When user enters the HR username
    And user enters the HR password
    And user clicks on the login button
    Then user lands on the main page

  Scenario:Verify the users can log out from the app after clicking the “Log Out” button.
    When User clicks on profile picture on top right
    Then User cliks on Log Out button

    Scenario:
    The user can not go to the home page again by clicking the step back button after successfully logging out.
      When User clicks on profile picture on top right
      And  User cliks on Log Out button
      And  User clicks back button
      Then User still in Log in page

      Scenario:
      Users must be logged out if the user is away from the keyboard for 3 minutes (AFK-away from the keyboard)
      (if the user does not do any mouse or keyboard action for 3 minutes)
        When User is away from the keyboard and mouse for three minutes
        When  User represh the page
        Then User still in Log in page


