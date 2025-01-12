package ru.otus.pageobject;

import com.google.inject.Inject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import ru.otus.support.GuiceScoped;
import ru.otus.waiters.BaseWaiters;

public abstract class AbsPageObject<T> {
    protected WebDriver driver;
    protected BaseWaiters baseWaiters;
    protected GuiceScoped guiceScoped;
    protected Actions actions;

    @Inject
    public AbsPageObject(GuiceScoped guiceScoped) {
        this.guiceScoped = guiceScoped;
        this.driver = guiceScoped.driver;
        this.baseWaiters = new BaseWaiters(driver);
        this.actions = new Actions(driver);
        PageFactory.initElements(guiceScoped.driver, this);
    }

}
