package com.bleucrm.StepDefinitions;

import com.bleucrm.Utilities.ConfigurationReader;
import com.bleucrm.Utilities.Driver;
import com.bleucrm.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDefinitions {

    LoginPage loginPage = new LoginPage();


    @Given("user is on the login page")
    public void userIsOnTheLoginPage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("login.page.url"));
    }


    @When("user enters the HR username")
    public void userEntersTheHRUsername() {
        loginPage.userName.sendKeys(ConfigurationReader.getProperty("HR.username"));
    }

    @And("user enters the HR password")
    public void userEntersTheHRPassword() {
        loginPage.password.sendKeys(ConfigurationReader.getProperty("HR.password"));
    }

    @And("user clicks on the login button")
    public void userClicksOnTheLoginButton() {
        loginPage.loginButton.click();
    }

    @Then("user lands on the main page")
    public void userLandsOnTheMainPage() {
        Assert.assertTrue(loginPage.ActivityStream.isDisplayed());
    }

    @When("user enters the Marketing username")
    public void userEntersTheMarketingUsername() {
        loginPage.userName.sendKeys(ConfigurationReader.getProperty("Marketing.username"));
    }

    @And("user enters the Marketing password")
    public void userEntersTheMarketingPassword() {
        loginPage.password.sendKeys(ConfigurationReader.getProperty("Marketing.password"));
    }

    @When("user enters the Helpdesk username")
    public void userEntersTheHelpdeskUsername() {
        loginPage.userName.sendKeys(ConfigurationReader.getProperty("Helpdesk.username"));
    }

    @And("user enters the Helpdesk password")
    public void userEntersTheHelpdeskPassword() {
        loginPage.password.sendKeys(ConfigurationReader.getProperty("Helpdesk.password"));
    }

    @When("user enters the invalid username")
    public void userEntersTheInvalidUsername() {
        loginPage.userName.sendKeys(ConfigurationReader.getProperty("invalid.username"));
    }

    @And("user enters the valid password")
    public void userEntersTheValidPassword() {
        loginPage.password.sendKeys(ConfigurationReader.getProperty("Marketing.password"));
    }

    @Then("user can see incorrect username or password text")
    public void userCanSeeIncorrectUsernameOrPasswordText() {
        String actualErrorMessage = loginPage.incorrectLoginOrPassword.getText();
        String expectedErrorMessage = ConfigurationReader.getProperty("expected.error.message.without.username.or.password");
        Assert.assertEquals(expectedErrorMessage, actualErrorMessage);

    }

    @When("user enters the valid username")
    public void userEntersTheValidUsername() {
        loginPage.userName.sendKeys(ConfigurationReader.getProperty("Marketing.username"));
    }

    @And("user enters the invalid password")
    public void userEntersTheInvalidPassword() {
        loginPage.password.sendKeys(ConfigurationReader.getProperty("invalid.password"));
    }

    @And("user do not enter the password")
    public void userDoNotEnterThePassword() {

    }

    @Then("user can see Please fill out this field message")
    public void userCanSeePleaseFillOutThisFieldMessage() {
        String actualErrorMessage = loginPage.incorrectLoginOrPassword.getText();
        Assert.assertEquals(ConfigurationReader.getProperty("expected.error.message.2"), actualErrorMessage);

    }

    @When("user checks Forgot password link is visible")
    public void userChecksForgotPasswordLinkIsVisible() {
        Assert.assertTrue(loginPage.linkForgotYourPassword.isDisplayed());
    }

    @Then("user clicks on the link and verifies the link is clickable")
    public void userClicksOnTheLinkAndVerifiesTheLinkIsClickable() {
        loginPage.linkForgotYourPassword.click();
    }

    @When("user checks Remember Me button is visible")
    public void userChecksRememberMeButtonIsVisible() {
        Assert.assertTrue(loginPage.rememberMe.isDisplayed());
    }

    @Then("user clicks on the link and verifies the button is clickable")
    public void userClicksOnTheLinkAndVerifiesTheButtonIsClickable() {
        loginPage.rememberMe.click();
        Assert.assertTrue(loginPage.rememberMe.isSelected());
    }

    @Then("user can see the password is in bullet sign")
    public void userCanSeeThePasswordIsInBulletSign() {
        String passwordInputType = loginPage.password.getAttribute("type");
        Assert.assertEquals("password",passwordInputType);
    }
}
