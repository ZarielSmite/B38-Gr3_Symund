package com.symund.step_definitions;

import com.symund.pages.CalendarPage;
import com.symund.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.*;


public class  CalendarStepDefs {

    CalendarPage calendarPage = new CalendarPage();

    //a method that will navigate to the calendar webpage
    @Given("the user navigates to {string} module")
    public void the_user_navigates_to_module(String moduleName) {
        calendarPage.navigateTo(moduleName);
    }

    //method that will check if we are on the required calendar view. if not, then it will select it
    @When("User select the {string} view option")
    public void user_select_the_view_option(String calendarView) {
        calendarPage.calendarViewMenu.click();
        if (!calendarPage.getCalendarView(calendarView).isSelected()) {
            calendarPage.getCalendarView(calendarView).click();
        }
    }

    //method that will verify if we are on the required calendar view based on the webpage URL
    @Then("User should see the {string} calendar view")
    public void userShouldSeeTheCalendarView(String calendarView) {
        BrowserUtils.verifyURLContains(calendarView);
    }

    //method to create an event using any title and date
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


    //method that will verify if the created event is displayed
    @Then("User should see the event Meeting on {string}")
    public void userShouldSeeTheEventOn(String meetingDate) {


    //if statement to make sure that the personal radio button is selected
        if (!calendarPage.getAttributeIdea.getAttribute("class").equals("app-navigation-entry__icon-bullet")) {
            calendarPage.personalRadioButton.click();
        }
    //loop to keep changing till we are on the monthly view we have our event on
        for (int i = 1; i < 12; i++) {
            if (calendarPage.datePickerButton.getText().equals(calendarPage.newFormatDate(meetingDate))) {
                break;
            }
            calendarPage.datePickerRightButton.click();
        }
    //verifying if the created event is visible to the user
        BrowserUtils.verifyElementDisplayed(calendarPage.theChosenEvent);


    }
}


