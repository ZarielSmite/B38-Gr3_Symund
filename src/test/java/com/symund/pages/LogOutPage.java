package com.symund.pages;

import io.cucumber.java.en.Given;
import io.cucumber.messages.types.Background;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogOutPage extends BasePage{

    @FindBy(xpath = "//div//img[@height='32']")
    public WebElement profileButton;

    @FindBy(xpath = "//header//div[2]//nav//ul//li[4][contains(id,logout)]//a")
    public WebElement logOutButton;

    @FindBy(id = "submit-form")
    public WebElement loginButton;


}
