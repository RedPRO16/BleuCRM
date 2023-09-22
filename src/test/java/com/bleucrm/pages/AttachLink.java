package com.bleucrm.pages;

import com.bleucrm.Utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AttachLink {

    public AttachLink(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    //String linkText = "John Wick is GOAT :)";

    //String linkURL = "https://makeagif.com/i/H-aTJj";

    @FindBy(xpath = "//span[@class='bxhtmled-top-bar-btn bxhtmled-button-link']")
    public WebElement linkButton;

    @FindBy(xpath = "//input[@placeholder='Link text']")  //Text is: John Wick is GOAT :)
    public WebElement linkTextButton;

    @FindBy(xpath = "//input[@placeholder='Link URL']")   //link: https://makeagif.com/i/H-aTJj
    public WebElement linkURLButton;

    @FindBy(xpath = "//input[@class='adm-btn-save']")
    public WebElement saveButton;

    //String locator = "//a[@href='" +linkURL+ "']";
    //tagName[contains(@attribute, 'value')]
    @FindBy(xpath = "//a[.='John Wick is GOAT :)']")
    public WebElement givenLink;

    @FindBy(xpath = "(//span[.='Remove link'])[22]")
    public WebElement removeLinkButton;

    @FindBy(xpath ="//a[.='John Wick is GOAT :)']")
    public WebElement verifyLink;

}
