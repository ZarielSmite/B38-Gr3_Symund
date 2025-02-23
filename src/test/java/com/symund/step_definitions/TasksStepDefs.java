package com.symund.step_definitions;

import com.github.javafaker.Faker;
import com.symund.pages.TasksPage;
import com.symund.utilities.BrowserUtils;
import com.symund.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

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
        tasksPage.listName.sendKeys(faker.elderScrolls().firstName() + Keys.ENTER);
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
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(tasksPage.currentTasks));
        String unCompletedTasksCount = tasksPage.currentTasks.getText();
        System.out.println("unCompletedTasksCount = " + unCompletedTasksCount);

    }


    @Then("the user clicks to the Add List button and adds a list and names it with a the color green")
    public void theUserClicksToTheAddListButtonAndAddsAListAndNamesItWithATheColorGreen() {
        tasksPage.addList.click();
        BrowserUtils.sleep(2);
        tasksPage.listColorGreen.click();
        BrowserUtils.sleep(1);
        tasksPage.listName.sendKeys(faker.elderScrolls().firstName() + Keys.ENTER);

    }

    @Then("the user clicks to the Add List button and adds a list and names it with a the color orange")
    public void theUserClicksToTheAddListButtonAndAddsAListAndNamesItWithATheColorOrange() {
        tasksPage.addList.click();
        BrowserUtils.sleep(2);
        tasksPage.listColorOrange.click();
        BrowserUtils.sleep(1);
        tasksPage.listName.sendKeys(faker.elderScrolls().firstName() + Keys.ENTER);

    }

    @Then("the user clicks to the Add List button and adds a list and names it with a the color purple")
    public void theUserClicksToTheAddListButtonAndAddsAListAndNamesItWithATheColorPurple() {
        tasksPage.addList.click();
        BrowserUtils.sleep(2);
        tasksPage.listColorPurple.click();
        BrowserUtils.sleep(1);
        tasksPage.listName.sendKeys(faker.elderScrolls().firstName() + Keys.ENTER);

    }

    @Then("the user clicks to the Add List button and adds a list and names it with a the color yellow")
    public void theUserClicksToTheAddListButtonAndAddsAListAndNamesItWithATheColorYellow() {
        tasksPage.addList.click();
        BrowserUtils.sleep(2);
        tasksPage.listColorYellow.click();
        BrowserUtils.sleep(1);
        tasksPage.listName.sendKeys(faker.elderScrolls().firstName() + Keys.ENTER);

    }

    @Then("the user clicks to the Add List button and adds a list and names it with a the color blue")
    public void theUserClicksToTheAddListButtonAndAddsAListAndNamesItWithATheColorBlue() {
        tasksPage.addList.click();
        BrowserUtils.sleep(2);
        tasksPage.listColorBlue.click();
        BrowserUtils.sleep(1);
        tasksPage.listName.sendKeys(faker.elderScrolls().firstName() + Keys.ENTER);

    }

    @Then("the user clicks to the Add List button and adds a list and names it with a the color gray")
    public void theUserClicksToTheAddListButtonAndAddsAListAndNamesItWithATheColorGray() {
        tasksPage.addList.click();
        BrowserUtils.sleep(2);
        tasksPage.listColorGray.click();
        BrowserUtils.sleep(1);
        tasksPage.listName.sendKeys(faker.elderScrolls().firstName() + Keys.ENTER);

    }

    @Then("the user clicks to the Add List button and adds a list and names it with a the color black")
    public void theUserClicksToTheAddListButtonAndAddsAListAndNamesItWithATheColorBlack() {
        tasksPage.addList.click();
        BrowserUtils.sleep(2);
        tasksPage.listColorBlack.click();
        BrowserUtils.sleep(1);
        tasksPage.listName.sendKeys(faker.elderScrolls().firstName() + Keys.ENTER);

    }

    @Then("the user clicks to the Add List button and adds a list and names it with a the color pink")
    public void theUserClicksToTheAddListButtonAndAddsAListAndNamesItWithATheColorPink() {
        tasksPage.addList.click();
        BrowserUtils.sleep(2);
        tasksPage.listColorPink.click();
        BrowserUtils.sleep(1);
        tasksPage.listName.sendKeys(faker.elderScrolls().firstName() + Keys.ENTER);

    }

    @Then("the user removes the task from the completed tasks by clicking the checkbox of a completed task")
    public void theUserRemovesTheTaskFromTheCompletedTasksByClickingTheCheckboxOfACompletedTask() {
        tasksPage.unCompletedCheckbox.click();
    }

    @And("the user removes the task from the list of important tasks by clicking the star icon")
    public void theUserRemovesTheTaskFromTheListOfImportantTasksByClickingTheStarIcon() {
        tasksPage.importantStar.click();
    }


    @And("the user can see the number of completed tasks in the completed tasks tab after completing atleast one task")
    public void theUserCanSeeTheNumberOfCompletedTasksInTheCompletedTasksTabAfterCompletingAtleastOneTask() {
        tasksPage.listAllCompletedTasksButton.click();
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(tasksPage.completedTabCount));
        String completedTasksCount = tasksPage.completedTabCount.getText();
        System.out.println("completedTasksCount = " + completedTasksCount);

    }

    @Then("the user can see the number of tasks in the important tab")
    public void theUserCanSeeTheNumberOfTasksInTheImportantTab() {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(tasksPage.importantCount));
        String importantCount = tasksPage.importantCount.getText();
        System.out.println("importantCount = " + importantCount);

    }
}
