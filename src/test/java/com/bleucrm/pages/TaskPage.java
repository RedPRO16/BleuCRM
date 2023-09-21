package com.bleucrm.pages;

import com.bleucrm.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskPage {

    public TaskPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//input[contains(@id,'name-selector-')]")
    public WebElement employeeEditorInput;

    // login
    @FindBy(xpath = "//input[@type='text']")
    public WebElement usernameBox;

    @FindBy(xpath = "//input[@type='password']")
    public WebElement passwordBox;

    @FindBy(xpath = "//input[@type='submit']")
    public WebElement loginButton;

    public void Login() {
        usernameBox.sendKeys("hr4@cybertekschool.com");
        passwordBox.sendKeys("UserUser");
        loginButton.click();
    }
    //Scenario-1
    @FindBy(css = "span[id='feed-add-post-form-tab-tasks']")
    public WebElement taskButton;

    @FindBy(xpath = "//input[@data-bx-id='task-edit-title']")
    public WebElement taskName;

    @FindBy(xpath = "//input[@data-bx-id='task-edit-title']")
    public WebElement enteredTask;

    @FindBy(xpath = "//div[@class='task-info-panel-important']/input[1]")
    public WebElement highPriority;

    @FindBy(xpath = "//*[@id=\"bx-component-scope-lifefeed_task_form-responsible\"]/span[2]/a[1]")
    public WebElement addMoreButton;

    @FindBy(xpath = "//a[contains(@id,'destDepartmentTab_')]")
    public WebElement employeesAndDepartmentsButton;

    @FindBy(xpath = "//a[contains(.,'helpdesk2@')]")
    public  WebElement hr2;

    @FindBy(xpath = "//span[@data-item-value='U769']/a")
    public WebElement hr77Selected;

    @FindBy(xpath = "(//div[@id='bx-lm-category-relation-129']//a)[55]")
    public  WebElement helpdesk49;

    @FindBy(xpath = "//span[@data-item-value='U539']/a")
    public WebElement helpdesk49Selected;

    @FindBy(xpath = "(//div[@id='bx-lm-category-relation-129']//a)[155]")
    public  WebElement marketting50;

    @FindBy(xpath = "//span[@data-item-value='U641']/a")
    public WebElement marketting50Selected;

    @FindBy(xpath = "//span[@class='popup-window-close-icon']")
    public WebElement xExitButton;

    @FindBy(xpath = "(//input[@data-bx-id='datepicker-display'])[1]")
    public WebElement deadlineArea;

    @FindBy(xpath = "//span[@class='bx-calendar-header-content']/a[1]")
    public WebElement currentMount;

    @FindBy(xpath = "//span[text()='February']")
    public WebElement monthFeb;

    @FindBy(xpath = "//span[@class='bx-calendar-header-content']/a[2]")
    public WebElement currentYear;

    @FindBy(xpath = "//span[@data-bx-year='2024']")
    public WebElement year;

    @FindBy(xpath = "//div[@class='bx-calendar-layer']/div[3]/a[2]")
    public WebElement day12Feb;

    @FindBy(xpath = "(//input[@class='bx-calendar-form-input'])[1]")
    public WebElement hour;

    @FindBy(xpath = "(//input[@class='bx-calendar-form-input'])[2]")
    public WebElement minute;

    @FindBy(xpath = "//span[.='Select']")
    public WebElement selectButton;

    @FindBy(css = "button[id='blog-submit-button-save']" )
    public  WebElement sendButton;

    @FindBy(xpath = "//span[@class='tasks-task-mpf-link']")
    public WebElement checklistButton;

    @FindBy(xpath = "//input[@class='js-id-checklist-is-form-title task-checklist-field-add']")
    public  WebElement checklistInputArea;

    @FindBy(xpath = "//span[@class='js-id-checklist-is-open-form task-dashed-link-inner']")
    public  WebElement checklistTikSign;

    @FindBy(xpath = "//span[@class='js-id-checklist-is-form-close tasks-btn-delete task-field-title-del']")
    public  WebElement checklistXSign;

    @FindBy(xpath = "(//div[@id='bx-component-scope-lifefeed_task_form-checklist']/div)[2]")
    public WebElement checklistEntered;


    @FindBy(xpath = "//div[text()='Task has been created']")
    public WebElement pupUpMessage;  // the whole window







    // extra

    @FindBy(xpath = "((//div[@class='task-options-item-more']/span)[2]/span)[1]")
    public WebElement timePlanningButton;

    @FindBy(xpath = "(//input[@data-bx-id='datepicker-display'])[2]")
    public WebElement startTaskOnArea;

    @FindBy(xpath = "((//div[@class='bx-calendar-range'])[2]//a)[2]")
    public WebElement day8May;

    @FindBy(xpath = "//input[@data-bx-id='dateplanmanager-duration']")
    public WebElement duration;

    @FindBy(xpath = "(//input[@data-bx-id='datepicker-display'])[3]")
    public WebElement finishArea;








}
