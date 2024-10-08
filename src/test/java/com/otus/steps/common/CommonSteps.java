package com.otus.steps.common;

import com.google.inject.Inject;
import com.otus.pages.MainPage;
import io.cucumber.java.ru.Пусть;

public class CommonSteps {

    @Inject
    private MainPage mainPage;

    @Пусть("Открыта главная страница в браузере")
    public void openPage() {
        mainPage.open();
    }

}
