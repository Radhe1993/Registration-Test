package uk.co.mongas.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import uk.co.mongas.utility.Utility;

public class DashboardPage extends Utility
{
    private static final Logger log = LogManager.getLogger(DashboardPage.class.getName());

    public DashboardPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "/html/body/div/div/div/div[3]/div[1]/h3")
    WebElement getJobVacancies;

    @CacheLookup
    @FindBy(xpath = "/html/body/div/div/div/table/thead")
    WebElement message;

    public void setGetJobVacancies(){
        log.info("Get text : " +getJobVacancies.toString());
        getTextFromElement(getJobVacancies);

    }
    public String jobMessage(){
        log.info("Get text : " +message.toString());
        return getTextFromElement(message);
    }
}
