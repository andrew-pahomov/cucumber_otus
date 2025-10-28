package ru.otus.components;

import com.google.inject.Inject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import ru.otus.pages.CatalogPage;
import ru.otus.support.GuiceScoped;

public class EducationMenuBlock extends AbsComponent<EducationMenuBlock> {

    @FindBy(xpath = "//span[@title='Обучение']")
    private WebElement educationMenuButton;

    @FindBy(xpath = "//p[text()='Все курсы']/following-sibling::div")
    private WebElement allCoursesElement;

    @FindBy(xpath = "//*[contains(text(), 'Посещая наш сайт')]/following-sibling::div//button")
    private WebElement notificationButton;

    @Inject
    public EducationMenuBlock(GuiceScoped guiceScoped) {
        super(guiceScoped);
    }

    public CatalogPage clickCategoryLinkByText(String text) {
        baseWaiters.waitForCondition(ExpectedConditions.stalenessOf(notificationButton), 5);
        notificationButton.click();
        actions.moveToElement(educationMenuButton).build().perform();
        allCoursesElement.findElement(By.xpath(String.format("//a[text()='%s']", text))).click();
        return new CatalogPage(guiceScoped);
    }

}
