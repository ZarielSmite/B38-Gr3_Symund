package com.symund.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CalendarPage extends BasePage {

// custom method that will return a WebElement based on the given keyword
    public WebElement getCalendarView(String calendarView) {
        WebElement calendar = null;
        switch (calendarView) {
            case "Daily":
                calendar = calendarDailyView;
                break;
            case "Weekly":
                calendar = calendarWeeklyView;
                break;
            case "Monthly":
                calendar = calendarMonthlyView;
                break;
        }
        return calendar;
    }

    @FindBy(xpath = "(//div[@class='trigger']/button[@aria-label='Actions'])[1]")
    public WebElement calendarViewMenu;

    @FindBy(xpath = "//span[text()='Day']")
    public WebElement calendarDailyView;

    @FindBy(xpath = "//span[text()='Week']")
    public WebElement calendarWeeklyView;

    @FindBy(xpath = "//span[text()='Month']")
    public WebElement calendarMonthlyView;


    @FindBy(xpath = "(//div[@class='new-event-today-view-section']/button)[1]")
    public WebElement newEventButton;

    @FindBy(xpath = "//input[@placeholder='Event title']")
    public WebElement eventTitleInput;

    @FindBy(xpath = "(//div[@class='property-title-time-picker__time-pickers']//input[@name='date'])[1]")
    public WebElement fromDateInput;

    @FindBy(xpath = "(//input[@name='date'])[3]")
    public WebElement toDateInput;

    @FindBy(xpath = "(//div[@class='event-popover__buttons']//button)[2]")
    public WebElement newEventSaveButton;

    @FindBy(xpath = "//*[@id=\"app-navigation-vue\"]/ul/div/li/a/div/div/div")
    public WebElement personalRadioButton;


    @FindBy(xpath = "//*[@id=\"app-navigation-vue\"]/ul/div/li/a/div/div")
    public WebElement getAttributeIdea;

    @FindBy(xpath = "//button[@class='datepicker-button-section__datepicker-label button datepicker-label']")
    public WebElement datePickerButton;

    @FindBy(xpath = "//*[@id=\"app-navigation-vue\"]/header/div[1]/button[3]")
    public WebElement datePickerRightButton;

    @FindBy(xpath = "//div[@class='fc-event-main']//div[text()='Meeting']")
    public WebElement theChosenEvent;

// custom method that takes date in a numeric format and returns it in a alphanumeric format to match the Date Format on the monthly calendar webpage
    public String newFormatDate(String theDate) {
        String month = theDate.substring(theDate.indexOf("-") + 1, theDate.lastIndexOf("-"));
        String year = theDate.substring(theDate.lastIndexOf("-")+1);
        String theNewDate;
        switch (month) {
            case "01":
                theNewDate = "January " + year;
                break;
            case "02":
                theNewDate = "February " + year;
                break;
            case "03":
                theNewDate = "March " + year;
                break;
            case "04":
                theNewDate = "April " + year;
                break;
            case "05":
                theNewDate = "May " + year;
                break;
            case "06":
                theNewDate = "June " + year;
                break;
            case "07":
                theNewDate = "July " + year;
                break;
            case "08":
                theNewDate = "August " + year;
                break;
            case "09":
                theNewDate = "September " + year;
                break;
            case "10":
                theNewDate = "October " + year;
                break;
            case "11":
                theNewDate = "November " + year;
                break;
            case "12":
                theNewDate = "December " + year;
                break;
            default:
                theNewDate = "Invalid month";
        }


        return theNewDate;
    }


}
