package com.otus.waiters;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;


public class BaseWaiters {

    private final WebDriver driver;

    public BaseWaiters(WebDriver driver) {
        this.driver = driver;
    }

    public boolean waitForCondition(ExpectedCondition condition, int timeToWait) {
        WebDriverWait webDriverWait = new WebDriverWait(driver, timeToWait);
        try {
            webDriverWait.until(condition);
            return true;
        } catch (Exception ignored) {
            return false;
        }
    }

}
