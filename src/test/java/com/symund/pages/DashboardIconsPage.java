package com.symund.pages;

import com.symund.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;





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
                        (By.xpath("//h3[contains(@title, '" + fileName + "')]"));
        fileLink.click();




    }

    // method to verify that user can see detailed side page of what they searched
    public void verifyDetailedSidePageOfFile(String fileName) {
        WebElement header =
                Driver.getDriver().findElement(By.xpath("//h2[contains(text(), '"+fileName+"')]"));
        String headerText = header.getText();

        Assert.assertTrue(headerText.contains(fileName));
}


     @FindBy (xpath = "//div[@class='logo logo-icon']")
    public WebElement logoIcon;



}
