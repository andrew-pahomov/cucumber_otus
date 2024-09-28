package com.otus.components;

import com.google.inject.Inject;
import com.otus.pageobject.AbsPageObject;
import com.otus.support.GuiceScoped;

public abstract class AbsComponent<T> extends AbsPageObject<T> {

    @Inject
    public AbsComponent(GuiceScoped guiceScoped) {
        super(guiceScoped);
    }

}
