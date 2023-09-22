package com.bleucrm.pages;

import com.bleucrm.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddMention {

    public AddMention(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//div[@id='microoPostFormLHE_blogPostForm_inner']")
    public WebElement sendMessagesSection;

    @FindBy(xpath = "//span[@title='Add mention'][1]")
    public WebElement addMentionButton;

    @FindBy(xpath = "//a[.='Employees and departments']")
    public WebElement employeesAndDepartmentsBtn;

    @FindBy(xpath = "//div[.='hr2@cybertekschool.com']")
    public WebElement employee1;

    @FindBy(xpath = "//a[.='Add more']")
    public WebElement addMoreBtn;

    @FindBy(xpath = "//div[.='helpdesk22@cybertekschool.com']")
    public WebElement employee2;

    @FindBy(xpath = "//div[@id='feed-add-post-destination-container']//span[.='hr2@cybertekschool.com']")
    public WebElement employee1Verification;

    @FindBy(xpath = "//div[@id='feed-add-post-destination-container']//span[.='helpdesk22@cybertekschool.com']")
    public WebElement employee2Verification;

}
