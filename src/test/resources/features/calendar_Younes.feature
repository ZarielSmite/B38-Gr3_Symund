@B38G3-475_calendar
Feature: Calendar Module
  As a user, I should be able to see Daily-Weekly-Monthly calendar view

  Background: User logins and navigates to Files Page
    Given the user is on the login page
    And the user logged in with username as "Employee23" and password as "Employee123"
    And the user navigates to "Calendar" module

  @B38G3-475_calendar_AC01-TC01
  Scenario: User can display daily calendar view
    When User select the "Daily" view option
    Then User should see the "Day" calendar view

  @B38G3-475_calendar_AC02-TC01
  Scenario: User can display weekly calendar view
    When User select the "Weekly" view option
    Then User should see the "Week" calendar view

  @B38G3-475_calendar_AC03-TC01
  Scenario: User can display monthly calendar view
    When User select the "Monthly" view option
    Then User should see the "Month" calendar view

  @B38G3-475_calendar_AC04-TC01
  Scenario: User can create a new event and verify in monthly view
    When User create a new event with title "Meeting" on "03-03-2025"
    And User switch to the "Monthly" calendar view
    Then User should see the event "Meeting" on "03-03-2025"
