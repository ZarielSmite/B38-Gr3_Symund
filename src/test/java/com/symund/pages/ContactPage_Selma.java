package com.symund.pages;

import com.symund.utilities.Driver;
import io.cucumber.java.zh_cn.假如;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
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

    public List<WebElement> getGroupListElements() {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10)); // Max 10 saniye bekler
        return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//span[@class='app-navigation-entry__title']")));
    }

    @FindBy(xpath = "//span[@title='All contacts']")
    public WebElement allContacts;

    @FindBy(xpath = "//button[@id='new-contact-button']")
    public WebElement newContact;

    @FindBy(xpath = "//input[@placeholder='Add contact in group']")
    public WebElement groupButton;

    @FindBy(xpath = "//ul[@class='multiselect__content']/li/div")
    public List<WebElement> groupList1;




    @FindBy(css = "div.multiselect__select")
    public WebElement dropdownButton;

    @FindBy(xpath = "//ul[@class='multiselect__content']//li//div")
    public List<WebElement> groupList;

    @FindBy(xpath = "//input[@placeholder='Choose property type']")
    public  WebElement addProperty;


    @FindBy (xpath = "//div[@title='Anniversary']")
    public  WebElement anniversary;

    @FindBy(xpath = "//div[@title='Anniversary']")
    public List<WebElement> secondAnniversary;

    @FindBy(xpath = "//h3//div[contains(text(),'Anniversary')]")
    public WebElement verifyAnniversary;

 //   @FindBy(xpath = "//section//div//ul//li//span[contains(text(),'Friends')]")

    @FindBy(xpath = "//section//div//ul//li//span[contains(text(),'Family') or contains(text(),'Friends') or contains(text(),'Work') or contains(text(),'Gym')]")
   public List<WebElement> groupElements;

    // WebElement listesine erişim sağlıyoruz
    public List<WebElement> getGroupElements(List<String> groupNames) {
        // Dinamik olarak grup isimlerini içeren XPath kullanmak için
        StringBuilder xpathBuilder = new StringBuilder("//section//div//ul//li//span[");
        for (int i = 0; i < groupNames.size(); i++) {
            if (i > 0) xpathBuilder.append(" or ");
            xpathBuilder.append("contains(text(), '" + groupNames.get(i) + "')");
        }
        xpathBuilder.append("]");

        // Dinamik XPath ile WebElement listesine erişim sağlıyoruz
        return Driver.getDriver().findElements(By.xpath(xpathBuilder.toString()));
    }





    // Sayfanın tamamen yüklenmesini bekle
    public void waitForPageToLoad() {
        new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10))
                .until(webDriver -> ((JavascriptExecutor) webDriver)
                        .executeScript("return document.readyState").equals("complete"));
    }

    // Dropdown menüsünü aç
    public void openDropdown() {
        waitForPageToLoad();
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(5));
        WebElement dropdown = wait.until(ExpectedConditions.elementToBeClickable(dropdownButton));

        // Actions kullanarak dropdown'a tıklama
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(dropdown).click().perform();
    }

    // Grup ismini bul ve döndür (contains kullanarak)
    public WebElement getGroupElement(String groupName) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(5));
        List<WebElement> groups = wait.until(ExpectedConditions.visibilityOfAllElements(groupList));

        for (WebElement group : groups) {
            if (group.getAttribute("title").contains(groupName)) {
                return group;
            }

        }
        return null; // Eğer grup bulunamazsa null döndür
    }

}


