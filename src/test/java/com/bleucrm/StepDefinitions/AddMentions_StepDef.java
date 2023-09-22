package com.bleucrm.StepDefinitions;

import com.bleucrm.Utilities.BrowserUtils;
import com.bleucrm.Utilities.ConfigurationReader;
import com.bleucrm.Utilities.Driver;
import com.bleucrm.pages.AddMention;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AddMentions_StepDef {

    WebDriverWait wait;
    AddMention addMention = new AddMention();

    //@Given("user is on the login page")
    //public void userIsOnTheLoginPage() {
    //    Driver.getDriver().get(ConfigurationReader.getProperty("login.page.url"));
    //}
    @When("user clicks on the send messages button")
    public void user_clicks_on_the_send_messages_button() {
        addMention.sendMessagesSection.click();
    }


    @And("user clicks on the Add Mention button")
    public void user_clicks_on_the_add_mention_button() {
        wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(addMention.addMentionButton));
        addMention.addMentionButton.click();
    }
    @And("user clicks on the Employees and Department Button")
    public void user_clicks_on_the_employees_and_department_button() {
        wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(addMention.employeesAndDepartmentsBtn));
        addMention.employeesAndDepartmentsBtn.click();

    }
    @And("user clicks on the hr2@cybertekschool.com")
    public void user_clicks_on_the_hr2_cybertekschool_com() {
        wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(addMention.employee1));
        addMention.employee1.click();
    }
    @And("user clicks on the Add More button")
    public void user_clicks_on_the_add_more_button() {
        wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(addMention.addMoreBtn));
        addMention.addMoreBtn.click();
    }
    @And("user clicks on the helpdesk22@cybertekschool.com")
    public void user_clicks_on_the_helpdesk22_cybertekschool_com() {
        wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(addMention.employee2));
        addMention.employee2.click();
    }
    @Then("verify the added contacts are displayed on the To box")
    public void verify_the_added_contacts_are_displayed_on_the_to_box() {
        Assert.assertTrue(addMention.employee1Verification.isDisplayed());
        Assert.assertTrue(addMention.employee2Verification.isDisplayed());
    }

}
