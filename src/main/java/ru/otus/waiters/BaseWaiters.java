package ru.otus.waiters;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BaseWaiters {
    private final WebDriver driver;

    public BaseWaiters(WebDriver driver) {
        this.driver = driver;
    }

    public boolean waitForCondition(ExpectedCondition condition, long timeToWait) {
        WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(timeToWait));
        try {
            webDriverWait.until(condition);
            return true;
        } catch (Exception ignored) {
            return false;
        }
    }

}
