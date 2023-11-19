package uk.co.mongas.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import uk.co.mongas.utility.Utility;

public class HomePage  extends Utility
{
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "/html/body/div/div/div/div/p[2]/a")
    WebElement clickOnRegisterButton;

    @CacheLookup
    @FindBy(xpath = "/html/body/div/div/div/div/h1")
    WebElement getRegistrationMessage;

    public void setClickOnRegisterButton(){
        clickOnElement(clickOnRegisterButton);
        log.info("Clicking on Register Button : " + clickOnRegisterButton.toString());
    }

    public void getRegistrationMessage(){
        getTextFromElement(getRegistrationMessage);
        log.info("Get text : " + getRegistrationMessage.toString());
    }

}
