package ru.otus.steps.common;

import com.google.inject.Inject;
import io.cucumber.java.ru.Пусть;
import ru.otus.pages.MainPage;

public class CommonSteps {

    @Inject
    private MainPage mainPage;

    @Пусть("Открыта главная страница в браузере")
    public void openPage() {
        mainPage.open();
    }

}
