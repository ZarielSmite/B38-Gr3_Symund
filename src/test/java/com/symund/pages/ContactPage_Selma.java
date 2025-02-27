package com.symund.pages;

import com.symund.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.List;

public class ContactPage_Selma extends BasePage {

    @FindBy(xpath = "//span[@title='+ New group']")
    public WebElement newGroup;


    @FindBy(xpath = "//input[@class='action-input__input focusable']")
    public WebElement groupNameInput;


    @FindBy(xpath = "//label[@class='action-input__label']")
    public WebElement groupCreateEnter;


    @FindBy(xpath = "//span[@title='Family']")
    public WebElement groupInList;


    @FindBy(xpath = "//span[@title='All contacts']")
    public WebElement allContacts;


    @FindBy(xpath = "//button[@id='new-contact-button']")
    public WebElement newContact;


    @FindBy(xpath = "//input[@placeholder='Add contact in group']")
    public WebElement groupButton;


    @FindBy(xpath = "//input[@placeholder='Choose property type']")
    public  WebElement addProperty;


    @FindBy (xpath = "//div[@title='Anniversary']")
    public  WebElement anniversary;


    @FindBy(xpath = "//div[@title='Anniversary']")
    public List<WebElement> secondAnniversary;


    @FindBy(xpath = "//h3//div[contains(text(),'Anniversary')]")
    public WebElement verifyAnniversary;


    /**
     * Finds and returns a list of group list elements in the navigation menu.
     * Waits up to 10 seconds for all elements to be visible before returning them.
     *
     * @return A list of WebElements representing the group list in the navigation menu.
     */
    public List<WebElement> getGroupListElements() {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy
                (By.xpath("//span[@class='app-navigation-entry__title']")));
    }


    /**
     * Finds and returns a list of WebElements that match the given group names.
     *
     * @param groupNames A list of group names to search for.
     * @return A list of WebElements that contain any of the specified group names.
     */
    public List<WebElement> getGroupElements(List<String> groupNames) {
        StringBuilder xpathBuilder = new StringBuilder("//section//div//ul//li//span[");
        for (int i = 0; i < groupNames.size(); i++) {
            if (i > 0) xpathBuilder.append(" or ");
            xpathBuilder.append("contains(text(), '" + groupNames.get(i) + "')");
        }
        xpathBuilder.append("]");
        return Driver.getDriver().findElements(By.xpath(xpathBuilder.toString()));
    }
}


