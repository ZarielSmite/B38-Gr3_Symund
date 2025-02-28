package com.symund.pages;

import com.symund.utilities.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;


public class TalkPage extends BasePage {

    WebDriver driver;
    Actions actions;

    public TalkPage() {
        this.driver = Driver.getDriver();
        this.actions = new Actions(driver);
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//button[@class='toggle has-tooltip']")
    public WebElement plusIcon;


    @FindBy(xpath = "//input[@class='conversation-name']")
    public WebElement inputConversationName;


    @FindBy(xpath = "//button[contains(@class, 'navigation')]")
    public WebElement addParticipantButton;


     @FindBy(xpath = "//li[contains(@class, 'participant-row')]")
     public List<WebElement> participantList;

    /***
     * Retrieves the names of participants from the list and returns them as a list of strings.
     * This will be used to select participants when creating a conversation group.
     * @return List of participant names as Strings.
     */
     public List<String> getParticipantNames(){
         List<WebElement> nameList = participantList;
         List<String> nameListString= new ArrayList<>();

         for (WebElement name : nameList) {
             nameListString.add(name.getText());
         }
         return nameListString;
     }

    /**
     * Retrieves the list of participant elements.
     * This can be used to interact with participant elements, such as selecting them.
     * @return List of WebElements representing participants
     */
     public List<WebElement> getParticipantElements(){

         return participantList;
     }


    @FindBy(xpath = "//button[contains(@class, 'primary')]")
    public WebElement createConversationButton;


    @FindBy(xpath = "(//div[contains(@class, 'line-one')])[1]")
    public WebElement createdConversation;


    @FindBy(xpath = "//button[contains(@class, 'icon action-item__menutoggle ')]")
    public WebElement threeDotMenu;


    @FindBy(xpath = "//li//button//span[contains(text(),'Delete conversation')]")
    public WebElement deleteConversationButton;

    /***
     * Clicks the "Delete Conversation" button using Actions class.
     * This ensures the button is clicked even if it is not directly interactable.
     */
    public void scrollToDeleteConversationAndClick(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        JavascriptExecutor jsExecutor =(JavascriptExecutor) driver;

        actions.moveToElement(deleteConversationButton).click().perform();
    }


    @FindBy(xpath = "//div[contains(@class,'twobuttons')]/button[2]")
    public WebElement deleteAcceptanceButton;
}
