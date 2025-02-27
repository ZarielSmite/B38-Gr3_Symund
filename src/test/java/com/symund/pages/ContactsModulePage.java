package com.symund.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ContactsModulePage extends BasePage {
    @FindBy(xpath = "//button[@id='new-contact-button']")
    public WebElement newContactBtn;

    @FindBy(xpath = "//input[@id='contact-org']")
    public WebElement companyIcon;

    @FindBy(xpath = "//input[@id='contact-title']")
    public WebElement titleIcon;

    @FindBy(xpath = "//div[@class='app-content-list-item-line-one']")
     public WebElement oldContact;


    @FindBy(xpath = "//span[@title='All contacts']")
    public WebElement allContactsBtn;

    @FindBy (xpath = "//div[@class='vue-recycle-scroller__item-wrapper']/div/div")
    public List<WebElement> allContacts;

    @FindBy(xpath = "(//div[@class='app-navigation-entry__counter'])[1]")
    public WebElement contactsNumber;



}
