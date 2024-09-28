package com.otus.steps.pages;

import com.google.inject.Inject;
import com.otus.pages.CatalogPage;
import io.cucumber.java.ru.Тогда;

public class CatalogPageSteps {

    @Inject
    public CatalogPage catalogPage;

    @Тогда("^Откроется страница Каталог$")
    public void catalogPageShouldBeOpened() {
        catalogPage.checkPageVisibility();
    }

    @Тогда("^Чекбокс номер (\\d+) будет (Отмечен|Не отмечен)$")
    public void checkCheckBoxInput(int index, String isChecked) {
        catalogPage.checkCheckBoxInput(index, isChecked.equals("Отмечен"));
    }

}
