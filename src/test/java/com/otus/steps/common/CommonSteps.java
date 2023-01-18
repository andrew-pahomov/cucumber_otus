package com.otus.steps.common;

import com.google.inject.Inject;
import com.otus.driver.WebDriverFactory;
import com.otus.exceptions.BrowserNotSupported;
import com.otus.pages.MainPage;
import com.otus.support.GuiceScoped;
import io.cucumber.java.ru.Пусть;

public class CommonSteps {
//
//  @Inject
//  private GuiceScoped guiceScoped;
//  @Inject
//  private WebDriverFactory webDriverFactory;
  @Inject
  private MainPage mainPage;

  @Пусть("Открыта главная страница в браузере")
  public void openPage() {
//    guiceScoped.driver = webDriverFactory.newDriver();

    mainPage.open();
  }

}
