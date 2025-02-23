package com.symund.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardIconsPage extends BasePage {
    @FindBy(xpath = "//span[@aria-label='Magnify icon']")
    public WebElement magnifyIcon;

}
