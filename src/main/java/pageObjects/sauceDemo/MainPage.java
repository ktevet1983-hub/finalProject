package pageObjects.sauceDemo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class MainPage {

    @FindBy(xpath = "//div[text()='Swag Labs']")
    public WebElement txt_pageTitel;
    @FindBy(id = "user-name")
    public WebElement txt_UserName;

    @FindBy(id = "password")
    public WebElement txt_Password;

    @FindBy(id = "login-button")
    public WebElement btn_Login;


}
