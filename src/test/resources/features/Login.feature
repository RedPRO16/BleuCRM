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
@LUE-1444
  Scenario: Verify users from HR can login
    When user enters the HR username
    And user enters the HR password
    And user clicks on the login button
    Then user lands on the main page
  @LUE-1445
  Scenario: Verify users from Marketing can login
    When user enters the Marketing username
    And user enters the Marketing password
    And user clicks on the login button
    Then user lands on the main page
  @LUE-1446
  Scenario: Verify users from Helpdesk can login
    When user enters the Helpdesk username
    And user enters the Helpdesk password
    And user clicks on the login button
    Then user lands on the main page
  @LUE-1447
  Scenario: Verify "incorrect username or password" is displayed for invalid credentials
    When user enters the invalid username
    And user enters the valid password
    And user clicks on the login button
    Then user can see incorrect username or password text
  @LUE-1447
  Scenario: Verify "incorrect username or password" is displayed for invalid credentials
    When user enters the valid username
    And user enters the invalid password
    And user clicks on the login button
    Then user can see incorrect username or password text
  @LUE-1448
  Scenario: Verify "Please fill out this field" is displayed if the password or username is empty
    When user enters the Marketing username
    And user do not enter the password
    And user clicks on the login button
    Then user can see Please fill out this field message
  @LUE-1449
  Scenario: Verify "Forgot Password" link exists and is clickable on the login page
    When user checks Forgot password link is visible
    Then user clicks on the link and verifies the link is clickable
  @LUE-1450
  Scenario: Verify "Remember Me" button exists and is clickable on the login page
    When user checks Remember Me button is visible
    Then user clicks on the link and verifies the button is clickable
  @LUE-1451
  Scenario: Verify password is in bullet signs by default
    When user enters the Helpdesk password
    Then user can see the password is in bullet sign

