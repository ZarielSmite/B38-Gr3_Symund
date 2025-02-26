Feature: Contacts Module Functionality

  """
  User Story :As a user, I should be able to create a new contact and edit/delete any contact under Contacts module
    Acceptance Criteria:
   AC01 - User can create a new contact
   AC02 - User can see all the contacts as a list inside the middle column
   and total number of the contacts near the “All Contacts” tab
   AC03 - User can change the profile picture of any contact with
    a previously uploaded picture by using “Choose from files” option
   AC04 - User can delete any selected contact
"""

  Background: User logins and navigates to Files Page
    Given the user is on the login page
    And the user logged in with username as "Employee43" and password as "Employee123"
    And the user navigates to "Contacts" module

  @B38G3-473_contactModule_AC01_TC01
  Scenario: User can create a new contact
    Given user clicks on New Contact
    Then user puts name "Muzaffar" of the contact on Company icon
    Then user puts last name "Yuldoshev" of contact on Title icon
    Then  verify that new contact appears in the All contacts list with matching initials "Muzaffar"

  @B38G3-473_contactModule_AC01_TC02
  Scenario: verification of transformation of
  matching Initials when name and last name is changed after creation
    Given user deletes name and last name of a created contact
    And user puts a new name "Younes" and surname "Serroukh"
    Then verify that matching initials "Younes" are also changed simultaneously

  @B38G3-473_contactModule_AC01_TC03
   Scenario: user tries to create a new contact with an empty details and it should disappear after refresh
  (it shouldn't be created)
    Given user clicks on New Contact
    Then user puts name "       " of the contact on Company icon
    When user puts last name "     " of contact on Title icon
    Then refresh the web page
    Then verify that new contact is disappeared, not created





