package com.bleucrm.StepDefinitions;

import com.bleucrm.Utilities.BrowserUtils;
import com.bleucrm.Utilities.Driver;
import com.bleucrm.pages.PollPage;
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
        actions.click(pollPage.Title).perform();
        BrowserUtils.waitFor(5);
        pollPage.Title.sendKeys("Sample Title");
    }

    @When("user click Add more btn on To field")
    public void user_click_add_more_btn_on_to_field() {
        pollPage.AddMoreBtn.click();
    }

    @Then("user by selecting multiple contacts from Employees and Department's contact lists.")
    public void user_by_selecting_multiple_contacts_from_employees_and_department_s_contact_lists() {
        pollPage.EmployeeAndDepartments.click();
        pollPage.Employee_1.click();
        pollPage.Employee_2.click();
        pollPage.AddMorePopUPCloseIcon.click();

    }


    @When("user click on question field and type question.")
    public void user_click_on_question_field_and_type_question() {
        pollPage.inputQuestion.sendKeys("Type a question");


    }

    @When("user click on answer fields and type multiple answers")
    public void user_click_on_answer_fields_and_type_multiple_answers() {
        pollPage.Answer1.sendKeys("Type answer1");
        pollPage.Answer2.sendKeys("Type answer2");


    }

    @Then("click the SEND btn")
    public void click_the_send_btn() {
        pollPage.Send.click();


    }


    @Then("user hover over answer box to delete by clicking on X and then confirm with OK on pop-up screen.")
    public void user_hover_over_answer_box_to_delete_by_clicking_on_x_and_then_confirm_with_ok_on_pop_up_screen() {
        pollPage.labelDeleteQuestion.click();
        Alert alert = Driver.getDriver().switchTo().alert();
        alert.accept();
    }


    @When("user hover over mouse on delete option")
    public void user_hover_over_mouse_on_delete_option() {
        pollPage.Delete.click();


    }

    @Then("user confirm on pop screen by clicking on OK")
    public void user_confirm_on_pop_screen_by_clicking_on_ok() {
        Alert alert = Driver.getDriver().switchTo().alert();
        alert.accept();

    }


    @When("user click on more button")
    public void user_click_on_more_button() {
        pollPage.AddMoreBtn.click();

    }

    @When("user hover over mouse on edit option")
    public void user_hover_over_mouse_on_edit_option() {
        pollPage.Edit.click();

    }

    @Then("user can click Allow multiple choice checkbox and confirm with send button")
    public void user_can_click_allow_multiple_choice_checkbox_and_confirm_with_send_button() {
        pollPage.ClickBoxMulti.click();

    }


    @Then("user click send button")
    public void user_click_send_button() {
        pollPage.Send.click();

    }

    @And("user click on add question to make multiple questions poll.")
    public void userClickOnAddQuestionToMakeMultipleQuestionsPoll() {
        pollPage.AddQuestion_btn.click();
    }

    @When("user must be filled up Mandatory fields; Message title, recipient,  a question,  two answers")
    public void userMustBeFilledUpMandatoryFieldsMessageTitleRecipientAQuestionTwoAnswers() {

    }
}
