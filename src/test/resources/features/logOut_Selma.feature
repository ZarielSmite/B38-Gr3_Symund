Feature: Log out functionality

  """
  User Story :As a user, I should be able to log out.
  Acceptance Criteria
  1-User can log out and ends up in login page
  2-User can not go to home page again by clicking step back button after successfully logged out.

"""

  Background: User logins and navigates to Files Page
    Given the user is on the login page
    And the user logged in with username as "Employee73" and password as "Employee123"

  @B38G3-485_logOut_AC01_TC01
  Scenario: User can log out and ends up in login page
    Given The user clicks profile button
    When The user selects logout button in dropdown menu
    Then Verify the user log out and end up in login page successfully

  @B38G3-485_logOut_AC02_TC01
  Scenario: User can not go to home page again by clicking step back button after successfully logged out.
    Given The user clicks profile button
    When The user selects logout button in dropdown menu
    Then The user clicks back button to go back to the dashboard
    And Verify the user still in the login page
