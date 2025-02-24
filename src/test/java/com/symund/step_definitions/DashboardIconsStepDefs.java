package com.symund.step_definitions;

import com.symund.pages.DashboardIconsPage;
import com.symund.pages.FilesPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DashboardIconsStepDefs {

    DashboardIconsPage dashboardPage = new DashboardIconsPage();

    @Then("user should navigate to {string} btn")
    public void userShouldNavigateToBtn(String magnifyBtn) {
        dashboardPage.magnifyIcon.click();

    }


    @Given("user types file name inside any Module")
    public void userTypesFileNameInsideAnyModule() {
       dashboardPage.searchFile("RealAgile");

    }

    @When("user clicks on that file")
    public void userClicksOnThatFile() {
        dashboardPage.clickToResult("RealAgile");

    }

    @Then("verify that user can see detailed side page of file")
    public void verifyThatUserCanSeeDetailedSidePageOfFile() {
        dashboardPage.verifyDetailedSidePageOfFile();

    }


}
