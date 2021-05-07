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

    @FindBy(xpath = "(//div[@class='_9AhH0'])[3]") // --- [1] вот это значит что это элемент 1, поменяешь его на 2-3 будет другой пост открывать
    public WebElement firstpost;

    // this code is shit. У тебя класс называется инстаграм логин пейдж а отсюда и ниже это принадлежит другой странице. сделай другой класс
    @FindBy(xpath = "(//div[@class='QBdPU '])[3]")
    public WebElement like;

    @FindBy(xpath = "//div//ul[@class='Mr508 ']//button[@class='wpO6b ZQScA ']")
    public List<WebElement> listOfComment;








    //div[@class='QBdPU ']
    //div//ul[@class='Mr508 ']

    ///html/body/div[5]/div[2]/div/article/div[3]/section[1]/span[1]/button/div

    //div//ul[@class='Mr508 ']//button[@class='wpO6b ZQScA ']


}
