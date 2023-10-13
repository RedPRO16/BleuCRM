package com.bleucrm.pages;

import com.bleucrm.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddMentionPage {

    public AddMentionPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//div[@id='microoPostFormLHE_blogPostForm_inner']")
    public WebElement sendMessagesSection;

    @FindBy(xpath = "//span[@title='Add mention'][1]")
    public WebElement addMentionButton;

    @FindBy(xpath = "//a[.='Employees and departments']")
    public WebElement employeesAndDepartmentsBtn;

    @FindBy(xpath = "//div[.='hr1@cybertekschool.com']")
    public WebElement employee1;

    @FindBy(xpath = "//a[.='Add more']")
    public WebElement addMoreBtn;

    @FindBy(xpath = "//div[.='helpdesk1@cybertekschool.com']")
    public WebElement employee2;

    @FindBy(xpath = "//div[@id='feed-add-post-destination-container']//span[.='hr1@cybertekschool.com']")
    public WebElement employee1Verification;

    @FindBy(xpath = "//div[@id='feed-add-post-destination-container']//span[.='helpdesk1@cybertekschool.com']")
    public WebElement employee2Verification;

}



