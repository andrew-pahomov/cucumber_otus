package ru.otus.pages;

import com.google.inject.Inject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import ru.otus.components.AbsComponent;
import ru.otus.support.GuiceScoped;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TeachersPage extends AbsComponent<TeachersPage> {

    @FindBy(xpath = "//a[contains(@href, '/instructors/')]")
    private List<WebElement> teachers;
    @FindBy(xpath = "//div[text()='Преподаватели']")
    private WebElement header;

    @Inject
    public TeachersPage(GuiceScoped guiceScoped) {
        super(guiceScoped);
    }

    public TeachersPage checkTeachersPageVisibility() {
        assertTrue(baseWaiters.waitForCondition(ExpectedConditions.titleIs("Преподаватели | OTUS"), 10));
        assertTrue(baseWaiters.waitForCondition(ExpectedConditions.visibilityOf(this.header), 5));
        return this;
    }

    public TeacherPage clickTeacherTileByIndex(int index) {
        teachers.get(--index).click();
        return new TeacherPage(guiceScoped);
    }
}
