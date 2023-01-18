package com.otus.pages;

import com.otus.annotations.Path;
import com.otus.annotations.Template;
import com.otus.annotations.UrlTemplate;

@UrlTemplate(
    @Template(name = "category", value = "/category/{1}/{2}/tesst/{3}")
)
public class CategoryPage {
}
