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

}
