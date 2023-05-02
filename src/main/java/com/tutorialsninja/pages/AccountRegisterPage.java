package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;

public class AccountRegisterPage extends Utility {

    By registerTitleText = By.xpath("//h1[contains(text(),'Register Account')]");
    By firstNameField = By.id("input-firstname");
    By lastNameField = By.id("input-lastname");
    By emailField = By.id("input-email");
    By telephoneField = By.id("input-telephone");
    By passwordField = By.id("input-password");
    By confirmPasswordField = By.id("input-confirm");
    By subscribeRadioButton = By.xpath("//fieldset[3]//input");
    By privacyPolicyCheckBox = By.xpath("//div[@class = 'buttons']//input[@name='agree']");
    By continueButton = By.xpath("//div[@class = 'buttons']//input[@value='Continue']");
    By accountCreationSuccessMessage = By.xpath("//h1[contains(text(),'Your Account Has Been Created!')]");
    By continueAfterRegistrationSuccess = By.xpath("//a[contains(text(),'Continue')]");


    public String verifyRegisterTitle(){
        return getTextElement(registerTitleText);
    }

    public void enterFirstName(String firstName){
        sendTextToElement(firstNameField,firstName);
    }

    public void enterLastName(String lastName){
        sendTextToElement(lastNameField,lastName);
    }

    public void enterEmail(String email){
        sendTextToElement(emailField,email);
    }

    public void enterTelephone(String telephone){
        sendTextToElement(telephoneField,telephone);
    }
    public void enterPassword(String password){
        sendTextToElement(passwordField,password);
    }
    public void enterConfirmPassword(String confirmPassword){
        sendTextToElement(confirmPasswordField,confirmPassword);
    }

    public void selectSubscribeRadioButton(String option){
        getOptions(subscribeRadioButton,option);
    }

    public void clickOnPrivacyPolicyBox(){
        clickOnElement(privacyPolicyCheckBox);
    }

    public void clickOnContinueButton(){
        clickOnElement(continueButton);
    }

    public String verifyAccountCreatedSuccessfully(){
        return getTextElement(accountCreationSuccessMessage);
    }

    public void clickOnContinueAfterSuccessfulRegistration(){
        clickOnElement(continueAfterRegistrationSuccess);
    }



}
