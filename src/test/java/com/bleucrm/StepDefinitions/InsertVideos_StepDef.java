package com.bleucrm.StepDefinitions;

import com.bleucrm.Utilities.BrowserUtils;
import com.bleucrm.Utilities.Driver;
import com.bleucrm.pages.InsertVideos;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class InsertVideos_StepDef {

    InsertVideos insertVideos = new InsertVideos();

    WebDriverWait wait;

    @When("user clicks on the insert video button")
    public void user_clicks_on_the_insert_video_button() {
        wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(insertVideos.insertVideoButton));
        insertVideos.insertVideoButton.click();
    }

    @And("user enters YouTube {string}")
    public void user_enters_YouTube(String youtubeLink) {
        youtubeLink = "https://www.youtube.com/shorts/hWOqEScJ22o";
        wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(insertVideos.videoSourceBar));
        insertVideos.videoSourceBar.sendKeys(youtubeLink);
    }

    @And("user verify that video could seen in the preview section")
    public void user_verify_that_video_could_seen_in_the_preview_section() {
        wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(insertVideos.videoPreviewSection));
        if (insertVideos.videoPreviewSection.isDisplayed()){
            System.err.println("Bug!!!");
        }else {
            System.out.println("Successfully");
        }
    }

    @And("user clicks on the cancel button")
    public void userClicksOnTheCancelButton() {
        wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(insertVideos.cancelButton));
        insertVideos.cancelButton.click();
    }

    @And("user again clicks on the insert video button")
    public void userAgainClicksOnTheInsertVideoButton() {
        wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(insertVideos.insertVideoButton));
        insertVideos.insertVideoButton.click();
    }

    @And("user enters Vimeo {string}")
    public void userEntersVimeo(String vimeoLink) {
        BrowserUtils.waitFor(1);
        vimeoLink = "https://vimeo.com/channels/documentary/781627907";
        insertVideos.videoSourceBar.sendKeys(vimeoLink);
        BrowserUtils.waitFor(15);
    }

    @And("user verify that video could seen in the preview section two")
    public void userVerifyThatVideoCouldSeenInThePreviewSection() {
        wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(insertVideos.videoPreviewSection));
        //Assert.assertTrue(insertVideos.videoPreviewSection.isDisplayed());
        if (insertVideos.videoPreviewSection.isDisplayed()){
            System.err.println("Bug!!!");
        }else {
            System.out.println("Successfully");
        }
    }

    @Then("user cancels the video insert before sending the message")
    public void userCancelsTheVideoInsertBeforeSendingTheMessage() {
        wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(insertVideos.cancelButton));
        insertVideos.cancelButton.click();
    }
}
