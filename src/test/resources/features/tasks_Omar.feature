@B38G3-484_tasks
Feature: Users should be able to login

  Background: User is already in the log in page
    Given the user is on the login page
    Given the user logged in with username as "Employee33" and password as "Employee123"
    Then the user should navigate to "{Tasks}" module

    #User Story :As a user, I should be able to create a new task list or a single task and add any task to completed and importants tasks list.
    # Acceptance Criteria :
    # User can create a new list of tasks
    # User can create a new task
    # User can add any task to the list of completed tasks by clicking on the checkbox near the task name
    # User can add any task to the list of important tasks by clicking on the star icon on the right side of task line
    # User can see the number of all uncompleted tasks next to the Current tab

  @B38G3-484_tasks_AC01-TC01

  Scenario: User can create a new list of tasks
    Then the user clicks to the Add List button and adds a list and names it

  @B38G3-484_tasks_AC01-TC02

  Scenario: User can create a new list of tasks with other colors
    Then the user clicks to the Add List button and adds a list and names it with a the color green
    Then the user clicks to the Add List button and adds a list and names it with a the color orange
    Then the user clicks to the Add List button and adds a list and names it with a the color purple
    Then the user clicks to the Add List button and adds a list and names it with a the color yellow
    Then the user clicks to the Add List button and adds a list and names it with a the color blue
    Then the user clicks to the Add List button and adds a list and names it with a the color gray
    Then the user clicks to the Add List button and adds a list and names it with a the color black
    Then the user clicks to the Add List button and adds a list and names it with a the color pink


  @B38G3-484_tasks_AC02-TC01

  Scenario: User can create a new task
    Then the user makes a new task

  @B38G3-484_tasks_AC03-TC01

  Scenario: User can add any task to the list of completed tasks
    And the user adds the task to the list of completed tasks by clicking the checkbox

  @B38G3-484_tasks_AC03-TC02
  Scenario: User can remove any task from the list of completed tasks
    And the user adds the task to the list of completed tasks by clicking the checkbox
    Then the user removes the task from the completed tasks by clicking the checkbox of a completed task


  @B38G3-484_tasks_AC04-TC01

  Scenario: User can add any task to the list of important tasks
    And the user adds the task to the list of important tasks by clicking the star icon

  @B38G3-484_tasks_AC04-TC02
  Scenario: User can remove any task from the list of important tasks
    And the user adds the task to the list of important tasks by clicking the star icon
    And the user removes the task from the list of important tasks by clicking the star icon


  @B38G3-484_tasks_AC05-TC01

  Scenario:User can see the number of all uncompleted tasks
    And the user can see the number of all uncompleted tasks next to the current tab

  @B38G3-484_tasks_AC05-TC02
  Scenario:User can see the number of all completed tasks
    And the user adds the task to the list of completed tasks by clicking the checkbox
    And the user can see the number of completed tasks in the completed tasks tab after completing atleast one task

