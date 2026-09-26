package com.swagLabs.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Scroll {
    private Scroll(){}

    // scroll to element
    public static void scrollToElement (WebDriver driver, By locator)
    {
        ((JavascriptExecutor)driver).
                executeScript("arguments[0].scrollIntoView;",driver.findElement(locator));
    }
}
