package com.otus.steps.blocks;

import com.google.inject.Inject;
import com.otus.components.CourseCategoryBlock;
import io.cucumber.java.ru.Когда;

public class CourseCategoryBlockSteps {

    @Inject
    private CourseCategoryBlock courseCategoryBlock;

    @Когда("^Выбрать категорию (.*)$")
    public void selectCategory(String category) {
        courseCategoryBlock.clickCategoryLinkByText(category);
    }

}
