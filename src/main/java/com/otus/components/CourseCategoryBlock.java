package com.otus.components;

import com.otus.pages.TeacherPage;
import com.otus.support.GuiceScoped;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class CourseCategoryBlock extends AbsComponent<CourseCategoryBlock> {

    @FindBy(xpath = "//a[contains(@href,'categor')]")
    private List<WebElement> categoryLinks;
    @FindBy(xpath = "//p[text()='Все курсы']")
    private WebElement allCoursesTitle;

    public CourseCategoryBlock(GuiceScoped guiceScoped) {
        super(guiceScoped);
    }

    public void waitAllCoursesTitleVisible() {
        baseWaiters.waitForCondition(ExpectedConditions.visibilityOf(allCoursesTitle), 4);
    }

    public TeacherPage clickCategoryLinkByText(String text) {
        categoryLinks.stream().filter(el -> el.getText().contains(text)).findFirst().orElseThrow(RuntimeException::new).click();
        return new TeacherPage(guiceScoped);
    }

}
