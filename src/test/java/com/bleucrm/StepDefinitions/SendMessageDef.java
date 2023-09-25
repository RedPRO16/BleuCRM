package com.bleucrm.StepDefinitions;


import com.bleucrm.Utilities.BrowserUtils;
import com.bleucrm.Utilities.Driver;
import com.bleucrm.pages.SendMessagePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


public class SendMessageDef {

    SendMessagePage sendMessagePage = new SendMessagePage();




    @When("user click message header")

    public void user_click_message_header() {
        BrowserUtils.waitFor(2);
        sendMessagePage.messageButton.click();
        BrowserUtils.waitFor(2);

        Driver.getDriver().switchTo().frame(sendMessagePage.iframe);
        BrowserUtils.waitFor(2);
        

    }
    @When("user writes message to the message field")
    public void user_writes_message_to_the_message_field() {
        sendMessagePage.inputMessage.sendKeys("Message");
        BrowserUtils.waitFor(2);

    }
    @Then("user should send the message")
    public void user_should_send_the_message() {
        sendMessagePage.sendButton.click();

    }

    @When("user verify To field , default to All employees")
    public void user_verify_to_field_default_to_all_employees() {
        Assert.assertTrue(sendMessagePage.allEmployees.isDisplayed());

    }
    @Then("user should change the To field from All employee to whatever wants")
    public void user_should_change_the_to_field_from_all_employee_to_whatever_wants() {

        sendMessagePage.AddMoreBtn.click();

    }


    @When("verify cancel button is clickable")
    public void verify_cancel_button_is_clickable() {
        Assert.assertTrue(sendMessagePage.cancelButton.isDisplayed());

    }
    @Then("user should be click cancel button any time")
    public void user_should_be_click_cancel_button_any_time() {
        sendMessagePage.cancelButton.click();

    }




}
