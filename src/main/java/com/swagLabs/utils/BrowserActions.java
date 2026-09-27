package com.swagLabs.utils;

import org.openqa.selenium.WebDriver;

public class BrowserActions {

    private BrowserActions(){}

    public static void navigateToURL(WebDriver driver, String url)
    {
        driver.get(url);
    }

    //get current url
    public static String getCurrentURL(WebDriver driver)
    {
        return driver.getCurrentUrl();
    }

}
