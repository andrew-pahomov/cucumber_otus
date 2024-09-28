package com.otus.pages;

import com.google.inject.Inject;
import com.otus.support.GuiceScoped;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CatalogPage extends AbsBasePage<CatalogPage> {

    @FindBy(xpath = "//div[text()='Каталог']")
    private WebElement header;

    @FindBy(xpath = "//*[text()='Направление']/../following-sibling::div//input")
    private List<WebElement> checkBoxInputs;

    @Inject
    public CatalogPage(GuiceScoped guiceScoped) {
        super(guiceScoped);
    }

    public CatalogPage checkPageVisibility() {
        baseWaiters.waitForCondition(ExpectedConditions.visibilityOf(this.header), 5);
        return this;
    }

    public CatalogPage checkCheckBoxInput(int index, boolean isChecked) {
        WebElement checkBoInput = checkBoxInputs.get(--index);
        assertEquals(isChecked, checkBoInput.isSelected(), "Состояние элемента отличается от ожидаемого");
        return this;
    }

}
