package com.Intive.Patronage.tests.steps;

import com.Intive.Patronage.tests.DriverFactory;
import com.Intive.Patronage.tests.pages.AutomationpracticePage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class newsletterSteps extends DriverFactory {

    AutomationpracticePage automationpracticePage = new AutomationpracticePage(driver);

    @Given("^User is on Automationpractice page$")
    public void userIsOnAutomationpracticePage() {
        automationpracticePage.openAutomationPracticePage();
    }

    @When("^Enter e-mail \"([^\"]*)\"$")
    public void enterEMail(String email) throws Throwable {
        automationpracticePage.fillEmailField(email);
    }

    @And("^Click on the submit button$")
    public void clickOnTheSubmitButton() {
        automationpracticePage.submitButtonSend();
    }


    @Then("^I see pop-up \"([^\"]*)\"$")
    public void iSeePopUp(String arg0) throws Throwable {
        automationpracticePage.checkResultPopUp(arg0);
    }
}
