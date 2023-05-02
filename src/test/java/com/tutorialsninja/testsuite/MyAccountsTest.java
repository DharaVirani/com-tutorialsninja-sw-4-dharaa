package com.tutorialsninja.testsuite;

import com.tutorialsninja.pages.*;
import com.tutorialsninja.testbase.BaseTest;
import org.testng.annotations.Test;

public class MyAccountsTest extends BaseTest {


    MyAccountPage myAccountPage = new MyAccountPage();
    AccountLoginPage accountLoginPage = new AccountLoginPage();
    AccountRegisterPage accountRegisterPage= new AccountRegisterPage();


    @Test
    public void verifyUserShouldNavigateToRegisterPageSuccessfully(){
        //1.1 Click on My Account Link.
        myAccountPage.clickOnMyAccountLink();
        //1.2 Call the method “selectMyAccountOptions” method and pass the parameter
        myAccountPage.selectMyAccountOption("Register");
        //1.3 Verify the text “Register Account”.
        verifyText("Register page not displayed", "Register Account",accountRegisterPage.verifyRegisterTitle());

    }

    @Test
    public void verifyUserShouldNavigateToLoginPageSuccessfully(){
        //2.1 Click on My Account Link.
        myAccountPage.clickOnMyAccountLink();
        //2.2 Call the method “selectMyAccountOptions” method and pass the parameter “Login”
        myAccountPage.selectMyAccountOption("Login");
        //2.3 Verify the text “Returning Customer”.
        verifyText("Login page not displayed", "Returning Customer", accountLoginPage.verifyReturningCustomer());
    }

    @Test
    public void verifyThatUserRegisterAccountSuccessfully() {
        //3.1 Click on My Account Link.
        myAccountPage.clickOnMyAccountLink();
        //3.2 Call the method “selectMyAccountOptions” method and pass the parameter “Register”
        myAccountPage.selectMyAccountOption("Register");
        //3.3 Enter First Name
        accountRegisterPage.enterFirstName("Karuna");
        //3.4 Enter Last Name
        accountRegisterPage.enterLastName("Jagani");
        //3.5 Enter Email
        accountRegisterPage.enterEmail("karuna28jagani@gmail.com");
        //3.6 Enter Telephone
        accountRegisterPage.enterTelephone("07678765432");
        //3.7 Enter Password
        accountRegisterPage.enterPassword("9081811670@Dv");
        //3.8 Enter Password Confirm
        accountRegisterPage.enterConfirmPassword("9081811670@Dv");
        //3.9 Select Subscribe Yes radio button
        accountRegisterPage.selectSubscribeRadioButton("Yes");
        //3.10 Click on Privacy Policy check box
        accountRegisterPage.clickOnPrivacyPolicyBox();
        //3.11 Click on Continue button
        accountRegisterPage.clickOnContinueButton();
        //3.12 Verify the message “Your Account Has Been Created!”
        verifyText("Account not created", "Your Account Has Been Created!", accountRegisterPage.verifyAccountCreatedSuccessfully());
        //3.13 Click on Continue button
        accountRegisterPage.clickOnContinueAfterSuccessfulRegistration();
        //3.14 Click on My Account Link.
        myAccountPage.clickOnMyAccountLink();
        //3.15 Call the method “selectMyAccountOptions” method and pass the parameter “Logout”
        myAccountPage.selectMyAccountOption("Logout");
        //3.16 Verify the text “Account Logout”
        verifyText("Invalid message", "Account Logout", myAccountPage.verifyAccountLogoutText());
        //3.17 Click on Continue button
        myAccountPage.clickOnContinueButton();
    }
        @Test
        public void verifyThatUserShouldLoginAndLogoutSuccessfully() {
            //4.1 Click on My Account Link.
            myAccountPage.clickOnMyAccountLink();
            //4.2 Call the method “selectMyAccountOptions” method and pass the parameter "Login”
            myAccountPage.selectMyAccountOption("Login");
            //4.3 Enter Email address
            accountLoginPage.enterEmail("karuna28jagani@gmail.com");
            //4.4 Enter Password
            accountLoginPage.enterPassword("9081811670@Dv");
            //4.5 Click on Login button
            accountLoginPage.clickOnLoginButton();
            //4.8 Click on My Account Link.
            myAccountPage.clickOnMyAccountLink();
            //4.9 Call the method “selectMyAccountOptions” method and pass the parameter “Logout”
            myAccountPage.selectMyAccountOption("Logout");
            //4.10 Verify the text “Account Logout”
            verifyText("Didn't log out", "Account Logout",myAccountPage.verifyAccountLogoutText());
            //4.11 Click on Continue button
            myAccountPage.clickOnContinueButton();
        }
    }

