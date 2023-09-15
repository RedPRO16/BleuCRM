package com.bleucrm.StepDefinitions;


import com.bleucrm.Utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

/*
In this class we will be able to pass -pre and -post conditions to each scenario and step
 */
public class Hooks {

    //@Before //import from io.cucumber.java, not from junit
    public void SetUpScenario() {
        System.out.println("Setting up browser using cucumber @before");
    }

    @After
    public void tearDownScenario(Scenario scenario) {


        if (scenario.isFailed()) {
            byte[] screenShot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenShot, "image/png", scenario.getName());
        }

        Driver.closeDriver();
        //    System.out.println("Closing browser using cucumber @after");
        //    System.out.println("Scenario ended. Take screenshot if needed");
    }

    //@BeforeStep
    public void setupStep() {
        System.out.println("Applying setup using @beforeStep");
    }

    //@AfterStep
    public void afterStep() {
        System.out.println("Applying teardown using @AfterStep");
    }

}
