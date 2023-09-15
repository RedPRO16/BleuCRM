package com.bleucrm.pages;

import com.bleucrm.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//input[@type='text']")
    public WebElement userName;

    @FindBy(xpath = "//input[@type='password']")
    public WebElement password;

    @FindBy(xpath = "//*[@id='USER_REMEMBER']")
    public WebElement rememberMe;

    @FindBy(xpath = "//input[@type='submit']")
    public WebElement loginButton;

    @FindBy(xpath = "//a[@href='/?forgot_password=yes']")
    public WebElement linkForgotYourPassword;

    @FindBy(xpath = "//*[@id='pagetitle']")
    public WebElement ActivityStream;

    @FindBy(xpath = "//div[@class='errortext']")
    public WebElement incorrectLoginOrPassword;

}
