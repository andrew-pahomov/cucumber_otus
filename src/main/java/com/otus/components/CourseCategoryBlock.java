package com.otus.components;

import com.google.inject.Inject;
import com.otus.pages.TeacherPage;
import com.otus.support.GuiceScoped;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CourseCategoryBlock extends AbsComponent<CourseCategoryBlock> {

    @FindBy(xpath = "//div[@class='sc-yfk21i-0 jeFZmS']")
    private List<WebElement> categoryButtons;

    @Inject
    public CourseCategoryBlock(GuiceScoped guiceScoped) {
        super(guiceScoped);
    }

    public TeacherPage clickCategoryLinkByText(String text) {
        categoryButtons.stream()
                .filter(el -> el.getText().contains(text))
                .findFirst().orElseThrow(() -> new NoSuchElementException(String.format("Элемент с текстом %s не найден", text)))
                .click();
        return new TeacherPage(guiceScoped);
    }

}
