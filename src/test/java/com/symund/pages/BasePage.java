package com.symund.pages;


import com.symund.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {


    public BasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath ="//div[@id='settings']/nav/ul/li[4]")
    public WebElement logOutLink;


    @FindBy(xpath = "//*[@id=\"appmenu\"]/li[1]/a")
    public WebElement dashBoardLink;

    @FindBy(xpath = "//*[@id=\"appmenu\"]/li[2]/a")
    public WebElement fileLink;

    @FindBy(xpath = "//*[@id=\"appmenu\"]/li[3]/a ")
    public WebElement photosLink;

    @FindBy(xpath = "//*[@id=\"appmenu\"]/li[4]/a")
    public WebElement activityLink;

    @FindBy(xpath = "//*[@id=\"appmenu\"]/li[5]/a")
    public WebElement talkLink;

    @FindBy(xpath = "//*[@id=\"appmenu\"]/li[6]/a")
    public WebElement mailLink;

    @FindBy(xpath = "//*[@id=\"appmenu\"]/li[7]/a")
    public WebElement contactsLink;

    @FindBy(xpath = "//*[@id=\"appmenu\"]/li[8]/a")
    public WebElement circlesLink;

    @FindBy(xpath = "//*[@id=\"appmenu\"]/li[9]/a")
    public WebElement calendarLink;

    @FindBy(xpath = "//*[@id=\"appmenu\"]/li[10]/a")
    public WebElement notesLink;

    @FindBy(xpath = "//*[@id=\"appmenu\"]/li[11]/a")
    public WebElement deckLink;

    @FindBy(xpath = "//*[@id=\"appmenu\"]/li[12]/a")
    public WebElement tasksLink;

}
