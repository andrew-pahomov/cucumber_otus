package ru.otus.components;

import com.google.inject.Inject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import ru.otus.pages.TeachersPage;
import ru.otus.support.GuiceScoped;

public class InfoMenuBlock extends AbsComponent<InfoMenuBlock> {

    @FindBy(xpath = "//span[@title='Информация']")
    private WebElement infoMenuButton;

    @FindBy(xpath = "//p[text()='Студентам']/following-sibling::div")
    private WebElement allStudentsInfoElement;

    @FindBy(xpath = "//*[contains(text(), 'Посещая наш сайт')]/following-sibling::div//button")
    private WebElement notificationButton;

    @Inject
    public InfoMenuBlock(GuiceScoped guiceScoped) {
        super(guiceScoped);
    }

    public TeachersPage clickInfoLinkByText(String text) {
        baseWaiters.waitForCondition(ExpectedConditions.stalenessOf(notificationButton), 5);
        notificationButton.click();
        actions.moveToElement(infoMenuButton).build().perform();
        allStudentsInfoElement.findElement(By.xpath(String.format(".//a[text()='%s']", text))).click();
        return new TeachersPage(guiceScoped);
    }

}
