package com.insta.utilities;

import io.cucumber.java.Scenario;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {
    @Before
    public void getInsta(){
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }




    @After
    public void tearDownScenario(Scenario scenario){
        //if my scenario failed
        // go and take screen shot

        if (scenario.isFailed()) {
            byte[] screenShot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenShot, "image/png", scenario.getName());
        }
        Driver.closeDriver();
    }
    @After
    public void tearDown(){

        Driver.closeDriver();


    }
}
