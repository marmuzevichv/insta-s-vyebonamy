package com.insta.pages;

import com.insta.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class InstaLoginPage {
    public InstaLoginPage (){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//input[@name='username']")
    public WebElement UserNameInput;

    @FindBy (xpath = "//input[@name='password']")
    public WebElement UserNamePassword;

    @FindBy(xpath = "//div/button[@type='submit']")
    public WebElement LogInButtonClick;

    @FindBy(xpath = "(//div/button)[2]")
    public WebElement NotNow;

    @FindBy(xpath = "//button[.='Not Now']")
    public WebElement NotificationTurnOf;

    @FindBy(xpath = "(//div[@class='_9AhH0'])[1]")
    public WebElement firstpost;

    @FindBy(xpath = "/html/body/div[5]/div[2]/div/article/div[3]/section[1]/span[1]/button/div")
    public WebElement like;

    @FindBy(xpath = "(//*[@aria-label='Like'])[1]")
    public WebElement commentlike;

    @FindBy(xpath = "//div[@class='QBdPU ']")
    public List<WebElement> listOfComment;

    //div[@class='QBdPU ']
    //div//ul[@class='Mr508 ']


}
