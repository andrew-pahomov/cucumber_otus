package ru.otus.support;

import io.cucumber.guice.ScenarioScoped;
import org.openqa.selenium.WebDriver;
import ru.otus.driver.WebDriverFactory;

@ScenarioScoped
public class GuiceScoped {
    public WebDriver driver = new WebDriverFactory().newDriver();
}
