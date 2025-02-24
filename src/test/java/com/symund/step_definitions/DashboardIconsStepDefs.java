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


}
