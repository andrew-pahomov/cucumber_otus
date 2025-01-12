package ru.otus.steps.blocks;

import com.google.inject.Inject;
import io.cucumber.java.ru.Если;
import ru.otus.pages.TeachersPage;

public class TeacherBlockSteps {

    @Inject
    private TeachersPage teachersPage;

    @Если("Кликнуть на {int} плитку преподавателя")
    public void clickTeacherTile(int number) {
        teachersPage.checkTeachersPageVisibility();
        teachersPage.clickTeacherTileByIndex(number);
    }

}
