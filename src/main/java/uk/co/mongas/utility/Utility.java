package uk.co.mongas.utility;

import org.openqa.selenium.WebElement;
import uk.co.mongas.browserfactory.ManageBrowser;

public class Utility extends ManageBrowser {
    public void clickOnElement(WebElement element) {
        element.click();
    }

    public String getTextFromElement(WebElement element) {
        return element.getText();
    }

    public void sendTextToElement(WebElement element, String str) {
        element.sendKeys(str);
    }
}







