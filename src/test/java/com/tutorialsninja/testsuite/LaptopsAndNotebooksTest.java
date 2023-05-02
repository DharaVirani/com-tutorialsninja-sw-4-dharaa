package com.tutorialsninja.testsuite;

import com.tutorialsninja.pages.*;
import com.tutorialsninja.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LaptopsAndNotebooksTest extends BaseTest {

    HomePage homePage= new HomePage();
    LaptopsAndNotebookPage laptopsAndNotebookPage = new LaptopsAndNotebookPage();
    ProductPage productPage = new ProductPage();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
    CheckoutPage checkoutPage= new CheckoutPage();

    @Test
    public void verifyProductsPriceDisplayHighToLowSuccessfully(){
        //1.1 Mouse hover on Laptops & Notebooks Tab.and click
      homePage.mouseHoverAndClickOnLaptopsAndNotebooksTab();
        //1.2 Click on “Show AllLaptops & Notebooks”
      homePage.mouseHoverAndClickShowAllLaptopsAndNotebooksMenu();
        //1.3 Select Sort By "Price (High > Low)"
        //1.4 Verify the Product price will arrange in High to Low order.
      laptopsAndNotebookPage.verifyReverseOrderOfProducts("Price (High > Low)");


    }

    @Test
    public void verifyThatUserPlaceOrderSuccessfully() throws InterruptedException {
        // Select currency as £ Pound Sterling
        homePage.selectCurrency("£Pound Sterling");
        //2.1 Mouse hover on Laptops & Notebooks Tab and click
        homePage.mouseHoverAndClickOnLaptopsAndNotebooksTab();
        //2.2 Click on “Show All Laptops & Notebooks”
        homePage.mouseHoverAndClickShowAllLaptopsAndNotebooksMenu();
        //2.3 Select Sort By "Price (High > Low)"
        laptopsAndNotebookPage.selectSortByField("Price (High > Low)");
        //2.4 Select Product “MacBook”
        laptopsAndNotebookPage.clickOnProductMacBookLink();
        //2.5 Verify the text “MacBook”
        verifyText("Invalid text", "MacBook",productPage.verifyProductMacbookText());
        //2.6 Click on ‘Add To Cart’ button
        productPage.clickOnAddToCartButton();
        //2.7 Verify the message “Success: You have added MacBook to your shopping cart!”
        verifyText("Product not added", "Success: You have added MacBook to your shopping cart!",  productPage.verifyAddedToCartMessage());
        //2.8 Click on link “shopping cart” display into success message
        Thread.sleep(1000);
        productPage.clickOnShoppingCartLink();
        //2.9 Verify the text "Shopping Cart"
        verifyText("Not navigated to Shopping cart","Shopping Cart", shoppingCartPage.verifyShoppingCartTitle());
        //2.10 Verify the Product name "MacBook"
        verifyText("No product name exist","MacBook", shoppingCartPage.verifyProductName());
        //2.11 Change Quantity "2"
        shoppingCartPage.changeQtyField("2");
        //2.12 Click on “Update” Tab
        shoppingCartPage.clickOnUpdateButton();
        //2.13 Verify the message “Success: You have modified your shopping cart!”
        verifyText("Update is not successful","Success: You have modified your shopping cart!", shoppingCartPage.verifyModificationMessage());
        //2.14 Verify the Total £737.45
        verifyText("Total not matched", "£737.45", shoppingCartPage.verifyTotalPrice());
        //2.15 Click on “Checkout” button
        shoppingCartPage.clickOnCheckOutButton();
        //2.16 Verify the text “Checkout”
        verifyText("Unsuccessful loading", "Checkout", checkoutPage.verifyTitleOfCheckoutPage() );
        //2.17 Verify the Text “New Customer”
        verifyText("Invalid text", "New Customer", checkoutPage.verifyNewCustomerText());
        //2.18 Click on “Guest Checkout” radio button
        checkoutPage.clickOnGuestCheckoutRadioButton();
        //2.19 Click on “Continue” tab
        checkoutPage.clickOnContinueButton();
        //2.20 Fill the mandatory fields
        checkoutPage.enterFirstname("Raja");
        checkoutPage.enterLastname("Gour");
        checkoutPage.enterEmail("raja25gour@gmail.com");
        checkoutPage.enterTelephone("07456764323");
        checkoutPage.enterAddress("18, Happy Residency");
        checkoutPage.enterCity("Surat");
        checkoutPage.enterPostcode("390002");
        checkoutPage.selectCountry("India");
        checkoutPage.selectState("Gujarat");
        //2.21 Click on “Continue” Button
        Thread.sleep(1000);
        checkoutPage.clickOnContinueGuestButton();
        //2.22 Add Comments About your order into text area
        checkoutPage.enterCommentsInTextArea("Please deliver it at the reception at delivery counter");
        //2.23 Check the Terms & Conditions check box
        Thread.sleep(1000);
        checkoutPage.clickOnTermsAndConditions();
        //2.24 Click on “Continue” button
        Thread.sleep(1000);
        checkoutPage.clickOnContinueToPaymentMethod();
        //2.25 Verify the message “Warning: Payment method required!”
        Thread.sleep(1000);
        Assert.assertEquals(checkoutPage.verifyWarningMessage(),"Warning: Payment method required!\n" +
                "×");


    }
}
