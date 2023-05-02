package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;

public class MyAccountPage extends Utility {

    By myAccountList = By.xpath("//div[@id='top-links']//li[contains(@class,'open')]/ul/li");
    By myAccountLink = By.xpath("//span[contains(text(),'My Account')]");
    By accountLogoutText = By.xpath("//h1[contains(text(),'Account Logout')]");
    By continueButton = By.xpath("//a[contains(text(),'Continue')]");

    public void clickOnMyAccountLink(){
        clickOnElement(myAccountLink);
    }

    public void selectMyAccountOption(String option){
        listOfElements(myAccountList,option);
    }

    public String verifyAccountLogoutText(){
        return getTextElement(accountLogoutText);
    }

    public void clickOnContinueButton(){
        clickOnElement(continueButton);
    }


}
