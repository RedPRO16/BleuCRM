@omer
Feature:As a user, I should be able to assign tasks under the Quick Navigate Menu.

  Background:
    Given user is on the login page
    When user enters the HR username
    And user enters the HR password
    And user clicks on the login button
    Then user lands on the main page

  @LUE-1479
  Scenario:HR User should be able to create High priority tasks with the mandatory fields.
    When user click on TASK
    And user click on HighPriority
    Then Verify High Priority tik is visible

    And user enters task name
    Then Verify task name is displayed

    And user enters the checklist items
    Then Verify checklist items are displayed

    And user click on Add more button
    And user click on Employees and departments Button
    And user selects three person
    Then Verify three person are displayed

    And user selects Deadline
    Then Verify Deadline is displayed

    And user click on SEND button
    Then Verify task has been created



 #Scenario: 2. HR User should be able to assign a task to more than one user (Test with adding 3 users max.)

 #Scenario: 3. Checklist should be able to be added while creating a task.

 #Scenario: 4. Deadline should be able to be added while creating a task.


