package ru.otus.driver;

import org.openqa.selenium.WebDriver;
import ru.otus.exceptions.BrowserNotSupported;

public interface IFactory {

    WebDriver newDriver() throws BrowserNotSupported;

}
