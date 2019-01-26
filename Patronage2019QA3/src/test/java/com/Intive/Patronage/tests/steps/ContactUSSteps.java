package com.Intive.Patronage.tests.steps;

import com.Intive.Patronage.tests.DriverFactory;
import com.Intive.Patronage.tests.pages.AutomationpracticePage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ContactUSSteps extends DriverFactory {

    AutomationpracticePage automationpracticePage = new AutomationpracticePage(driver);
    private AutomationpracticePage automationpracticePage1;

    @When("^User press ContactUS link$")
    public void userPressContactUSLink() {
        automationpracticePage.openContactPage();
    }

    @And("^User press send button$")
    public void userPressSendButton() {
        automationpracticePage.PressSendButton();
    }

    @Then("^User see pop-up \"([^\"]*)\";$")
    public void userSeePopUp(String arg0) throws Throwable {
        automationpracticePage.ErrorPopUp(arg0);

    }

    @Then("^User see error pop-up \"([^\"]*)\";$")
    public void userSeeErrorPopUp(String arg0) throws Throwable {
        automationpracticePage.ErrorPopUp1(arg0);

    }

    @And("^User enters \"([^\"]*)\" in field E-mail address$")
    public void userEntersInFieldEMailAddress(String arg0) throws Throwable {
        automationpracticePage.Enteremail(arg0);
    }

    @And("^User enters \"([^\"]*)\" in field Message$")
    public void userEntersInFieldMessage(String arg0) throws Throwable {
        automationpracticePage.FildMessage(arg0);
    }

    @And("^User selects \"([^\"]*)\"$")
    public void userSelects(String arg0) throws Throwable {
      automationpracticePage.selectSubject(arg0);
    }
}

