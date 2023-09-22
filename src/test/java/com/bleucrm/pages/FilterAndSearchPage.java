package com.bleucrm.pages;

import com.bleucrm.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FilterAndSearchPage {

    public FilterAndSearchPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//input[@type='text']")
    public WebElement userName;

    @FindBy(xpath = "//input[@type='password']")
    public WebElement password;

    @FindBy(xpath = "//input[@type='submit']")
    public WebElement loginButton;

    @FindBy(xpath = "//*[@id='pagetitle']")
    public WebElement ActivityStream;

    @FindBy(xpath = "//*[@id='LIVEFEED_search']")
    public WebElement filterAndSearch;

    @FindBy(xpath = "//div[@data-id='work']")
    public WebElement workFilter;

    @FindBy(xpath = "//span[.='Favorites']")
    public WebElement favoritesFilter;

    @FindBy(xpath = "//span[.='My Activity']")
    public WebElement myActivityFilter;

    @FindBy(xpath = "//span[.='Announcements']")
    public WebElement announcementsFilter;

    @FindBy(xpath = "//span[.='Workflows']")
    public WebElement workFlowsFilter;

    @FindBy(xpath = "//span[@class='main-ui-filter-field-add-item']")
    public WebElement addFieldButton;

    @FindBy(xpath = "//div[contains(@data-item, '7')]")
    public WebElement dateField;

    @FindBy(xpath = "//div[@data-id='field_EVENT_ID']")
    public WebElement typeField;

    @FindBy(xpath = "//div[@data-id='field_CREATED_BY_ID']")
    public WebElement authorField;

    @FindBy(xpath = "//div[@data-id='field_TO']")
    public WebElement toField;

    @FindBy(xpath = "//div[@data-name='FAVORITES_USER_ID']")
    public WebElement favoritesField;

    @FindBy(xpath = "//div[@data-name='TAG']")
    public WebElement tagField;

    @FindBy(xpath = "//div[@data-name='EXTRANET']")
    public WebElement FieldExtranet;

    @FindBy(xpath = "//div[@data-name='DATE_CREATE_datesel']")
    public WebElement dateCreate;


    @FindBy(xpath = "(//div[.='Yesterday'])[2]")
    public WebElement yesterday;


    @FindBy(xpath = "//button[contains(@class, 'ui-btn-icon-search')]")
    public WebElement searchButton;


    @FindBy(xpath = "//div[@class=\"main-ui-control main-ui-multi-select\"]")
    public WebElement typeInputBox;

    @FindBy(xpath = "//div[.='Posts']")
    public WebElement posts;

    @FindBy(xpath = "//div[@class='main-ui-select-inner-label'][normalize-space()='Announcements']")
    public WebElement announcements;

    @FindBy(xpath = "//span[contains(@class, 'restore')]")
    public WebElement restoreDefaultFields;

    @FindBy(xpath = "//div[@class='main-ui-control-value-delete-item']")
    public WebElement deleteTypes;

    @FindBy(xpath = "//span[@class='main-ui-filter-add-item']")
    public WebElement saveFilter;

    @FindBy(xpath = "//input[contains(@class, 'edit')]")
    public WebElement filterNameInput;

    @FindBy(xpath = "//span[contains(@class, 'ui-btn-success')]")
    public WebElement saveButton;

    @FindBy(css="div[class='main-ui-filter-sidebar-item main-ui-filter-current-item'] span[class='main-ui-filter-sidebar-item-text']")
    public WebElement filterNameDisplay;





   
    
    


}
