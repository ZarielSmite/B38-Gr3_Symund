package com.symund.step_definitions;

import com.symund.pages.DeletedFilesPage;
import com.symund.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//import static com.sun.org.apache.xpath.internal.compiler.Token.contains;

public class DeletedFileStepDef {

   
    DeletedFilesPage deletedFilesPage = new DeletedFilesPage();

    @Given("the user is on the  Files page")
    public void theUserIsOnTheFilesPage() {
    }

    @When("user navigates to Deleted Files module")
    public void userNavigatesToDeletedFilesModule() {
        deletedFilesPage.DeletedFileSet();
    }


    @Then("user clicks on the arrow sign to order the all deleted files by newest to oldest")
    public void userClicksOnTheUpperArrowSigntoOrderTheAllDeletedFilesByNewestToOldest() {

        BrowserUtils.waitFor(10);
        deletedFilesPage.orderDeletedFiles.click();
    }

    @Then("verify user should see deleted files by newest to oldest")
    public void verifyUserShouldSeeDeletedFilesByNewestToOldest() {


        List<WebElement> sortWebElementsByDate= deletedFilesPage.elements;

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM d, yyyy h:mm a");

        List<WebElementWithDate> elementsWithDates = new ArrayList<>();
        for (WebElement element : deletedFilesPage.elements) {
            String dateString = element.getText(); // Assuming the date is the text of the WebElement
            LocalDateTime date = LocalDateTime.parse(dateString, formatter);
            elementsWithDates.add(new WebElementWithDate(element, date));
        }

        Collections.sort(elementsWithDates);


        List<WebElement> sortedElements = new ArrayList<>();
        for (WebElementWithDate elementWithDate : elementsWithDates) {
            sortedElements.add(elementWithDate.getElement());
        }

        //return sortedElements;



    }

    public static class WebElementWithDate implements Comparable<WebElementWithDate> {
        private WebElement element;
        private LocalDateTime date;

        public WebElementWithDate(WebElement element, LocalDateTime date) {
            this.element = element;
            this.date = date;
        }

        public WebElement getElement() {
            return element;
        }

        @Override
        public int compareTo(WebElementWithDate other) {
            return this.date.compareTo(other.date);
        }
    }

    @When("user clicks on the arrow  sign to order the all deleted files by oldest to newest")
    public void userClicksOnTheArrowSignToOrderTheAllDeletedFilesByOldestToNewest() {

        BrowserUtils.waitFor(5);
        deletedFilesPage.orderDeletedFiles.click();
    }




    @Then("verify user should see deleted files by oldest to newest")
    public void verifyUserShouldSeeDeletedFilesByOldestToNewest(){

        List<WebElement> sortWebElementsByDate= deletedFilesPage.elements;

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM d, yyyy h:mm a");

        List<WebElementWithDate> elementsWithDates = new ArrayList<>();
        for (WebElement element : deletedFilesPage.elements) {
            String dateString = element.getText(); // Assuming the date is the text of the WebElement
            LocalDateTime date = LocalDateTime.parse(dateString, formatter);
            elementsWithDates.add(new WebElementWithDate(element, date));
        }

        Collections.reverse(elementsWithDates);



    }


    @When("user clicks on the three dots icon")
    public void userClicksOnTheThreeDotsIcon() {
        BrowserUtils.waitFor(3);
        deletedFilesPage.threeDotButton.click();
    }

    @Then("user clicks on the Delete Permanently button")
    public void userClicksOnTheDeletePermanentlyButton() {
        BrowserUtils.waitFor(3);

        deletedFilesPage.deletePermenently.click();
    }


    @Then("verify that the delated file is deleted permanently")
    public void verifyThatTheDelatedFileIsDeletedPermanently() {
       int numOfElements = deletedFilesPage.elements.size();
       int numOfNewElements =deletedFilesPage.elements.size() - 1;
        Assert.assertEquals(numOfElements, (numOfNewElements)+1 );
    }


    @When("user clicks on the Restore button")
    public void userClicksOnTheRestoreButton() {
        BrowserUtils.waitFor(3);

        deletedFilesPage.restore.click();
    }

    @Then("go to the All Files tab")
    public void goToTheAllFilesTab() {
        BrowserUtils.waitFor(3);

        deletedFilesPage.allFiles.click();
        
    }

    @Then("verify the restored file is under the All Files tab")
    public void verifyTheRestoredFileIsUnderTheAllFilesTab() {

        String restoredFilesInDeletedModule = deletedFilesPage.restore.getText();
        String restoredFilesInFileModule = deletedFilesPage.allFiles.getText();
        Assert.assertTrue(restoredFilesInDeletedModule.contains(restoredFilesInFileModule)  );

    }


}
