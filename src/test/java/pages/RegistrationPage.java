package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.qameta.allure.Step;
import utils.HighlightUtils;
import java.time.Duration;

public class RegistrationPage extends BasePage {

    // Scoped locators using the .contact container
    private By fullNameField = By.cssSelector(".contact #customer_full_name");
    private By emailField = By.cssSelector(".contact #customer_email");
    private By phoneField = By.cssSelector(".contact #customer_mobile_phone");
    private By passwordField = By.cssSelector(".contact #customer_set_password");
    private By confirmPasswordField = By.cssSelector(".contact #customer_set_password_confirmation");
    private By registerBtn = By.cssSelector("[href='#customer']");
    private By termsCheckbox = By.cssSelector("#terms_agree__customers_2");
    private By termsAndConditionsLabel = By.cssSelector("[for='terms_agree__customers_2']");


    public RegistrationPage(WebDriver driver) {
        super(driver);
    }

    @Step("Navigating to Registration Page")
    public void navigateTo() {
        driver.get("https://www.keflahayot.co.il/customer_signup");
    }

    @Step("Filling registration form without(!) confirming terms: Name={name}, Email={email}")
    public void fillRegistrationForm(String name, String email, String phone, String pass) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Wait until the page is interactive and the first field is visible
        WebElement nameInput = wait.until(ExpectedConditions.visibilityOfElementLocated(fullNameField));

        nameInput.sendKeys(name);
        driver.findElement(emailField).sendKeys(email);
        driver.findElement(phoneField).sendKeys(phone);
        driver.findElement(passwordField).sendKeys(pass);
        driver.findElement(confirmPasswordField).sendKeys(pass);
    }

    @Step("Highlighting and clicking the Register button")
    public void clickRegister() {
        WebElement btn = driver.findElement(registerBtn);
        // Applying highlight before click to ensure it's captured in the report/video
        HighlightUtils.highlightElement(driver, btn);
        btn.click();
    }

    @Step("Accepting terms and conditions using JS Click to bypass overlays")
    public void acceptTerms() {
        WebElement checkbox = driver.findElement(termsCheckbox);

        // Use JavascriptExecutor to click even if obscured by the Cookie banner
        org.openqa.selenium.JavascriptExecutor js = (org.openqa.selenium.JavascriptExecutor) driver;

        if (!checkbox.isSelected()) {
            HighlightUtils.highlightElement(driver, checkbox);
            // This bypasses the "ElementClickInterceptedException"
            js.executeScript("arguments[0].click();", checkbox);
        }
    }

    @Step("Highlighting overlap between the Registration button and the Terms label")
    public void highlightOverlapArea() {

        // Create access to both the confirmation button and the terms of conditions check box
        WebElement checkboxElement = driver.findElement(termsAndConditionsLabel);
        WebElement registerButton = driver.findElement(registerBtn);

        HighlightUtils.highlightElement(driver, checkboxElement);
        HighlightUtils.highlightElement(driver, registerButton);

    }
}