package com.swagLabs.pages;

import com.swagLabs.utils.BrowserActions;
import com.swagLabs.utils.ElementActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class loginPage {

    //locators
    private final WebDriver driver;
    private final By username = By.id("user-name");
    private final By password = By.id("password");
    private final By loginButton = By.id("login-button");
    private final By errorMessage= By.cssSelector("[data-test=\"error\"]");

    //constructor
    public loginPage(WebDriver driver){
        this.driver= driver;
    }


    //actions

    // Navigate to login page
    public void navigateToLoginPage()
    {
        BrowserActions.navigateToURL(driver,"https://www.saucedemo.com/");
    }

    public loginPage enterUsername(String username)
    {
        ElementActions.sendData(driver,this.username,username);
        return this;
    }

    public loginPage enterPassword(String pass)
    {
        ElementActions.sendData(driver,this.password,pass);
        return this;

    }

    public loginPage clickOnLoginButton()
    {
        ElementActions.clickOn(driver,this.loginButton);
        return this;
    }

    public String getErrorMessage()
    {
        return ElementActions.getText(driver, errorMessage);
    }

    //validations

    public loginPage assertSuccess()
    {
        Assert.assertEquals(BrowserActions.getCurrentURL(driver)
                ,"https://www.saucedemo.com/inventory.html");
        return this;
    }

    public loginPage assertUnSuccess()
    {
        Assert.assertEquals(getErrorMessage()
                ,"Epic sadface: Username and password do not match any user in this service");
        return this;
    }
}
