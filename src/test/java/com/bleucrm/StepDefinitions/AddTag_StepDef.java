package com.bleucrm.StepDefinitions;

import com.bleucrm.Utilities.Driver;
import com.bleucrm.pages.AddTagPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AddTag_StepDef {

    AddTagPage addTags = new AddTagPage();

    WebDriverWait wait;

    @When("user clicks on the add tag button")
    public void user_clicks_on_the_add_tag_button() {
        wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(addTags.addTagButton));
        addTags.addTagButton.click();
    }
    @And("user enters the {string}")
    public void user_enters_the(String tag) {
        tag = "JohnWickGOAT";
        wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(addTags.tagSection));
        addTags.tagSection.sendKeys(tag);
    }
    @And("user clicks on the add button")
    public void user_clicks_on_the_add_button() {
        wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(addTags.addButton));
        addTags.addButton.click();
    }
    @And("user deletes the tag before sending the message")
    public void user_deletes_the_tag_before_sending_the_message() {
        wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(addTags.deleteButton));
        addTags.deleteButton.click();
    }
    @Then("user verifies that the tag is deleted")
    public void user_verifies_that_the_tag_is_deleted() {
        Assert.assertTrue(addTags.verify.isDisplayed());
    }

}
