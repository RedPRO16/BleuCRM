package com.bleucrm.StepDefinitions;

import com.bleucrm.Utilities.BrowserUtils;
import com.bleucrm.pages.UploadPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UploadStepDefinition {

    UploadPage uploadPage = new UploadPage();

    @When("user should click message button")
    public void user_should_click_message_button() {
        uploadPage.messageButton.click();
        BrowserUtils.waitFor(2);
    }

    @When("user should click upload files button")
    public void user_should_click_upload_files_button() {
        uploadPage.uploadButton.click();

    }

    @When("user should choose files for uploading and attach the files to the message")
    public void user_should_choose_files_for_uploading_and_attach_the_files_to_the_message() {

        String filepath1 = "/Users/macbook/Desktop/PROJECT/TEST-1.docx";
        String filepath2 = "/Users/macbook/Desktop/PROJECT/TEST-2.pdf";
        String filepath3 = "/Users/macbook/Desktop/PROJECT/TEST-3.pptx";
        uploadPage.uploadfileandpicturesButton.sendKeys(filepath1 + "\n" + filepath2 + "\n" + filepath3);


    }

    @Then("user should see uploaded files under the message")
    public void user_should_see_uploaded_files_under_the_message() {
        String expected1 = "TEST-1";
        String expected2 = "TEST-2";
        String expected3 = "TEST-3";
    }

    @And("user should choose different types files for uploading and attach the files to the message")
    public void userShouldChooseDifferentTypesFilesForUploadingAndAttachTheFilesToTheMessage() {

        String filepath1 = "/Users/macbook/Desktop/PROJECT/TEST-1.docx";
        String filepath2 = "/Users/macbook/Desktop/PROJECT/TEST-2.pdf";
        String filepath3 = "/Users/macbook/Desktop/PROJECT/TEST-3.pptx";
        uploadPage.uploadfileandpicturesButton.sendKeys(filepath1 + "\n" + filepath2 + "\n" + filepath3);
    }

    @Then("user clicks the send button")
    public void userClicksTheSendButton() {
        BrowserUtils.sleep(2);
        uploadPage.sendButton.click();
    }
    @And("user should upload picture")
    public void userShouldUploadPicture() {
        String picture="/Users/macbook/Desktop/PROJECT/TEST-4.png";
        BrowserUtils.sleep(3);
        uploadPage.uploadfileandpicturesButton.sendKeys(picture);

    }

    @Then("user should see uploaded pictures under the message")
    public void userShouldSeeUploadedPicturesUnderTheMessage() {

    }


}
