package com.bleucrm.StepDefinitions;

import com.bleucrm.Utilities.BrowserUtils;
import com.bleucrm.Utilities.Driver;
import com.bleucrm.pages.AttachLink;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AttachLink_StepDef {

    WebDriverWait wait;
    AttachLink attachLink = new AttachLink();

    @When("user clicks on the link button")
    public void user_clicks_on_the_link_button() {
        //wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        //wait.until(ExpectedConditions.visibilityOf(attachLink.linkButton));
        wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(15));
        wait.until(ExpectedConditions.visibilityOf(attachLink.linkButton));
        attachLink.linkButton.click();
    }

    @And("user types whatever he wants in the link text section")
    public void user_types_whatever_he_wants_in_the_link_text_section() {
        wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(attachLink.linkTextButton));
        attachLink.linkTextButton.sendKeys("John Wick is GOAT :)");
    }

    @And("user enters the link URL")
    public void user_enters_the_link_URL() {
        wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(attachLink.linkURLButton));
        attachLink.linkURLButton.sendKeys("https://www.youtube.com/shorts/hWOqEScJ22o");
    }
    @And("user clicks on the save button")
    public void user_clicks_on_the_save_button() {
        wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(attachLink.saveButton));
        attachLink.saveButton.click();
    }

    @And("user right clicks on the link")
    public void userRightClicksOnTheLink() {
        BrowserUtils.waitFor(3);
        Driver.getDriver().switchTo().frame(0);
        Actions action = new Actions(Driver.getDriver());
        action.moveToElement(attachLink.givenLink).contextClick().perform();
        BrowserUtils.waitFor(8);
        attachLink.removeLinkButton.click();
    }


    @Then("user verifies that link is NOT displayed")
    public void user_verifies_that_link_is_NOT_displayed() {
        //wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        //wait.until(ExpectedConditions.elementToBeClickable(attachLink.verifyLink));
        Assert.assertTrue(attachLink.verifyLink.isDisplayed());
    }
}
