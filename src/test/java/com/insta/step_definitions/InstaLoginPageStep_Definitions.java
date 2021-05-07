package com.insta.step_definitions;

import com.insta.pages.InstaLoginPage;
import com.insta.utilities.BrowserUtils;
import com.insta.utilities.ConfigurationReader;
import com.insta.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;

public class InstaLoginPageStep_Definitions {
    InstaLoginPage instaLoginPage = new InstaLoginPage();

    @Given("User is on the login page")
    public void user_is_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @When("user enters username {string}")
    public void user_enters_username(String string) {
        string = ConfigurationReader.getProperty("username");
        instaLoginPage.UserNameInput.sendKeys(string);

    }
    @When("user enters password {string}")
    public void user_enters_password(String string) {
        string = ConfigurationReader.getProperty("password");
        instaLoginPage.UserNamePassword.sendKeys(string);
        instaLoginPage.LogInButtonClick.click();
        BrowserUtils.waitFor(5);
        instaLoginPage.NotNow.click();
        instaLoginPage.NotificationTurnOf.click();
        Driver.getDriver().get(ConfigurationReader.getProperty("urlmuz"));
        instaLoginPage.firstpost.click();
        instaLoginPage.like.click();
        instaLoginPage.commentlike.click();
        //list of comments
        for (WebElement eachcomment:instaLoginPage.listOfComment) {
            eachcomment.click();

        }

    }
    @Then("user should see dashboard")
    public void user_should_see_dashboard() {

    }

}
