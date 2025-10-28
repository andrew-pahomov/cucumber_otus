package ru.otus.steps.blocks;

import com.google.inject.Inject;
import io.cucumber.java.ru.И;
import ru.otus.components.EducationMenuBlock;

public class EducationMenuSteps {

    @Inject
    private EducationMenuBlock educationMenuBlock;

    @И("^Выбрать категорию (.*)$")
    public void selectCategory(String text) {
        educationMenuBlock.clickCategoryLinkByText(text);
    }
}
