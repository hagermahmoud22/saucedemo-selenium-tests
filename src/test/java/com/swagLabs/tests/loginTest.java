package com.swagLabs.tests;

import com.swagLabs.pages.loginPage;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class loginTest {

    //variables
    private WebDriver driver;

    //Tests
    @Test
    public void successfulLogin()
    {
        new loginPage(driver).enterUsername("standard_user")
                .enterPassword("secret_sauce")
                .clickOnLoginButton()
                .assertSuccess();
    }

    @Test
    public void unSuccessfulLogin()
    {
        new loginPage(driver).enterUsername("stan_user")
                .enterPassword("secreuce")
                .clickOnLoginButton()
                .assertUnSuccess();
    }

    //configuration

    @BeforeMethod
    public void setUp()
    {
        EdgeOptions options = new EdgeOptions();
        options.addArguments("start-maximized");
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        driver = new EdgeDriver(options);
        new loginPage(driver).navigateToLoginPage();
    }

    @AfterMethod
    public void tearDown()
    {
        driver.quit();
    }
}
