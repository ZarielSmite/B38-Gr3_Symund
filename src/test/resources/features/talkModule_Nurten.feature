@B38G3-476_talkModule
Feature: Talk Module Functionality

  """ User story :
  As a user, I should be able to create a new conversation, add participant under the Talk module

  Acceptance Criteria:
    1. User can create a new conversation by adding any selected participant
    2. User can delete a conversation
  """

  Background: User logins and navigates to Talk Page
    Given the user is on the login page
    And the user logged in with username as "Employee63" and password as "Employee123"
    And the user navigates to "Talk" module

  @B38G3-476_talkModule_AC01-TC1
    Scenario: Verify user should create conversation by adding a participant
      When User clicks + icon
      Then User types new group conversation "Test1"
      And User clicks add participants button
      Then User chooses any of the contacts in the contacts list
      Then User click on create conversation button
      Then Verify user should see group conversation "Test1" is displayed

  @B38G3-476_talkModule_AC01-TC2
  Scenario: Verify user should not be able to create conversation without adding a participant
    When User clicks + icon
    Then User types new group conversation "Test2"
    And User clicks add participants button
    Then User clicks create conversation button without selecting a participant
    Then Verify user should not see group conversation "Test2" is displayed

  @B38G3-476_talkModule_AC02-TC1
    Scenario: Verify User can delete a conversation
      When User clicks + icon
      Then User types new group conversation "Test3"
      And User clicks add participants button
      Then User chooses any of the contacts in the contacts list
      Then User click on create conversation button
      Then Verify user should see group conversation "Test3" is displayed
      Then User clicks three dots
      Then User clicks delete conversation button
      Then User clicks yes button
      Then Verify user cannot see deleted conversation "Test3" anymore



