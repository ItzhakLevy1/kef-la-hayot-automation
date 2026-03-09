package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.HighlightUtils;


public class LinksPage extends BasePage{

    // Locators
    private By ptvStore = By.xpath("//a[contains(normalize-space(), 'חנות חיות בפתח תקווה')]");
    private By emptySection = By.cssSelector(".categoriesstrength");

    // Constructor
    public LinksPage(WebDriver driver) {
        super(driver);
    }

    // Navigate to Links Page
    @Step
    public void navigateToLinksPage(){
        driver.get("https://www.keflahayot.co.il/pages/");
    }

    // Highlight and Click the link
    @Step
    public void clickLinkToPTVStore(){
        WebElement linkToPtvStore = driver.findElement(ptvStore);
        HighlightUtils.highlightElement(driver, linkToPtvStore);
        linkToPtvStore.click();
    }

    // Highlight the empty section
    @Step
    public void highlightEmptyPTVStoreSection(){
        cookieBanner.acceptCookies();
        scrollToAndHighlight(emptySection);
    }
}
