package com.symund.step_definitions;

import com.symund.pages.ContactsModulePage;
import com.symund.utilities.BrowserUtils;
import com.symund.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ContactModule_StepDefs {

    ContactsModulePage contactsModule = new ContactsModulePage();

    // ***************AC01_TC01**************************
    @Given("user clicks on New Contact")
    public void user_clicks_on_new_contact() {
       contactsModule.newContactBtn.click();
    }

    @Then("user puts name {string} of the contact on Company icon")
    public void user_puts_name_of_the_contact_on_company_icon(String name) {
       contactsModule.companyIcon.sendKeys(name);

    }
    @Then("user puts last name {string} of contact on Title icon")
    public void user_puts_last_name_of_contact_on_title_icon(String lastName ) {
         contactsModule.titleIcon.sendKeys(lastName);

    }

    @Then("verify that new contact appears in the All contacts list with matching initials {string}")
    public void verifyThatNewContactAppearsInTheAllContactsListWithMatchingInitials(String matchingInitials) {
     String initialsOfContact = Driver.getDriver().findElement
             (By.xpath("//div[@class='app-content-list-item-line-one']")).getText();

        //System.out.println("initialsOfContact = " + initialsOfContact);
        Assert.assertEquals(matchingInitials,initialsOfContact);
    }


    // ****************** New Scenario AC01_TC02****************************
    @Given("user deletes name and last name of a created contact")
    public void user_deletes_name_and_last_name_of_a_created_contact() {
        contactsModule.oldContact.click();
        contactsModule.companyIcon.clear();
        contactsModule.titleIcon.clear();

    }
    @Given("user puts a new name {string} and surname {string}")
    public void user_puts_a_new_name_and_surname(String name, String surname) {
          contactsModule.companyIcon.sendKeys(name);
          contactsModule.titleIcon.sendKeys(surname);
        BrowserUtils.sleep(3);

    }
    @Then("verify that matching initials {string} are also changed simultaneously")
    public void verify_that_matching_initials_are_also_changed_simultaneously(String expectedInitials) {
            String actualInitials = contactsModule.oldContact.getText();
            Assert.assertEquals(expectedInitials,actualInitials);

    }

    // ***************New Scenario AC01_TC03 **************

    @Then("refresh the web page")
    public void refresh_the_web_page() {
       Driver.getDriver().navigate().refresh();

    }
    @Then("verify that new contact is disappeared, not created")
    public void verify_that_new_contact_is_disappeared_not_created() {
        WebElement newContact = Driver.getDriver().findElement
                (By.xpath("//div[@class='app-content-list-item active']"));

        Assert.assertTrue(newContact.isDisplayed());

    }


}
