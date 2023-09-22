package com.bleucrm.StepDefinitions;

import com.bleucrm.Utilities.BrowserUtils;
import com.bleucrm.Utilities.Driver;
import com.bleucrm.pages.AddQuotes;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AddQuotes_StepDef {

    AddQuotes addQuotes = new AddQuotes();

    WebDriverWait wait;

    @When("user clicks on the quotes button")
    public void user_clicks_on_the_qoutes_button() {
        wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(addQuotes.quotesButton));
        addQuotes.quotesButton.click();
    }
    @And("user enters {string}")
    public void user_enters(String quotes) {
        quotes = "Good intention put the owner into the heaven.";
        //wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        //wait.until(ExpectedConditions.visibilityOf(addQuotes.blockQuotes));
        BrowserUtils.sleep(3);
        Driver.getDriver().switchTo().frame(0);
        //addQuotes.blockQuotes.click();
        //wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(5));
        //wait.until(ExpectedConditions.visibilityOf(addQuotes.blockQuotes));
        BrowserUtils.sleep(3);
        addQuotes.blockQuotes.sendKeys(quotes);
    }
    @Then("user verify that quotes is displayed")
    public void user_verify_that_quotes_is_displayed() {
        wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(addQuotes.blockQuotes));
        Assert.assertTrue(addQuotes.verifyQuotes.isDisplayed());
    }
}
