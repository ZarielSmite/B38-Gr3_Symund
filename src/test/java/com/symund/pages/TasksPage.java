package com.symund.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TasksPage extends BasePage {

    @FindBy(xpath = "//div[@class='app-navigation-entry-icon sprt-add']//following-sibling::span")
    public WebElement addList;


    @FindBy(xpath = "//input[@id='newListInput']")
    public WebElement listName;

    @FindBy(xpath = "//input[@id='target']")
    public WebElement taskName;

    @FindBy(xpath = "(//span[@class='icon icon-sprt-bw sprt-task-star'])[1]")
    public WebElement importantStar;

    @FindBy(xpath = "//label[starts-with(@for,'toggleCompleted')][1]")
    public WebElement completedCheckbox;

    @FindBy(xpath = "//*[@id=\"collection_current\"]/div/div[1]")
    public WebElement currentTasks;

}
