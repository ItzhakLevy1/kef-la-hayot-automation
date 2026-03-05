package utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HighlightUtils {

    public static void highlightElement(WebDriver driver, WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        // Highlight the element with a red border and yellow background
        js.executeScript("arguments[0].setAttribute('style', 'border: 10px solid #0003ff;');", element);
        // Optional: Add a small delay to make the highlight visible
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public static void removeHighlight(WebDriver driver, WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        // Remove the highlight by clearing the style
        js.executeScript("arguments[0].removeAttribute('style');", element);
    }
}
