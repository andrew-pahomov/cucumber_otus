package com.otus.steps.pages;

import com.google.inject.Inject;
import com.otus.pages.MainPage;
import io.cucumber.java.ru.Пусть;

public class MainPageSteps {
    @Inject
    private MainPage mainPage;

    @Пусть("Открыть форму выбора курсов")
    public void educationFormButtonClick() {
        mainPage.educationFormButtonClick();
    }

}
