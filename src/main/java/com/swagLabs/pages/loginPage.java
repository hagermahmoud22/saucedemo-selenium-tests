package com.swagLabs.pages;

import com.swagLabs.utils.ElementActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPage {

    //locators
    private final WebDriver driver;
    private final By username = By.id("user-name");
    private final By password = By.id("password");
    private final By loginButton = By.id("login-button");

    //consructor
    public loginPage(WebDriver driver){
        this.driver= driver;
    }


    //actions >> wait - scroll - find - sendKeys

    public void enterUsername(String username)
    {
        ElementActions.sendData(driver,this.username,username);
    }

    public void enterPassword(String pass)
    {
        ElementActions.sendData(driver,this.password,pass);
    }

    public void clickOnLoginButton()
    {
        ElementActions.clickOn(driver,this.loginButton);
    }

    //validations
}
