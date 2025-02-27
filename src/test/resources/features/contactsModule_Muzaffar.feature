
@B38G3-473_contactModule
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


    #AC02 - User can see all the contacts as a list inside the middle column
    #   and total number of the contacts near the “All Contacts” tab
    @B38G3-473_contactModule_AC02_TC01
    Scenario: verification of contact's list and numbers
      Given user clicks to All contacts to see contacts list
          |Ada|
          |John|
          |Mike|
          |Muzaffar|

      Then verify that total number of contacts are correct as it is  shown







