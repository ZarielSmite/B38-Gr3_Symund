package com.symund.step_definitions;

import com.symund.pages.BasePage;
import com.symund.pages.LoginPage;
import com.symund.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogOut_StepDef_Selma {

    private static final Logger log = LoggerFactory.getLogger(LogOut_StepDef_Selma.class);

    LoginPage loginPage = new LoginPage();
    BasePage basePage = new BasePage() {
        @Override
        public void setLogOut() {
            super.setLogOut();
        }
    };

    @Given("The user clicks profile button and select logout button")
    public void the_user_clicks_profile_button() {basePage.setLogOut();
    }

    @When("Verify the user log out and end up in login page successfully")
    public void the_user_logs_out_and_ens_up_in_login_page_successfully() {
        String currentURL = Driver.getDriver().getCurrentUrl();
        System.out.println("currentURL = " + currentURL);
        Assert.assertTrue("Log out is not successful!!",currentURL.contains("login"));
    }

    @When("The user clicks back button to go back to the dashboard")
    public void theUserClicksBackButtonToGoBackToTheDashboard() {
        Driver.getDriver().navigate().back();
    }

    @Then("Verify the user still in the login page")
    public void verifyTheUserStillInTheLoginPage() {
        Assert.assertTrue("User did not log out!!",loginPage.submit.isDisplayed());

    }
}
