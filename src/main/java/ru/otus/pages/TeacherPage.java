package ru.otus.pages;

import com.google.inject.Inject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import ru.otus.support.GuiceScoped;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TeacherPage extends AbsBasePage<TeacherPage> {

    @FindBy(xpath = "//div[text()='Преподаватели']")
    private WebElement header;

    @Inject
    public TeacherPage(GuiceScoped guiceScoped) {
        super(guiceScoped);
    }

    public TeacherPage pageHeaderShouldBeSameAs(String header) {
        assertTrue(baseWaiters.waitForCondition(ExpectedConditions.visibilityOf(this.header), 5));
        assertTrue(baseWaiters.waitForCondition(ExpectedConditions.textToBePresentInElement(this.header, header), 5));
        return this;
    }

}
