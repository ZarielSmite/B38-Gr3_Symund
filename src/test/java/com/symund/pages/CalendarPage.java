package com.symund.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CalendarPage extends BasePage {


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

    @FindBy(xpath = "//div[@style='background-color: rgb(121, 90, 171);']")
    public WebElement personalRadioButton;
}
