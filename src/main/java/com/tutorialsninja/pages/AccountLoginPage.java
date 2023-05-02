package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;

public class AccountLoginPage extends Utility {

    By returningCustomerText = By.xpath("//h2[contains(text(),'Returning Customer')]");
    By emailField = By.id("input-email");
    By passwordField = By.id("input-password");
    By loginButton = By.xpath("//form[contains(@action,'login')]//input[@type='submit']");



    public String verifyReturningCustomer(){
        return getTextElement(returningCustomerText);
    }

    public void enterEmail(String email){
        sendTextToElement(emailField, email);
    }

    public void enterPassword(String password){
        sendTextToElement(passwordField,password);
    }

    public void clickOnLoginButton(){
        clickOnElement(loginButton);
    }
}
