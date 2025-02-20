package com.symund.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class DelatedFilesPage extends BasePage {

    @FindBy(xpath = "//span[@class='sort-indicator icon-triangle-s']")
    public WebElement orderDelatedFiles;

    @FindBy(xpath = "(//div[@id='headerName-container']//span)[1]")
    public WebElement totalNumberOfFoldersFiles;

    @FindBy(xpath = "//tr[@data-type='dir']")
    public List<WebElement> folders;

    @FindBy(xpath = "//tr[@data-type='file']")
    public List<WebElement> files;
}
