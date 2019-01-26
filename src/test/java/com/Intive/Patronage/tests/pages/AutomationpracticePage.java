package com.Intive.Patronage.tests.pages;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutomationpracticePage {

    public static String AUTOMATION_URL = "http://www.automationpractice.com/index.php";
    public WebDriver c_driver;

    @FindBy(how = How.NAME, using = "email")
    private WebElement emailField;

    public void fillEmailField(String email) {
        emailField.sendKeys(email);
    }
    @FindBy(how = How.NAME, using = "submitNewsletter")
    private WebElement submitButton;

    @FindBy (how = How.CLASS_NAME, using = "alert")
    public WebElement AlertResult;


    public AutomationpracticePage(WebDriver driver) {

        c_driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void openAutomationPracticePage() {
        c_driver.get(AUTOMATION_URL);
    }

    public void submitButtonSend() {
        submitButton.click();

    }


    public void checkResultPopUp(String arg0) {
        WebDriverWait wait = new WebDriverWait(c_driver, 5);
        wait.until(ExpectedConditions.textToBePresentInElement(AlertResult, arg0));
    }

    @FindBy(how = How.ID, using = "contact-link")
    private WebElement contactLink;

    @FindBy(how = How.ID, using = "submitMessage")
    private WebElement SendButton;

    public void PressSendButton() {
    SendButton.click();
    }

    public void openContactPage() {
    contactLink.click();}


    public void ErrorPopUp(String arg0) {
     WebDriverWait wait = new WebDriverWait(c_driver, 5);
        wait.until(ExpectedConditions.textToBePresentInElement(AlertResult, arg0));
    }
    @FindBy(how = How.ID, using = "email")
    private WebElement Enteremail;

    public void Enteremail(String arg0) {
        Enteremail.sendKeys(arg0);
    }

    public void FildMessage(String arg0) {
    MessageField.sendKeys(arg0);
    }
    @FindBy (how =How.ID, using = "message")
    private WebElement MessageField;

    public void ErrorPopUp1(String arg0) {
     WebDriverWait wait = new WebDriverWait(c_driver, 5);
        wait.until(ExpectedConditions.textToBePresentInElement(AlertResult, arg0));
    }

     @FindBy (how =How.ID, using ="id_contact")
     private WebElement selectField;

     public void selectSubject(String arg0) {
     Select selectElement = new Select(selectField);
     selectElement.selectByVisibleText(arg0);
     }
    }