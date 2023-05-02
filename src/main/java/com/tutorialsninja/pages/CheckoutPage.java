package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;

public class CheckoutPage extends Utility {

    By checkoutTitleText = By.xpath("//h1[text()='Checkout']");
    By newCustomerText = By.xpath("//div[@class='col-sm-6']/parent::div/child::div[1]/h2");
    By guestCheckoutRadioButton = By.xpath("//input[@value='guest']");
    By continueButton = By.id("button-account");
    By firstnameField = By.id("input-payment-firstname");
    By lastnameField = By.id("input-payment-lastname");
    By emailField = By.id("input-payment-email");
    By telephoneField = By.id("input-payment-telephone");
    By addressField = By.id("input-payment-address-1");
    By cityField = By.id("input-payment-city");
    By postcodeField = By.id("input-payment-postcode");
    By countryField = By.id("input-payment-country");
    By stateField = By.id("input-payment-zone");
    By continueButtonGuest = By.id("button-guest");
    By commentsTextBox = By.xpath("//textarea[@name='comment']");
    By continueToPaymentMethod = By.xpath("//input[@id='button-payment-method']");
    By termAndConditionsCheckbox = By.xpath("//a[@class='agree']/following-sibling::input[1]");
    By warningText = By.xpath("//div[@class= 'alert alert-danger alert-dismissible']");


    public String verifyTitleOfCheckoutPage(){
        return getTextElement(checkoutTitleText);
    }

    public String verifyNewCustomerText(){
        return getTextElement(newCustomerText);
    }

    public void clickOnGuestCheckoutRadioButton(){
        clickOnElement(guestCheckoutRadioButton);
    }

    public void clickOnContinueButton(){
        clickOnElement(continueButton);
    }

    public void enterFirstname(String firstname){
        sendTextToElement(firstnameField, firstname);
    }

    public void enterLastname(String lastname){
        sendTextToElement(lastnameField, lastname);
    }

    public void enterEmail(String email){
        sendTextToElement(emailField, email);
    }

    public void enterTelephone(String telephone){
        sendTextToElement(telephoneField, telephone);
    }

    public void enterAddress(String address){
        sendTextToElement(addressField, address);
    }

    public void enterCity(String city){
        sendTextToElement(cityField, city);
    }

    public void enterPostcode(String postcode){
        sendTextToElement(postcodeField, postcode);
    }

    public void selectCountry(String country){
       selectByVisibleTextFromDropDown(countryField, country);
    }

    public void selectState(String state){
        selectByVisibleTextFromDropDown(stateField, state);
    }

    public void clickOnContinueToPaymentMethod(){
        clickOnElement(continueToPaymentMethod);
    }

    public void clickOnContinueGuestButton(){
        clickOnElement(continueButtonGuest);
    }

    public void enterCommentsInTextArea(String comments){
        clickOnElement(commentsTextBox);
        sendTextToElement(commentsTextBox,comments);
    }

    public void clickOnTermsAndConditions(){
        clickOnElement(termAndConditionsCheckbox);
    }



    public String verifyWarningMessage(){
        return getTextElement(warningText);
    }





}
