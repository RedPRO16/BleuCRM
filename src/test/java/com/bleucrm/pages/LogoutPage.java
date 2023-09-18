package com.bleucrm.pages;

import com.bleucrm.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage {

    public LogoutPage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(id = "user-block")
    public WebElement profilePicture;

    @FindBy(xpath = "//span[text()='Log out']")
    public WebElement logOutButton;

    @FindBy(className = "login-btn")
    public WebElement logInButton;






}
