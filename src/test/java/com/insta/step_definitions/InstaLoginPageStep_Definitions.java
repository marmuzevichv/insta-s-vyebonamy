package com.insta.step_definitions;

import com.insta.pages.InstaLoginPage;
import com.insta.utilities.BrowserUtils;
import com.insta.utilities.ConfigurationReader;
import com.insta.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebElement;

import java.util.List;

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

        BrowserUtils.waitFor(2);
        instaLoginPage.firstpost.click();
        BrowserUtils.waitFor(2);
        instaLoginPage.like.click();
        BrowserUtils.waitFor(3);

        //list of comments
        List<WebElement> myComments = instaLoginPage.listOfComment;
        for (WebElement eachcomment : myComments) {
            try {
            BrowserUtils.scrollToElement(eachcomment);
                BrowserUtils.waitFor(2);
                eachcomment.click();
            } catch (ElementClickInterceptedException e) {
                e.printStackTrace();
            }
        }

    }
    @When("user redirects to the fanpage")
    public void user_redirects_to_the_fanpage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("fanpage"));
        BrowserUtils.waitFor(2);
    }

    @Then("user should click on the second post")
    public void user_should_click_on_the_second_post() {


    }
    @Then("user should like the post")
    public void user_should_like_the_post() {


    }
    @Then("user should like all the coomments bellow the post")
    public void user_should_like_all_the_coomments_bellow_the_post() {


    }
    @Then("user should click on the third post")
    public void user_should_click_on_the_third_post() {


    }
    @Then("user should click on the fourth post")
    public void user_should_click_on_the_fourth_post() {

    }
    @Then("user should click on the fifth post")
    public void user_should_click_on_the_fifth_post() {

    }
    @Then("user should click on the sixth post")
    public void user_should_click_on_the_sixth_post() {

    }

    @When("user redirects to the fanpage")
    public void user_redirects_to_the_fanpage() {

    }


    @Then("user should click on the second post")
    public void user_should_click_on_the_second_post() {

    }
    @Then("user should like the post")
    public void user_should_like_the_post() {

    }
    @Then("user should like all the coomments bellow the post")
    public void user_should_like_all_the_coomments_bellow_the_post() {

    }
    @Then("user should click on the third post")
    public void user_should_click_on_the_third_post() {

    }
    @Then("user should click on the fourth post")
    public void user_should_click_on_the_fourth_post() {
    }
    @Then("user should click on the fifth post")
    public void user_should_click_on_the_fifth_post() {


    }
    @Then("user should click on the sixth post")
    public void user_should_click_on_the_sixth_post() {


    }

}
