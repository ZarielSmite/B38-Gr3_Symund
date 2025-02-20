package com.symund.step_definitions;

import com.github.javafaker.Faker;
import com.symund.pages.TasksPage;
import com.symund.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;

public class TasksStepDefs {

    TasksPage tasksPage = new TasksPage();
    Faker faker = new Faker();

    @Then("the user should navigate to {string} module")
    public void the_user_should_navigate_to_module(String moduleName) {
        tasksPage.navigateTo("Tasks");
    }

    @Then("the user clicks to the Add List button and adds a list and names it")
    public void the_user_clicks_to_the_add_list_button_and_adds_a_list_and_names_it() {
        tasksPage.addList.click();
        BrowserUtils.sleep(2);
        tasksPage.listName.sendKeys(faker.dragonBall().character() + Keys.ENTER);
    }

    @Then("the user makes a new task")
    public void the_user_makes_a_new_task() {
        BrowserUtils.sleep(2);
        tasksPage.taskName.sendKeys("Automated Task" + Keys.ENTER);
    }

    @Then("the user adds the task to the list of completed tasks by clicking the checkbox")
    public void the_user_adds_the_task_to_the_list_of_completed_tasks_by_clicking_the_checkbox() {
        tasksPage.completedCheckbox.click();
    }

    @Then("the user adds the task to the list of important tasks by clicking the star icon")
    public void the_user_adds_the_task_to_the_list_of_important_tasks_by_clicking_the_star_icon() {
        tasksPage.importantStar.click();
    }

    @Then("the user can see the number of all uncompleted tasks next to the current tab")
    public void the_user_can_see_the_number_of_all_uncompleted_tasks_next_to_the_current_tab() {
        String count = tasksPage.currentTasks.getText();
        System.out.println(count);
    }

}
