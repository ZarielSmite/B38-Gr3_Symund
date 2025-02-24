@B38G3-479_dashboardIcons
  Feature: Search Functionalities, Dashboard Icons
        Agile Story: Search functionalities and using dashboard icons

    """
    User Story :As a user, I should be able to
    search file or contact from the Dashboard
    Acceptance Criteria:
    User can search file typing its name through
      the magnifying glass icon inside any Module and
       see the details side page of the file when clicked
       on it.
    User can navigate to the Dashboard page
        whenever clicking the App icon at the top left
        corner on the page.
    """

    Background: User logins
      Given the user is on the login page
      And the user logged in with username as "Employee93" and password as "Employee123"
      And the user navigates to "Files" module
      Then user should navigate to "Magnify Btn" btn


    @B38G3-479_SearchFunctionality_AC01-TC01
    Scenario: verifying search functionality
      Given user types file name inside any Module
      When user clicks on that file
      Then verify that user can see detailed side page of file
