package com.swagLabs.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ElementActions {
    private ElementActions(){}

    // send data
    public static void sendData(WebDriver driver, By locator, String data){

        //wait - scroll - find - sendData

        Waits.waitForElementVisible(driver, locator);
        Scroll.scrollToElement(driver, locator);
        driver.findElement(locator).sendKeys(data);
    }

    // click
    public static void clickOn(WebDriver driver, By locator){

        //wait - scroll - find - click

        Waits.waitForElementClickable(driver, locator);
        Scroll.scrollToElement(driver, locator);
        driver.findElement(locator).click();
    }

    // get text
    public static String getText(WebDriver driver, By locator){

        //wait - scroll - find - get

        Waits.waitForElementVisible(driver, locator);
        Scroll.scrollToElement(driver, locator);
        return driver.findElement(locator).getText();
    }
}
