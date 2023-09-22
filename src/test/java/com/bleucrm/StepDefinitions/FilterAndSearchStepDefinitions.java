package com.bleucrm.StepDefinitions;

import com.bleucrm.Utilities.BrowserUtils;
import com.bleucrm.Utilities.Driver;
import com.bleucrm.pages.FilterAndSearchPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;

public class FilterAndSearchStepDefinitions {

    FilterAndSearchPage filterAndSearchPage = new FilterAndSearchPage();


    @When("user enters username {string}")
    public void userEntersUsername(String arg0) {

        filterAndSearchPage.userName.sendKeys("hr2@cybertekschool.com");
    }

    @And("user enters password {string}")
    public void userEntersPassword(String arg0) {
        filterAndSearchPage.password.sendKeys("UserUser");
    }

    @Then("clicks to the Log In button")
    public void clicksToTheLogInButton() {
        filterAndSearchPage.loginButton.click();
    }

    @And("user lands on the home page.")
    public void userLandsOnTheHomePage() {
        filterAndSearchPage.ActivityStream.isDisplayed();
    }


    @When("user clicks on the Filter and search bar")
    public void userClicksOnTheFilterAndSearchBar() {
        filterAndSearchPage.filterAndSearch.click();
        BrowserUtils.waitFor(3);
        filterAndSearchPage.restoreDefaultFields.click();
    }

    @Then("user should be able to see default filters as my activity, work, favorite, announcements and workflows")
    public void userShouldBeAbleToSeeDefaultFiltersAsMyActivityWorkFavoriteAnnouncementsAndWorkflows() {

        Assert.assertTrue(filterAndSearchPage.workFilter.isDisplayed());
        Assert.assertTrue(filterAndSearchPage.favoritesFilter.isDisplayed());
        Assert.assertTrue(filterAndSearchPage.myActivityFilter.isDisplayed());
        Assert.assertTrue(filterAndSearchPage.announcementsFilter.isDisplayed());
        Assert.assertTrue(filterAndSearchPage.workFlowsFilter.isDisplayed());

    }


    @When("user clicks to the Filter and search bar")
    public void userClicksToTheFilterAndSearchBar() {
        filterAndSearchPage.filterAndSearch.click();
        BrowserUtils.waitFor(3);
        filterAndSearchPage.restoreDefaultFields.click();


    }

    @And("user sees add field button and click it")
    public void userSeesAddFieldButtonAndClickIt() {
        BrowserUtils.waitFor(1);
        filterAndSearchPage.addFieldButton.click();
    }

    @And("some fields are opened like Date,Type,Author etc.")
    public void someFieldsAreOpenedLikeDateTypeAuthorEtc() {
        Assert.assertTrue(filterAndSearchPage.dateField.isEnabled());
        Assert.assertTrue(filterAndSearchPage.typeField.isEnabled());
        Assert.assertTrue(filterAndSearchPage.authorField.isEnabled());
        Assert.assertTrue(filterAndSearchPage.toField.isEnabled());
        Assert.assertTrue(filterAndSearchPage.favoritesField.isEnabled());
        Assert.assertTrue(filterAndSearchPage.tagField.isEnabled());
        Assert.assertTrue(filterAndSearchPage.FieldExtranet.isEnabled());


    }

    @And("user sees all choosen fields' input boxes is displayed on the screen")
    public void userSeesAllChoosenFieldsInputBoxesIsDisplayedOnTheScreen() {
        Assert.assertTrue(filterAndSearchPage.dateField.isDisplayed());
        Assert.assertTrue(filterAndSearchPage.typeField.isDisplayed());
        Assert.assertTrue(filterAndSearchPage.authorField.isDisplayed());
        Assert.assertTrue(filterAndSearchPage.toField.isDisplayed());
        Assert.assertTrue(filterAndSearchPage.favoritesField.isDisplayed());
        Assert.assertTrue(filterAndSearchPage.tagField.isDisplayed());
        Assert.assertTrue(filterAndSearchPage.FieldExtranet.isDisplayed());
    }

    @Then("user unchecks all field checkboxes and user sees all input boxes disappeared")
    public void userUnchecksAllFieldCheckboxesAndUserSeesAllInputBoxesDisappeared() {
        filterAndSearchPage.dateField.click();
        filterAndSearchPage.typeField.click();
        filterAndSearchPage.authorField.click();
        filterAndSearchPage.toField.click();
    }


    @When("user clicks to the date box")
    public void userClicksToTheDateBox() {
        filterAndSearchPage.filterAndSearch.click();
        BrowserUtils.waitFor(3);
        filterAndSearchPage.restoreDefaultFields.click();
        BrowserUtils.waitFor(1);
        filterAndSearchPage.dateCreate.click();
    }

    @And("user sees date box")
    public void userSeesDateBox() {
        BrowserUtils.waitFor(1);
        Assert.assertTrue(filterAndSearchPage.dateCreate.isDisplayed());
    }


    @And("user chooses a Specific Date")
    public void userChoosesASpecificDate() {
        BrowserUtils.waitFor(1);
        filterAndSearchPage.yesterday.click();
    }


    @Then("user clicks the search button and user can search with specific date successfully")
    public void userCanSearchWithSpecificDateSuccessfully() {
        filterAndSearchPage.filterAndSearch.sendKeys("absd");
        filterAndSearchPage.searchButton.click();
    }


    @When("user is on the Filter and search bar")
    public void userIsOnTheFilterAndSearchBar() {
        BrowserUtils.waitFor(1);
        filterAndSearchPage.filterAndSearch.click();
    }

