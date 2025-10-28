package ru.otus.steps.pages;

import com.google.inject.Inject;
import io.cucumber.java.ru.И;
import ru.otus.pages.CatalogPage;

public class CatalogPageSteps {

    @Inject
    private CatalogPage catalogPage;

    @И("^Откроется страница Каталог$")
    public void catalogPageIsVisible() {
        catalogPage.checkPageVisibility();
    }

    @И("^Чекбокс номер (\\d+) будет (Отмечен|Не отмечен)$")
    public void checkCheckBoxInput(int index, String isChecked) {
        catalogPage.checkCheckBoxInput(index, isChecked.equals("Отмечен"));
    }
}
