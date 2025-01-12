package ru.otus.components;

import com.google.inject.Inject;
import ru.otus.pageobject.AbsPageObject;
import ru.otus.support.GuiceScoped;

public abstract class AbsComponent<T> extends AbsPageObject<T> {

    @Inject
    public AbsComponent(GuiceScoped guiceScoped) {
        super(guiceScoped);
    }

}