    @And("user clicks to the Type box")
    public void userClicksToTheTypeBox() {
        BrowserUtils.waitFor(2);
        filterAndSearchPage.typeInputBox.click();

    }

    @And("user chooses only one type")
    public void userChoosesOnlyOneType() {
        BrowserUtils.waitFor(2);
        filterAndSearchPage.posts.click();
    }

    @Then("user click the search button and user can search single type successfully")
    public void userClickTheSearchButton() {
        filterAndSearchPage.filterAndSearch.sendKeys("absd");
        filterAndSearchPage.searchButton.click();


    }

    @When("user is on the Filter and search")
    public void user_is_on_the_filter_and_search() {
        filterAndSearchPage.filterAndSearch.click();
        BrowserUtils.waitFor(3);
        filterAndSearchPage.restoreDefaultFields.click();
        BrowserUtils.waitFor(1);


    }

    @And("user chooses multiple types")
    public void userChoosesMultipleTypes() {
        filterAndSearchPage.announcements.click();
        BrowserUtils.waitFor(2);


    }


    @Then("user clicks search button and user can search multiple types successfully")
    public void userCanSearchMultipleTypesSuccessfully() {
        filterAndSearchPage.filterAndSearch.sendKeys("absd");
        filterAndSearchPage.searchButton.click();

    }


    @When("user clicks to the save filter button")
    public void userClicksToTheSaveFilterButton() {
        filterAndSearchPage.filterAndSearch.click();
        BrowserUtils.waitFor(3);
        filterAndSearchPage.saveFilter.click();
        BrowserUtils.waitFor(3);

    }

    @And("user gives name of the filter as {string}")
    public void userGivesNameOfTheFilterAs(String arg0) {
        filterAndSearchPage.filterNameInput.sendKeys(arg0);
        BrowserUtils.waitFor(3);
    }

    @And("user clicks to the Save button")
    public void userClicksToTheSaveButton() {
        filterAndSearchPage.saveButton.click();
        BrowserUtils.waitFor(3);
    }


    @Then("user should see the {string} as filter name under the filters menu")
    public void userShouldSeeTheAsFilterNameUnderTheFiltersMenu(String arg0) {
        Assert.assertTrue(filterAndSearchPage.filterNameDisplay.isDisplayed());
        Assert.assertEquals(arg0, filterAndSearchPage.filterNameDisplay.getText());
    }


    @And("user chooses some filters on the filter and search bar")
    public void userChoosesSomeFiltersOnTheFilterAndSearchBar() {
        filterAndSearchPage.filterAndSearch.click();
        BrowserUtils.sleep(1);
        filterAndSearchPage.addFieldButton.click();
        BrowserUtils.sleep(1);
        filterAndSearchPage.dateField.click();
        BrowserUtils.sleep(1);
        filterAndSearchPage.typeField.click();
        BrowserUtils.sleep(1);
        filterAndSearchPage.authorField.click();
        BrowserUtils.sleep(1);
        filterAndSearchPage.toField.click();


    }

    @And("user clicks Restore default fields button")
    public void userClicksRestoreDefaultFieldsButton() {

        filterAndSearchPage.restoreDefaultFields.click();
    }

    @Then("user can restore the default field successfully")
    public void userCanRestoreTheDefaultFieldSuccessfully() {
        filterAndSearchPage.restoreDefaultFields.click();

        Assert.assertTrue(filterAndSearchPage.dateField.isEnabled());
        Assert.assertTrue(filterAndSearchPage.typeInputBox.isEnabled());
        Assert.assertTrue(filterAndSearchPage.authorField.isEnabled());
        Assert.assertTrue(filterAndSearchPage.toField.isEnabled());

        Assert.assertFalse(filterAndSearchPage.favoritesField.isSelected());
        Assert.assertFalse(filterAndSearchPage.tagField.isSelected());
        Assert.assertFalse(filterAndSearchPage.FieldExtranet.isSelected());
    }


    @When("user clicks to the add field button")
    public void userClicksToTheAddFieldButton() {
        filterAndSearchPage.filterAndSearch.click();
        BrowserUtils.sleep(1);
        filterAndSearchPage.addFieldButton.click();

    }

    @And("user clicks to the Favorites, Tag and Extranet field checkboxes")
    public void userClicksToTheFavoritesTagAndExtranetFieldCheckboxes() {
        filterAndSearchPage.dateField.click();
        BrowserUtils.sleep(1);
        filterAndSearchPage.typeField.click();
        BrowserUtils.sleep(1);
        filterAndSearchPage.authorField.click();
        BrowserUtils.sleep(1);
        filterAndSearchPage.toField.click();
    }

    @And("user clicks to the Reset Button")
    public void userClicksToTheResetButton() {
     filterAndSearchPage.restoreDefaultFields.click();


    }


    @Then("user should see Date, Type, Author and To fields checked and Favorites, Tag, Extranet fields unchecked as default")
    public void userShouldSeeDateTypeAuthorAndToFieldsCheckedAndFavoritesTagExtranetFieldsUncheckedAsDefault() {

        Assert.assertTrue(filterAndSearchPage.dateField.isEnabled());
        Assert.assertTrue(filterAndSearchPage.typeInputBox.isEnabled());
        Assert.assertTrue(filterAndSearchPage.authorField.isEnabled());
        Assert.assertTrue(filterAndSearchPage.toField.isEnabled());

        Assert.assertFalse(filterAndSearchPage.favoritesField.isSelected());
        Assert.assertFalse(filterAndSearchPage.tagField.isSelected());
        Assert.assertFalse(filterAndSearchPage.FieldExtranet.isSelected());
    }
}
