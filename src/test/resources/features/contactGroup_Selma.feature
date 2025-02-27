@B38G3-478_contactGroup
Feature: Contact Group Management in Contacts Module
"""
User Story :
        As a user, I should be able to create a new group and under Contacts module
Acceptance Criteria:
 1- User can create a new group under Contacts Module
 2- User can see all the available groups name through the group’s dropdown menu existing in the contact’s own info menu
 3- User can add a new property as “Anniversary” to the contact’s info page from the “Add new property” dropdown menu.
"""

  Background: User logins and navigates to Files Page
    Given the user is on the login page
    And the user logged in with username as "Employee73" and password as "Employee123"
    And the user navigates to "Contacts" module


  @B38G3-478_contactGroup_AC01_TC01
  Scenario: User creates a new contact group
    Given The user clicks on the + New group button
   When The user enters a group name "Family"
   And The "Family"  group should appear in the group list


  @B38G3-478_contactGroup_AC01_TC02
  Scenario: User creates multiple contact group
    Given The user enters  multiple group names
      | Family     |
      | Friends    |
      | Work       |
      | Gym        |
    And  The group names should appear in the group list
      | Family     |
      | Friends    |
      | Work       |
      | Gym        |


  @B38G3-478_contactGroup_AC02_TC01
  Scenario: User sees all available groups in the dropdown menu
    Given The user enters  multiple group names
      | Family     |
      | Friends    |
      | Work       |
      | Gym        |
    When The user clicks on All Contacts
    And The user clicks on + New contact
    Then The user clicks on Groups
    Then all created group names below should be visible in the dropdown menu
     | Family     |
     | Friends    |
     | Work       |
     | Gym        |


  @B38G3-478_contactGroup_AC03_TC01
  Scenario: User adds "Anniversary" as a new property
    Given The user is on a contact's details page
    When The user clicks on Add new property
    And The user selects Anniversary from the dropdown
    Then The Anniversary field should be added to the contact details


  @B38G3-478_contactGroup_AC03_TC02
  Scenario: User tries to add "Anniversary" property multiple times
    Given The user has already added the Anniversary property to a contact
    When The user tries to add Anniversary again
    Then The system should prevent duplicate property addition









