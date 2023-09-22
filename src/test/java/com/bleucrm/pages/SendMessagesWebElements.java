package com.bleucrm.pages;

import com.bleucrm.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SendMessagesWebElements {

    public SendMessagesWebElements(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//div[@id='microoPostFormLHE_blogPostForm_inner']")
    public WebElement sendMessagesSection;



    @FindBy(xpath = "//span[@title='Link']")
    public WebElement linkButton;

    @FindBy(xpath = "//span[@title='Insert video']")
    public WebElement insertVideoButton;

    @FindBy(xpath = "//span[@title='Quote text']")
    public WebElement quoteTextButton;

    @FindBy(xpath = "//span[@title='Add tag']")
    public WebElement addTagButton;
}
