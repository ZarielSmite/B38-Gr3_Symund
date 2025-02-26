package com.symund.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactsModulePage extends BasePage {
    @FindBy(xpath = "//button[@id='new-contact-button']")
    public WebElement newContactBtn;

    @FindBy(xpath = "//input[@id='contact-org']")
    public WebElement companyIcon;

    @FindBy(xpath = "//input[@id='contact-title']")
    public WebElement titleIcon;

    @FindBy(xpath = "//div[@class='app-content-list-item-line-one']")
     public WebElement oldContact;



}
