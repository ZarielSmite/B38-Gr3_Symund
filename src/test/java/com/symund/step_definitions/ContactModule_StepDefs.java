package com.symund.step_definitions;

import com.symund.pages.ContactsModulePage;
import com.symund.utilities.BrowserUtils;
import com.symund.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.sl.In;
import org.apache.velocity.runtime.directive.Parse;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

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
     BrowserUtils.sleep(3);

      String initialsOfContact = Driver.getDriver().findElement
             (By.xpath("//div[@class='app-content-list-item-line-one']")).getText();

        //System.out.println("initialsOfContact = " + initialsOfContact);
        Assert.assertEquals(matchingInitials,initialsOfContact);
    }


     //****************     //****************  New Scenario AC02_TC01    //****************     //****************

    @Given("user clicks to All contacts to see contacts list")
    public void user_clicks_to_all_contacts_to_see_contacts_list(List<String> expectedNames) {


        List<String> actualContactNames = contactsModule.allContacts.stream()
                .map(WebElement::getText)
                .toList();
        System.out.println("contactNames = " + actualContactNames);

        Assert.assertEquals(expectedNames,actualContactNames);

    }

    @Then("verify that total number of contacts are correct as it is  shown")
    public void verifyThatTotalNumberOfContactsAreCorrectAsItIsShown() {
        int expectedNumber  = contactsModule.allContacts.size();

        String text = contactsModule.contactsNumber.getText();
        int actualNumber = Integer.parseInt(text);

        Assert.assertEquals(expectedNumber,actualNumber);

    }
}
