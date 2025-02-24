package com.symund.pages;

import com.symund.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;

public class DashboardIconsPage extends BasePage {
    @FindBy(xpath = "//span[@aria-label='Magnify icon']")
    public WebElement magnifyIcon;


    @FindBy(xpath = "//input[@type='search']")
    public WebElement searchIcon;




    // Method to sendKeys to search box
    public void searchFile(String fileName) {
        WebElement searchIcon = this.searchIcon;
        searchIcon.sendKeys(fileName);

    }

    // method to click what we searched in searchBox
    public void clickToResult(String fileName) {
        WebElement fileLink =
                Driver.getDriver().findElement
                        (By.xpath("//*[contains(@title, '" + fileName + "')]"));
        fileLink.click();

    }

    // method to verify that user can see detailed side page of what they searched
    public void verifyDetailedSidePageOfFile() {

    }



}
