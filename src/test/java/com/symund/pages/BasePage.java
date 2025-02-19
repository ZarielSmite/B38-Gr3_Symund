package com.symund.pages;


import com.symund.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {


    public BasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    /**
     * navigates to the given module page on the app
     * @param moduleName String
     */
    public void navigateTo(String moduleName){
        moduleName = moduleName.substring(0,1).toUpperCase() + moduleName.substring(1).toLowerCase();
        String locator = "//ul[@id='appmenu']//a[@aria-label='"+moduleName+"']";
        WebElement element = Driver.getDriver().findElement(By.xpath(locator));
        element.click();
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
