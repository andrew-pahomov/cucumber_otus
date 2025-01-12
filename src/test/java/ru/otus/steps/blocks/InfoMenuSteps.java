package ru.otus.steps.blocks;

import com.google.inject.Inject;
import io.cucumber.java.ru.И;
import ru.otus.components.InfoMenuBlock;

public class InfoMenuSteps {

    @Inject
    private InfoMenuBlock infoMenuBlock;

    @И("^Выбрать тип информации (.*)$")
    public void selectInfoType(String text) {
        infoMenuBlock.clickInfoLinkByText(text);
    }
}
