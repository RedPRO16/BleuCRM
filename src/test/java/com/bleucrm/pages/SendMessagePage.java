package com.bleucrm.pages;

import com.bleucrm.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SendMessagePage {
    public SendMessagePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[@id=\"bx-html-editor-iframe-cnt-idPostFormLHE_blogPostForm\"]/iframe")
    public WebElement iframe;

    @FindBy(xpath = "//body[@style='min-height: 184px;']")
    public WebElement inputMessage;

    @FindBy(xpath = "//span[text()='All employees']")
    public WebElement allEmployees;

    @FindBy(xpath = "//*[@id='blog-submit-button-save']")
    public WebElement sendButton;

    @FindBy(xpath = "//button[@id='blog-submit-button-cancel']")
    public WebElement cancelButton;

    @FindBy(xpath = "//*[@id='bx-destination-tag']")
    public WebElement AddMoreBtn;

    @FindBy(xpath = "//span[text()='Message']")
    public WebElement messageButton;

}
