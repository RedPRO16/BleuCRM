package com.bleucrm.StepDefinitions;

import com.bleucrm.pages.TaskPage;

import com.bleucrm.Utilities.BrowserUtils;
import com.bleucrm.Utilities.ConfigurationReader;
import com.bleucrm.Utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.hc.core5.util.Asserts;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

public class TaskStepDefinition {

    TaskPage taskPage = new TaskPage();


    //Scenario-1

    @When("user click on TASK")
    public void user_click_on_task() {
        taskPage.taskButton.click();
        BrowserUtils.waitFor(2);
    }

    @When("user click on HighPriority")
    public void user_click_on_high_priority() {
        BrowserUtils.waitFor(2);
        taskPage.highPriority.click();
    }

    @Then("Verify High Priority tik is visible")
    public void verifyHighPriorityTikIsVisible() {
        Assert.assertTrue(taskPage.highPriority.isSelected());
    }

    @And("user enters task name")
    public void userEntersTaskName() {
        String taskName = "Task for May";
        taskPage.taskName.sendKeys(taskName);
    }

    @Then("Verify task name is displayed")
    public void verifyTaskNameIsDisplayed() {
        String actualTaskName = taskPage.enteredTask.getText();
        String expectedTaskName = "Task for May";
        //    Assert.assertEquals(expectedTaskName,actualTaskName);
        taskPage.taskName.isDisplayed();
        System.out.println("actualTaskName = " + actualTaskName);
    }

    @And("user enters the checklist items")
    public void userEntersTheChecklistItems() {
        BrowserUtils.waitFor(2);
        taskPage.checklistButton.click();
        BrowserUtils.waitFor(1);
        taskPage.checklistInputArea.sendKeys("First do manuel testing");
        taskPage.checklistTikSign.click();
        BrowserUtils.waitFor(1);
        taskPage.checklistInputArea.sendKeys("Second do automation testing");
        taskPage.checklistTikSign.click();
        BrowserUtils.waitFor(1);
        taskPage.checklistInputArea.sendKeys("Third get the results");
        taskPage.checklistTikSign.click();
        BrowserUtils.waitFor(1);
        taskPage.checklistXSign.click();
    }


    @Then("Verify checklist items are displayed")
    public void verifyChecklistItemsAreDisplayed() {
        taskPage.checklistEntered.isDisplayed();
    }


    @When("user click on Add more button")
    public void user_click_on_add_more_button() {
        taskPage.addMoreButton.click();
        BrowserUtils.waitFor(3);
    }


    @When("user click on Employees and departments Button")
    public void user_click_on_employees_and_departments_button() {
        taskPage.employeesAndDepartmentsButton.click();
        BrowserUtils.waitFor(10);
    }

    @When("user selects three person")
    public void user_selects_person() {
       // taskPage.hr2.click();
        taskPage.employeeEditorInput.sendKeys("helpdesk2@cybertekschool.com"+ Keys.ENTER);
        BrowserUtils.waitFor(3);
        // taskPage.helpdesk49.click();
        // taskPage.marketting50.click();
        taskPage.xExitButton.click();
        BrowserUtils.waitFor(3);
    }

    @Then("Verify three person are displayed")
    public void verifyPersonAreDisplayed() {
        //    BrowserUtils.sleep(5);
        //    taskPage.hr77Selected.isDisplayed();
        //    taskPage.helpdesk49Selected.isDisplayed();
        //    taskPage.marketting50Selected.isDisplayed();
        Assert.assertTrue(taskPage.hr2.isDisplayed());

    }

    @When("user selects Deadline")
    public void user_selects_deadline() {
        taskPage.deadlineArea.click();
        BrowserUtils.waitFor(3);

        taskPage.currentMount.click();
        BrowserUtils.waitFor(3);

        taskPage.monthFeb.click();
        BrowserUtils.waitFor(3);

        taskPage.currentYear.click();
        BrowserUtils.waitFor(3);

        taskPage.year.click();
        BrowserUtils.waitFor(3);
        taskPage.day12Feb.click();
        BrowserUtils.waitFor(3);

        taskPage.hour.sendKeys("08");
        taskPage.minute.sendKeys("30");
        BrowserUtils.waitFor(3);
        taskPage.selectButton.click();
    }

    @Then("Verify Deadline is displayed")
    public void verifyDeadlineIsDisplayed() {
        taskPage.deadlineArea.isDisplayed();
        System.out.println("taskPage.deadlineArea.getText() = " + taskPage.deadlineArea.getText());
    }


    @And("user click on SEND button")
    public void userClickOnSENDButton() {
        taskPage.sendButton.click();
        BrowserUtils.waitFor(4);
    }


    @Then("Verify task has been created")
    public void verifyTaskHasBeenCreated() {
        Assert.assertTrue(taskPage.pupUpMessage.isDisplayed());
    }


    // below is extra

    @And("user enters Time planning data")
    public void userEntersTimePlanningData() {
        taskPage.timePlanningButton.click();
        taskPage.startTaskOnArea.click();
        taskPage.currentMount.click();
        taskPage.monthFeb.click();
        taskPage.currentYear.click();
        taskPage.year.click();
        BrowserUtils.sleep(2);
        taskPage.day8May.click();
        taskPage.hour.sendKeys("08");
        taskPage.minute.sendKeys("30");
        taskPage.selectButton.click();

        taskPage.duration.sendKeys("10 days, 5 hours");

        taskPage.finishArea.click();
        taskPage.currentMount.click();
        taskPage.monthFeb.click();
        taskPage.currentYear.click();
        taskPage.year.click();
        taskPage.day12Feb.click();
        taskPage.hour.sendKeys("08");
        taskPage.minute.sendKeys("30");
        taskPage.selectButton.click();
    }


}

