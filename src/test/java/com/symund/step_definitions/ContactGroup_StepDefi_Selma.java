package com.symund.step_definitions;

import com.symund.pages.ContactPage_Selma;
import com.symund.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import java.util.List;
import java.util.stream.Collectors;
import static org.junit.Assert.*;

public class ContactGroup_StepDefi_Selma {

    ContactPage_Selma contactPage = new ContactPage_Selma();


    @Given("The user clicks on the + New group button")
    public void theUserClicksOnTheNewGroupButton() {
        contactPage.newGroup.click();
    }


    @When("The user enters a group name {string}")
    public void theUserEntersAGroupName(String name) {
        contactPage.groupNameInput.sendKeys(name);
        contactPage.groupCreateEnter.click();
    }


    @And("The {string}  group should appear in the group list")
    public void theGroupShouldAppearInTheGroupList(String grp) {
        System.out.println("contactPage.groupInList.getText() = " + contactPage.groupInList.getText());
        Assert.assertTrue("Group '" + grp + "' is not visible!",
                          contactPage.groupInList.isDisplayed());
    }


    @Given("The user enters  multiple group names")
    public void theUserEntersMultipleGroupNames(List<String> groupNames) {
        for (String groupName : groupNames) {
            contactPage.newGroup.click();
            contactPage.groupNameInput.sendKeys(groupName);
            contactPage.groupCreateEnter.click();
            BrowserUtils.sleep(2);
        }
    }


    @And("The group names should appear in the group list")
    public void theGroupNamesShouldAppearInTheGroupList(List<String> expectedGroupNames) {
        List<WebElement> groupElements = contactPage.getGroupListElements();
        List<String> actualGroupNames = groupElements.stream()
                .map(WebElement::getText)
                .toList();
        System.out.println("actualGroupNames = " + actualGroupNames);
        Assert.assertTrue("Group names do not match!",
                          actualGroupNames.containsAll(expectedGroupNames));
    }


    @When("The user clicks on All Contacts")
    public void theUserClicksOnAllContacts() {
        contactPage.allContacts.click();
    }


    @And("The user clicks on + New contact")
    public void theUserClicksOnNewContact() {
        contactPage.newContact.click();
    }


    @Then("The user clicks on Groups")
    public void theUserClicksOnGroups() {
        contactPage.groupButton.click();
    }


    @When("The user clicks on Add new property")
    public void theUserClicksOnAddNewProperty() {
        contactPage.addProperty.click();
    }


    @And("The user selects Anniversary from the dropdown")
    public void theUserSelectsFromTheDropdown() {
        contactPage.anniversary.click();
    }


    @Then("The Anniversary field should be added to the contact details")
    public void theFieldShouldBeAddedToTheContactDetails() {
        Assert.assertTrue(contactPage.verifyAnniversary.isDisplayed());
    }


    @Then("The system should prevent duplicate property addition")
    public void theSystemShouldPreventDuplicatePropertyAddition() {
        Assert.assertTrue(contactPage.verifyAnniversary.isDisplayed());

    }


    @Then("all created group names below should be visible in the dropdown menu")
    public void allCreatedGroupNamesShouldBeVisibleInTheDropdownMenu(List<String> expectedGroups) {
        List<String> actualGroupNames = contactPage.getGroupElements(expectedGroups).stream()
                .map(WebElement::getText)
                .collect(Collectors.toList());

        for (String expected : expectedGroups) {
            assertTrue("Group name '" + expected + "' is not visible in the dropdown",
                       actualGroupNames.contains(expected));
        }
    }


    @Given("The user is on a contact's details page")
    public void theUserIsOnAContactSDetailsPage() {
        contactPage.newGroup.click();
        contactPage.groupNameInput.sendKeys("Friend");
        contactPage.groupCreateEnter.click();
        contactPage.newContact.click();
    }


    @Given("The user has already added the Anniversary property to a contact")
    public void theUserHasAlreadyAddedThePropertyToAContact() {
        contactPage.newGroup.click();
        contactPage.groupNameInput.sendKeys("Friend");
        contactPage.groupCreateEnter.click();
        contactPage.newContact.click();
        contactPage.addProperty.click();
        contactPage.anniversary.click();
    }


    @When("The user tries to add Anniversary again")
    public void theUserTriesToAddAnniversaryAgain() {
        contactPage.addProperty.click();
        Assert.assertTrue("Anniversary button should not be displayed again" ,
                          contactPage.secondAnniversary.isEmpty());
    }
}

