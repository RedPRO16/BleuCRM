package com.bleucrm.pages;

import com.bleucrm.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddQuotesPage {

    public AddQuotesPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//span[@title='Quote text']")
    public WebElement quotesButton;

    @FindBy(xpath = "//html[1]//body[@contenteditable='true']")
    public WebElement blockQuotes;

    @FindBy(xpath = "//blockquote[text()='Good intention put the owner into the heaven.']")
    public WebElement verifyQuotes;
}
