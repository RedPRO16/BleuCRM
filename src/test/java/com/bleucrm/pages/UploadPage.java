package com.bleucrm.pages;

import com.bleucrm.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UploadPage {

    public UploadPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(id = "feed-add-post-form-tab-message")
    public WebElement messageButton;
    @FindBy(id = "microoPostFormLHE_blogPostForm")
    public WebElement sendBox;
    @FindBy(xpath="//span[@id='bx-b-uploadfile-blogPostForm']" )
    public WebElement uploadButton;
    @FindBy(xpath = "//input[@name='bxu_files[]']")
    public WebElement uploadfileandpicturesButton;

    @FindBy(css = "div[class='feed-com-files-title']")
    public WebElement files;
    @FindBy(xpath = "//button[@id='blog-submit-button-save']")
    public WebElement sendButton;


}
