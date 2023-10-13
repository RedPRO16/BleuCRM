package com.bleucrm.StepDefinitions;

import com.bleucrm.Utilities.BrowserUtils;
import com.bleucrm.Utilities.Driver;
import com.bleucrm.pages.LogoutPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LogoutStepDefinations {

LogoutPage logoutPage = new LogoutPage();
    @When("User clicks on profile picture on top right")
    public void user_clicks_on_profile_picture_on_top_right() {
        logoutPage.profilePicture.click();
        BrowserUtils.waitFor(2);

    }
    @Then("User cliks on Log Out button")
    public void user_cliks_on_log_out_button() {
        logoutPage.logOutButton.click();

    }

    @When("User clicks back button")
    public void user_clicks_back_button() {
        Driver.getDriver().navigate().back();

    }
    @Then("User still in Log in page")
    public void user_still_in_log_in_page() {
        Assert.assertTrue(logoutPage.logInButton.isDisplayed());

    }


    @When("User is away from the keyboard and mouse for three minutes")
    public void user_is_away_from_the_keyboard_and_mouse_for_three_minutes() {
        BrowserUtils.waitFor(10);

    }
    @When("User represh the page")
    public void user_represh_the_page() {
        Driver.getDriver().navigate().refresh();

    }



}
