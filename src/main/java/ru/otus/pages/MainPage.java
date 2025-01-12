package ru.otus.pages;

import com.google.inject.Inject;
import ru.otus.annotations.Path;
import ru.otus.support.GuiceScoped;

@Path("/")
public class MainPage extends AbsBasePage<MainPage> {

    @Inject
    public MainPage(GuiceScoped guiceScoped) {
        super(guiceScoped);
    }

}
