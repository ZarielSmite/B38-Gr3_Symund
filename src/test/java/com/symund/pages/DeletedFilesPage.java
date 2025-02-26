package com.symund.pages;

import com.symund.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class DeletedFilesPage extends BasePage {
    WebDriver driver;
    Actions actions;
    public DeletedFilesPage() {

        this.driver = Driver.getDriver();
        this.actions = new Actions(driver);
        PageFactory.initElements(Driver.getDriver(), this);


    }
    public void DeletedFileSet() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[3]/div[1]/ul/li[7]/a")));
        //JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;

        actions.moveToElement(deletedFiles).click().perform();

        JavascriptExecutor js = (JavascriptExecutor) driver;
        // js.executeScript("arguments[0].style.display='block';", element);
    }


    @FindBy(xpath = "/html/body/div[3]/div[1]/ul/li[7]/a")
    public WebElement deletedFiles;

    @FindBy(xpath = "/html/body/div[3]/div[2]/div[13]/table/thead/tr/th[3]/a")
    public WebElement orderDeletedFiles;

    @FindBy(xpath = "tr[@data-id and @data-has-preview='true']")
    public List<WebElement> elements;

    @FindBy(xpath = "/html/body/div[3]/div[2]/div[13]/table/tbody/tr[1]/td[2]/a/span[2]/a[2]/span[1]")
    public WebElement threeDotButton;

    @FindBy(xpath = "//*[@id='fileList']/tr[1]/td[2]/div/ul/li[1]/a/span[2]")
    public WebElement deletePermenently;

    @FindBy(xpath = "/html/body/div[3]/div[2]/div[13]/table/tbody/tr[1]/td[2]/a/span[2]/a[1]/span[2]")
    public WebElement restore;

    @FindBy(xpath = "/html/body/div[3]/div[1]/ul/li[1]/a")
    public WebElement allFiles;
}
