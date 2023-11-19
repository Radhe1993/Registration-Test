package uk.co.mongas.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import uk.co.mongas.pages.DashboardPage;
import uk.co.mongas.pages.HomePage;
import uk.co.mongas.pages.RegistrationPage;

public class HomePageSteps {
    @Given("Student navigates to the homepage to registration page")
    public void studentNavigatesToTheHomepageToRegistrationPage() {
    }
    @When("Student click on Register button")
    public void studentClickOnRegisterButton() {
        new HomePage().setClickOnRegisterButton();
    }
    @Then("Student should navigate to Register page successfully")
    public void studentShouldNavigateToRegisterPageSuccessfully() {
        new HomePage().getRegistrationMessage();
    }

    @And("Student enter first name {string}")
    public void studentEnterFirstName(String name) throws InterruptedException {
        new RegistrationPage().enterFirstName(name);
        Thread.sleep(2000);
    }

    @And("Student enter email address {string}")
    public void studentEnterEmailAddress(String emailID) throws InterruptedException {
        new RegistrationPage().enterEmail(emailID);
        Thread.sleep(2000);
    }

    @And("Student enter web address {string}")
    public void studentEnterWebAddress(String web) throws InterruptedException {
        new RegistrationPage().enterWebAddress(web);
        Thread.sleep(2000);
    }

    @And("Student enter interests {string}")
    public void studentEnterInterests(String text) throws InterruptedException {
        new RegistrationPage().enterInterests(text);
        Thread.sleep(2000);
    }

    @And("Student enter password {string}")
    public void studentEnterPassword(String passWord) throws InterruptedException {
        new RegistrationPage().enterPassword(passWord);
        Thread.sleep(2000);
    }

    @And("Student enter Confirm password {string}")
    public void studentEnterConfirmPassword(String confirm) {
        new RegistrationPage().enterConfirmPassword(confirm);
    }

    @And("Student should click on Register button")
    public void studentShouldClickOnRegisterButton() {
        new RegistrationPage().clickOnRegister();
    }

    @Then("Verify the message {string}")
    public void verifyTheMessage(String message) {
        Assert.assertEquals(new RegistrationPage().getMessage(),message,"Your registration has been successful!");
    }

    @When("Student get latest {int} jobs vacancies")
    public void studentGetLatestJobsVacancies(int arg0) {
        new DashboardPage().setGetJobVacancies();
    }

    @Then("Student can see the job {string}")
    public void studentCanSeeTheJob(String vacancies) {
        Assert.assertEquals(new DashboardPage().jobMessage(),vacancies,"vacancies");
    }
}

