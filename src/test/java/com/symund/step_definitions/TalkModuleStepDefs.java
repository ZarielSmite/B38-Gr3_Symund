package com.symund.step_definitions;

import com.symund.pages.TalkPage;
import com.symund.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class TalkModuleStepDefs {

    TalkPage talkPage = new TalkPage();

    @When("User clicks + icon")
    public void user_clicks_icon() {
        BrowserUtils.waitFor(4);
        talkPage.plusIcon.click();
    }
    @Then("User types new group conversation {string}")
    public void userTypesNewGroupConversation(String conversationName) {
        BrowserUtils.waitFor(2);
        talkPage.inputConversationName.sendKeys(conversationName);

    }
    
    @Then("User clicks add participants button")
    public void user_clicks_add_participants_button() {
        BrowserUtils.waitFor(2);
        talkPage.addParticipantButton.click();
    }

    @Then("User chooses any of the contacts in the contacts list")
    public void user_chooses_any_of_the_contacts_in_the_contacts_list() {
        BrowserUtils.waitFor(2);
       // List<WebElement> nameList = talkPage.participantList;

//        if (nameList.isEmpty()) {
//            System.out.println("No participants found!");
//        } else {
        System.out.println( talkPage.getParticipantNames());
//        }
    }

    @Then("User click on create conversation button")
    public void user_click_on_create_conversation_button() {
        talkPage.createConversationButton.click();
        BrowserUtils.waitFor(2);
    }

    @Then("Verify user should see group conversation {string} is displayed")
    public void verify_user_should_see_group_conversation_is_displayed(String expectedName) {

        String createdConversationName = talkPage.createdConversation.getText();
        System.out.println(createdConversationName);
        System.out.println(expectedName);

        Assert.assertEquals(createdConversationName, expectedName);
    }

    @Then("Verify user should not see group conversation {string} is displayed")
    public void verifyUserShouldNotSeeGroupConversationIsDisplayed(String expectedName) {
        String createdConversationName = talkPage.createdConversation.getText();
        System.out.println(createdConversationName);
        System.out.println(expectedName);

        Assert.assertNotEquals(createdConversationName, expectedName);
    }

       @Then("User clicks three dots")
    public void user_clicks_threeDots() {
        BrowserUtils.waitFor(2);
        talkPage.threeDotMenu.click();

    }

    @Then("User clicks delete conversation button")
    public void user_clicks_delete_conversation() {
        BrowserUtils.waitFor(3);
        talkPage.scrollToDeleteConversationAndClick();
        BrowserUtils.waitFor(3);
    }

    @Then("User clicks yes button")
    public void user_clicks_yes_button() {
        BrowserUtils.waitFor(5);
        talkPage.deleteAcceptanceButton.click();
    }

    @Then("User clicks create conversation button without selecting a participant")
    public void userClickCreateConversationButtonWithoutSelectingAParticipant() {
        BrowserUtils.waitFor(2);
        talkPage.createConversationButton.click();
    }


    @Then("Verify user cannot see deleted conversation {string} anymore")
    public void verifyUserCannotSeeDeletedConversationAnymore(String expectedName) {
        BrowserUtils.waitFor(5);
        String createdConversationName = talkPage.createdConversation.getText();
        System.out.println(createdConversationName);
        System.out.println(expectedName);

        Assert.assertNotEquals(createdConversationName, expectedName);
    }


}
