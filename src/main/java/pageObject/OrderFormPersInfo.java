package pageObject;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.IOException;

public class OrderFormPersInfo extends BasePage {

    public WebDriver driver;

    By genderMr = By.cssSelector("label:nth-of-type(1) > .custom-radio > input[name='id_gender']");
    By genderMrs = By.cssSelector("label:nth-of-type(2) > .custom-radio > input[name='id_gender']");
    By firstNameField = By.cssSelector("input[name='firstname']");
    By lastNameField = By.cssSelector("input[name='lastname']");
    By emailField = By.cssSelector("input#field-email");
    By passwordField = By.cssSelector("input#field-password");
    By birthDateField = By.cssSelector("input[name='birthday']");
    By receiveOffersCheckbox = By.cssSelector("div:nth-of-type(7)  span > label > span");
    By newsletterCheckbox = By.cssSelector("div:nth-of-type(8)  span > label > span");
    By termsConditionsCheckbox = By.cssSelector("input[name='psgdpr']");
    By continueBtn = By.cssSelector("form#customer-form  button[name='continue']");

    public OrderFormPersInfo() throws IOException {
        super();
    }

    public WebElement getGenderMr() throws IOException, InterruptedException {
        this.driver = getDriver();
        return driver.findElement(genderMr);
    }

    public WebElement getGenderMrs() throws IOException, InterruptedException {
        this.driver = getDriver();
        return driver.findElement(genderMrs);
    }

    public WebElement getFirstNameField() throws IOException, InterruptedException {
        this.driver = getDriver();
        return driver.findElement(firstNameField);
    }

    public WebElement getLastnameField() throws IOException, InterruptedException {
        this.driver = getDriver();
        return driver.findElement(lastNameField);
    }

    public WebElement getEmailField() throws IOException, InterruptedException {
        this.driver = getDriver();
        return driver.findElement(emailField);
    }

    public WebElement getPasswordField() throws IOException, InterruptedException {
        this.driver = getDriver();
        return driver.findElement(passwordField);
    }

    public WebElement getBirthDateField() throws IOException, InterruptedException {
        this.driver = getDriver();
        return driver.findElement(birthDateField);
    }

    public WebElement getRecOfferCheckbox() throws IOException, InterruptedException {
        this.driver = getDriver();
        return driver.findElement(receiveOffersCheckbox);
    }

    public WebElement getNewsletterCheckbox() throws IOException, InterruptedException {
        this.driver = getDriver();
        return driver.findElement(newsletterCheckbox);
    }

    public WebElement getTermsConditionsCheckbox() throws IOException, InterruptedException {
        this.driver = getDriver();
        return driver.findElement(termsConditionsCheckbox);
    }

    public WebElement getContinueBtn() throws IOException, InterruptedException {
        this.driver = getDriver();
        return driver.findElement(continueBtn);
    }
}
