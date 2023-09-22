package com.bleucrm.StepDefinitions;

import com.bleucrm.Utilities.BrowserUtils;
import com.bleucrm.Utilities.Driver;
import com.bleucrm.pages.PollPage;
import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Alert;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.awt.*;

public class PollStepDefinitions {

    PollPage pollPage = new PollPage();
    Actions actions = new Actions(Driver.getDriver());

    @When("user click POLL tab under active stream page")
    public void user_click_poll_tab_under_active_stream_page() {
        BrowserUtils.waitFor(2);
        pollPage.PollTab.click();
    }

    @When("user type a poll title")
    public void user_type_a_poll_title() {
        BrowserUtils.waitFor(2);
        Driver.getDriver().switchTo().frame(pollPage.iFrame);
        BrowserUtils.waitFor(3);
        Faker faker = new Faker();
        pollPage.Title.sendKeys(faker.backToTheFuture().character());
       // actions.sendKeys(pollPage.Title,"Deneme").perform();
        BrowserUtils.waitFor(3);
        Driver.getDriver().switchTo().defaultContent();
    }

    @When("user click Add more btn on To field")
    public void user_click_add_more_btn_on_to_field() {
        pollPage.AddMoreBtn.click();
    }

    @Then("user by selecting multiple contacts from Employees and Department's contact lists.")
    public void user_by_selecting_multiple_contacts_from_employees_and_department_s_contact_lists() {
        pollPage.EmployeeAndDepartments.click();
        BrowserUtils.waitFor(1);
        pollPage.Employee_1.click();
        BrowserUtils.waitFor(1);
        pollPage.Employee_2.click();
        BrowserUtils.waitFor(1);
        pollPage.Employee_3.click();
        BrowserUtils.waitFor(1);
        pollPage.AddMorePopUPCloseIcon.click();
        BrowserUtils.waitFor(1);

    }


    @When("user click on question field and type question.")
    public void user_click_on_question_field_and_type_question() {
        pollPage.inputQuestion.sendKeys("Type a question");
        BrowserUtils.waitFor(1);


    }

    @When("user click on answer fields and type multiple answers")
    public void user_click_on_answer_fields_and_type_multiple_answers() {
        BrowserUtils.waitFor(1);
        pollPage.Answer1.sendKeys("Type answer1");
        BrowserUtils.waitFor(1);
        pollPage.Answer2.sendKeys("Type answer2");
        BrowserUtils.waitFor(1);
        pollPage.Answer3.sendKeys("Type answer3");
        BrowserUtils.waitFor(1);

    }

    @Then("click the SEND btn")
    public void click_the_send_btn() {
        pollPage.Send.click();
        BrowserUtils.waitFor(3);


    }


    @Then("user hover over answer box to delete by clicking on X and then confirm with OK on pop-up screen.")
    public void user_hover_over_answer_box_to_delete_by_clicking_on_x_and_then_confirm_with_ok_on_pop_up_screen() {

        pollPage.editAnswer.click();
        BrowserUtils.waitFor(2);
        actions.moveToElement(pollPage.labelDeleteQuestion).perform();
        BrowserUtils.waitFor(1);
        pollPage.labelDeleteQuestion.click();
        BrowserUtils.waitFor(3);
        Alert alert = Driver.getDriver().switchTo().alert();
        BrowserUtils.waitFor(1);
        alert.accept();
    }


    @When("user hover over mouse on delete the poll")
    public void user_hover_over_mouse_on_delete_the_poll() {
        pollPage.Delete.click();
        Alert alert = Driver.getDriver().switchTo().alert();
        alert.accept();


    }

    @Then("user confirm on pop screen by clicking on OK")
    public void user_confirm_on_pop_screen_by_clicking_on_ok() {


    }


    @When("user click on more button")
    public void user_click_on_more_button() {

        Driver.getDriver().get("https://qa.bleucrm.com/stream/");
        BrowserUtils.waitFor(3);
        pollPage.MoreBtn.click();
        BrowserUtils.waitFor(3);

    }

    @When("user hover over mouse on edit option")
    public void user_hover_over_mouse_on_edit_option() {
        pollPage.Edit.click();
        BrowserUtils.waitFor(3);

    }

    @Then("user can click Allow multiple choice checkbox and confirm with send button")
    public void user_can_click_allow_multiple_choice_checkbox_and_confirm_with_send_button() {
        pollPage.ClickBoxMulti.click();

    }


    @Then("user click send button")
    public void user_click_send_button() {
        pollPage.Send.click();
        BrowserUtils.waitFor(3);

    }

    @And("user click on add question to make multiple questions poll.")
    public void userClickOnAddQuestionToMakeMultipleQuestionsPoll() {
        pollPage.AddQuestion_btn.click();
    }

    @When("user must be filled up Mandatory fields; Message title, recipient,  a question,  two answers")
    public void userMustBeFilledUpMandatoryFieldsMessageTitleRecipientAQuestionTwoAnswers() {

    }

    @When("user click on more button last time")
    public void userClickOnMoreButtonLastTime() {
        BrowserUtils.waitFor(2);
        pollPage.MoreBtn2.click();
        BrowserUtils.waitFor(2);


    }
}
