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


     @FindBy(xpath = "//li[contains(@class, 'participant-row')]") // other locator //li[@class='participant-row isSearched']
     public List<WebElement> participantList;


     public List<String> getParticipantNames(){
         List<WebElement> nameList = participantList;
         List<String> nameListString= new ArrayList<>();

         for (WebElement name : nameList) {
             nameListString.add(name.getText());
         }
         return nameListString;
     }

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


    public void scrollToDeleteConversationAndClick(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        JavascriptExecutor jsExecutor =(JavascriptExecutor) driver;

        actions.moveToElement(deleteConversationButton).click().perform();
    }


    @FindBy(xpath = "//div[contains(@class,'twobuttons')]/button[2]")
    public WebElement deleteAcceptanceButton;
}
