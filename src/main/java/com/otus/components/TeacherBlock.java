package com.otus.components;

import com.google.inject.Inject;
import com.otus.pages.TeacherPage;
import com.otus.support.GuiceScoped;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class TeacherBlock extends AbsComponent<TeacherBlock> {

  @Inject
  public TeacherBlock(GuiceScoped guiceScoped) {
    super(guiceScoped);
  }

  @FindBy(css = "a.teacher")
  private List<WebElement> teachers;

  public TeacherPage clickTeacherTileByIndex(int index) {
    teachers.get(--index).click();

    return new TeacherPage(guiceScoped);
  }
}
