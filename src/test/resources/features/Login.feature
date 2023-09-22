Feature: Login Functionality
  User Story:
  1-Users should be able to log in with valid credentials and should land on the home page after successful login.
  (We have 3 types of users such as HR user, Marketing user, and Helpdesk user).

  2-"Incorrect username or password." should be displayed for invalid (valid username-invalid password and invalid username-valid password) credentials

  3- "Please fill out this field" message should be displayed if the password or username is empty

  4- ‘Forgot Password’ link exists and is clickable on the login page

  5-User can see "Remember Me" link exists and is clickable on the login page

  6-User should see the password in bullet signs by default

  Background: For the scenarios below, user is expected to be on the login page
    Given user is on the login page

  Scenario: Verify users from HR can login
    When user enters the HR username
    And user enters the HR password
    And user clicks on the login button
    Then user lands on the main page

