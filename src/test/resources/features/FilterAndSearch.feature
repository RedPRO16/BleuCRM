
Feature: Filter and search functionality
  As a user, I should be able to use "Filter and search" functionality on Active Stream.


  Background: Verify user type 'Human Resource' can login
    Given user is on the login page
    When user enters username "hr2@cybertekschool.com"
    And user enters password "UserUser"
    Then clicks to the Log In button
    And user lands on the home page.


  @LUE-1430
  Scenario:Verify default filters are able to see
    When user clicks on the Filter and search bar
    Then user should be able to see default filters as my activity, work, favorite, announcements and workflows

  @LUE-1430
  Scenario: Verify that user should be able to add and remove fields
    When user clicks to the Filter and search bar
    And user sees add field button and click it
    And some fields are opened like Date,Type,Author etc.
    And user sees all choosen fields' input boxes is displayed on the screen
    Then user unchecks all field checkboxes and user sees all input boxes disappeared

  @LUE-1430
  Scenario: Verify that user should be able to search by specifying the date.
    When user clicks to the date box
    And user sees date box
    And user chooses a Specific Date
    Then user clicks the search button and user can search with specific date successfully

  @LUE-1430
  Scenario: Verify that user should be able to search by selecting single type.
    When user is on the Filter and search bar
    And user clicks to the Type box
    And user chooses only one type
    Then user click the search button and user can search single type successfully


  @LUE-1430
  Scenario: Verify that user should be able to search by selecting multiple types.
    When user is on the Filter and search
    And user clicks Restore default fields button
    And user clicks to the Type box
    And user chooses multiple types
    Then user clicks search button and user can search multiple types successfully

  @LUE-1430
  Scenario: Verify that user should be able to save the filter.
    When user clicks to the save filter button
    And user gives name of the filter as "MY FILTER"
    And user clicks to the Save button
    Then user should see the "MY FILTER" as filter name under the filters menu

  @LUE-1430
  Scenario: Verify that user should be able to restore the default field.
    When user is on the Filter and search bar
    And user chooses some filters on the filter and search bar
    And user clicks Restore default fields button
    Then user can restore the default field successfully

  @LUE-1430
  Scenario: Verify that user should be able to reset filters to default.
    When user clicks to the add field button
    And user clicks to the Favorites, Tag and Extranet field checkboxes
    And user clicks to the Reset Button
    Then user should see Date, Type, Author and To fields checked and Favorites, Tag, Extranet fields unchecked as default




