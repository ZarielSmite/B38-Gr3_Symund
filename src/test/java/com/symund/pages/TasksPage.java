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

    @FindBy(xpath = "//*[@id=\"collection_starred\"]/div/div[1]")
    public WebElement importantCount;

    @FindBy(xpath = "//label[starts-with(@for,'toggleCompleted')][1]")
    public WebElement completedCheckbox;

    @FindBy(xpath = "//*[@id=\"app-content-vue\"]/div/div[2]/div/ol[2]/li/div[1]/div[1]/label")
    public WebElement unCompletedCheckbox;

    @FindBy(xpath = "//*[@id=\"collection_current\"]/div/div[1]")
    public WebElement currentTasks;

    @FindBy(xpath = "//*[@id=\"app-content-vue\"]/div/div[2]/div/div/span")
    public WebElement listAllCompletedTasksButton;

    @FindBy(xpath = "//*[@id=\"collection_completed\"]/div/div[1]")
    public WebElement completedTabCount;

    @FindBy(xpath = "//*[@id=\"app-navigation-vue\"]/ul/li[7]/ul/div/div/ul/li[1]")
    public WebElement listColorGreen;

    @FindBy(xpath = "//*[@id=\"app-navigation-vue\"]/ul/li[7]/ul/div/div/ul/li[2]")
    public WebElement listColorBlue;

    @FindBy(xpath = "//*[@id=\"app-navigation-vue\"]/ul/li[7]/ul/div/div/ul/li[3]")
    public WebElement listColorOrange;

    @FindBy(xpath = "//*[@id=\"app-navigation-vue\"]/ul/li[7]/ul/div/div/ul/li[4]")
    public WebElement listColorYellow;

    @FindBy(xpath = "//*[@id=\"app-navigation-vue\"]/ul/li[7]/ul/div/div/ul/li[5]")
    public WebElement listColorPurple;

    @FindBy(xpath = "//*[@id=\"app-navigation-vue\"]/ul/li[7]/ul/div/div/ul/li[6]")
    public WebElement listColorPink;

    @FindBy(xpath = "//*[@id=\"app-navigation-vue\"]/ul/li[7]/ul/div/div/ul/li[7]")
    public WebElement listColorBlack;

    @FindBy(xpath = "//*[@id=\"app-navigation-vue\"]/ul/li[7]/ul/div/div/ul/li[8]")
    public WebElement listColorGray;

}
