package com.otus.pages;

import com.google.inject.Inject;
import com.otus.support.GuiceScoped;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class TeacherPage extends AbsBasePage<TeacherPage> {

    @FindBy(xpath = "//div[text()='Преподаватели']")
    private WebElement header;

    @Inject
    public TeacherPage(GuiceScoped guiceScoped) {
        super(guiceScoped);
    }

    public TeacherPage pageHeaderShouldBeSameAs(String header) {
        baseWaiters.waitForCondition(ExpectedConditions.visibilityOf(this.header), 5);
        baseWaiters.waitForCondition(ExpectedConditions.textToBePresentInElement(this.header, header), 5);
        assert this.header.getText().equals(header) : "Header is invalid";
        return this;
    }

}
