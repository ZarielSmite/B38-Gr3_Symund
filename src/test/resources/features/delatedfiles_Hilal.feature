@B38G3-477_delatedfiles
Feature: Deleted Files Tab Functionality under Files Module
"""
  User Story :

  As a user, I should be able to see all deleted files and delete/restore them permanently under the Deleted Files tab.

  Acceptance Criteria:
 1- User can order the all deleted files by newest to oldest or vice versa

 2-User can delete any deleted file permanently by using the three dots icon in the file’s line

 3-User can restore any deleted file and see it again under the All Files tab

  """



  Background: User makes deleted files tab functionalization under file module
    Given the user is on the  Files page
    And the user logged in with username as "Employee123" and password as "Employee123"
    And the user navigates to "Files" module


  @B38G3-477_delatedfiles_AC01-TC01
  Scenario: User can order the all deleted files by newest to oldest or vice versa
    When user clicks on the ↑ sign to order the all deleted files by newest to oldest
    Then verify user should see delated files by newest to oldest

  @B38G3-477_delatedfiles_AC01-TC02
  Scenario: User can order the all deleted files by newest to oldest or vice versa
    When user clicks on the ↓  sign to order the all deleted files by newest to oldest
    Then verify user should see delated files by newest to oldest



  @B38G3-477_delatedfiles_AC02-TC01
  Scenario: User can delete any deleted file permanently by using the three dots icon in the file’s line
    When user clicks on the three dots icon
    Then user clicks on the "Delate Permanently" button
    Then verify that the delated file is delated permanently


  @B38G3-477_delatedfiles_AC03-TC01
  Scenario: User can restore any deleted file and see it again under the All Files tab
    When user clicks on the "Restore" button
    Then go to the All Files tab
    Then verify the restored file is under the All Files tab


