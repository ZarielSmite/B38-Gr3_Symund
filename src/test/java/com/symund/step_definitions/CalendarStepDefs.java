package com.symund.step_definitions;

import com.symund.pages.CalendarPage;
import com.symund.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.*;


public class CalendarStepDefs {

    CalendarPage calendarPage = new CalendarPage();

    @Given("the user navigates to {string} module")
    public void the_user_navigates_to_module(String moduleName) {
        calendarPage.navigateTo(moduleName);
    }

    @When("User select the {string} view option")
    public void user_select_the_view_option(String calendarView) {
        calendarPage.calendarViewMenu.click();
        if (!calendarPage.getCalendarView(calendarView).isSelected()) {
            calendarPage.getCalendarView(calendarView).click();
        }
    }

    @Then("User should see the {string} calendar view")
    public void userShouldSeeTheCalendarView(String calendarView) {
        BrowserUtils.verifyURLContains(calendarView);
    }


    @When("User create a new event with title {string} on {string}")
    public void user_create_a_new_event_with_title_on(String meeting, String meetingDate) {
        calendarPage.newEventButton.click();
        calendarPage.eventTitleInput.sendKeys(meeting + Keys.TAB);

        calendarPage.fromDateInput.clear();
        calendarPage.fromDateInput.sendKeys(meetingDate + Keys.TAB);


        calendarPage.toDateInput.clear();
        calendarPage.toDateInput.sendKeys(meetingDate);
        calendarPage.newEventSaveButton.click();


    }

    @When("User switch to the {string} calendar view")
    public void user_switch_to_the_calendar_view(String calendarView) {
        calendarPage.calendarViewMenu.click();
        if (!calendarPage.getCalendarView(calendarView).isSelected()) {
            calendarPage.getCalendarView(calendarView).click();
        }
    }

//NOT HAPPY WITH ALL MY CODE BELOW

    @Then("User should see the event {string} on {string}")
    public void userShouldSeeTheEventOn(String meeting, String meetingDate) {

        if (!calendarPage.getAttributeIdea.getAttribute("class").equals("app-navigation-entry__icon-bullet")) {
            calendarPage.personalRadioButton.click();
        }

        for (int i = 1; i < 12; i++) {
            if (calendarPage.datePickerButton.getText().equals(calendarPage.newFormatDate(meetingDate))) {
                break;
            }
            calendarPage.datePickerRightButton.click();
        }

        BrowserUtils.verifyElementDisplayed(calendarPage.theChosenEvent);


    }
}


