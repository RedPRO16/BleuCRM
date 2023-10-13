package com.bleucrm.pages;

import com.bleucrm.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InsertVideosPage {

    public InsertVideosPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//span[@title='Insert video']")
    public WebElement insertVideoButton;

    @FindBy(xpath = "//input[@placeholder='YouTube or Vimeo video URL']")
    public WebElement videoSourceBar;

    @FindBy(xpath = "//span[@class='bxhtmled-video-error']")
    public WebElement videoPreviewSection;

    @FindBy(xpath = "//input[@value='Cancel']")
    public WebElement cancelButton;

}
