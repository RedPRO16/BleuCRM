package com.bleucrm.pages;

import com.bleucrm.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddTags {

    public AddTags(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//span[@title='Add tag']")
    public WebElement addTagButton;

    @FindBy(xpath = "//input[@name='TAGS_blogPostForm']")
    public WebElement tagSection;

    @FindBy(xpath = "//span[@class='popup-window-button']")
    public WebElement addButton;

    @FindBy(xpath = "//span[@class='feed-add-post-tags']//span[@class='feed-add-post-del-but']")
    public WebElement deleteButton;

    @FindBy(xpath = "//div[@class='feed-add-post-tags-wrap']")
    public WebElement verify;
}
