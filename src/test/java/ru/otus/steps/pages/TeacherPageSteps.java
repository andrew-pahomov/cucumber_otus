package ru.otus.steps.pages;

import com.google.inject.Inject;
import io.cucumber.java.ru.Тогда;
import ru.otus.pages.TeacherPage;

public class TeacherPageSteps {

    @Inject
    public TeacherPage teacherPage;

    @Тогда("Откроется страница карточки преподавателя")
    public void teacherPageShouldBeOpened() {
        teacherPage.pageHeaderShouldBeSameAs("Преподаватели");
    }
}
