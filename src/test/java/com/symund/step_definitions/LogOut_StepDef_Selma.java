package com.symund.step_definitions;

import com.symund.pages.LogOutPage;
import com.symund.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogOut_StepDef_Selma {

    private static final Logger log = LoggerFactory.getLogger(LogOut_StepDef_Selma.class);
    LogOutPage logOutPage = new LogOutPage();


    @Given("The user clicks profile button")
    public void the_user_clicks_profile_button() {
        logOutPage.profileButton.click();
    }

    @When("The user selects logout button in dropdown menu")
    public void theUserSelectsLogoutButtonInDropdownMenu() {
        logOutPage.logOutButton.click();
    }

    @Then("Verify the user log out and end up in login page successfully")
    public void the_user_logs_out_and_ens_up_in_login_page_successfully() {
        String currentURL = Driver.getDriver().getCurrentUrl();
        System.out.println("currentURL = " + currentURL);
        Assert.assertTrue("Log out is not successful!!",currentURL.contains("login"));
    }


    @Then("The user clicks back button to go back to the dashboard")
    public void theUserClicksBackButtonToGoBackToTheDashboard() {
        Driver.getDriver().navigate().back();
    }

    @And("Verify the user still in the login page")
    public void verifyTheUserStillInTheLoginPage() {
        Assert.assertTrue("User did not log out!!",logOutPage.loginButton.isDisplayed());

    }
}
