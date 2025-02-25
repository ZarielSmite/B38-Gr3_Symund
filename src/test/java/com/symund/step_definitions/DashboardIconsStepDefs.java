package com.symund.step_definitions;

import com.symund.pages.DashboardIconsPage;
import com.symund.pages.FilesPage;
import com.symund.utilities.BrowserUtils;
import com.symund.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static com.symund.utilities.Driver.getDriver;

public class DashboardIconsStepDefs {

    DashboardIconsPage dashboardPage = new DashboardIconsPage();

    @Then("user should navigate to {string} btn")
    public void userShouldNavigateToBtn(String magnifyBtn) {
        dashboardPage.magnifyIcon.click();

    }


    @Given("user types file name inside any Module")
    public void userTypesFileNameInsideAnyModule() {
       dashboardPage.searchFile("Talk");

    }

    @When("user clicks on that file")
    public void userClicksOnThatFile() {
        dashboardPage.clickToResult("Talk");


    }

    @Then("verify that user can see detailed side page of file")
    public void verifyThatUserCanSeeDetailedSidePageOfFile() {
        BrowserUtils.sleep(4);
        dashboardPage.verifyDetailedSidePageOfFile("Talk");
    }


    // ********************************New Scenari *************************************


    @When("user presses App icon btn")
    public void user_presses_app_icon_btn() {
        BrowserUtils.sleep(5);
       dashboardPage.logoIcon.click();

    }
    @Then("verify that User can navigate to the Dashboard page")
    public void verify_that_user_can_navigate_to_the_dashboard_page() {
      BrowserUtils.sleep(2);

      BrowserUtils.verifyTitle("Dashboard - Symund - QA");

    }



}
