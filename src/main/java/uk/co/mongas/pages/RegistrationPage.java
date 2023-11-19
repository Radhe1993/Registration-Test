package uk.co.mongas.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import uk.co.mongas.utility.Utility;

public class RegistrationPage  extends Utility {
    private static final Logger log = LogManager.getLogger(RegistrationPage.class.getName());

    public RegistrationPage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath = "//*[@id=\"name\"]")
    WebElement firstName;

    @CacheLookup
    @FindBy(xpath = "//*[@id=\"email\"]")
    WebElement email;

    @CacheLookup
    @FindBy(xpath = "//*[@id=\"url\"]")
    WebElement webaddress;

    @CacheLookup
    @FindBy(xpath = "/html/body/div/div/div/form/iframe/document/html/body/div/textarea")
    WebElement interests;

    @CacheLookup
    @FindBy(xpath = "//*[@id=\"password\"]")
    WebElement password;

    @CacheLookup
    @FindBy(xpath = "//*[@id=\"confirmPassword\"]")
    WebElement confirmPassword;

    @CacheLookup
    @FindBy(xpath = "/html/body/div/div/div/form/button")
    WebElement register;

    @CacheLookup
    @FindBy(xpath = "/html/body/div/div/div/div[2]")
    WebElement message;

    public void enterFirstName(String name){
        sendTextToElement(firstName,name);
        log.info("Enter First Name : " + firstName.toString());
    }
    public void enterEmail(String emailID){
        sendTextToElement(email,emailID);
        log.info("Enter Email : " + email.toString());
    }
    public void enterWebAddress(String web){
        sendTextToElement(webaddress,web);
        log.info("Enter Web Address : " + webaddress.toString());
    }
    public void enterInterests(String text){
        sendTextToElement(interests,text);
        log.info("Enter Interests : " + interests.toString());
    }
    public void enterPassword(String passWord){
        sendTextToElement(password,passWord);
        log.info("Enter Password : " + password.toString());
    }
    public void enterConfirmPassword(String confirm){
        sendTextToElement(confirmPassword,confirm);
        log.info("Enter ConfirmPassword : " + confirmPassword.toString());
    }
    public void clickOnRegister(){
        clickOnElement(register);
        log.info("Clicking on Register Button : " + register.toString());
    }
    public String getMessage(){
        log.info("Get text : " +message.toString());
        return getTextFromElement(message);

    }

}

