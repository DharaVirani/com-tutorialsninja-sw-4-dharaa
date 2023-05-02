package com.tutorialsninja.testsuite;

import com.tutorialsninja.pages.DesktopPage;
import com.tutorialsninja.pages.HomePage;
import com.tutorialsninja.pages.ProductPage;
import com.tutorialsninja.pages.ShoppingCartPage;
import com.tutorialsninja.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DesktopTest extends BaseTest {
    HomePage homePage= new HomePage();
    DesktopPage desktopPage = new DesktopPage();
    ProductPage productPage = new ProductPage();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();

    @Test
    public void verifyProductArrangeInAlphabeticalOrder(){
        //1.1 Mouse hover on Desktops Tab.and click
       homePage.mouseHoverAndClickOnDesktopTab();
        //1.2 Click on “Show All Desktops”
       homePage.mouseHoverAndClickOnShowAllDeskTops();
        //1.3 Select Sort By position "Name: Z to A"
        desktopPage.selectSortField("Name (Z - A)");
        //1.4 Verify the Product will arrange in Descending order.
       desktopPage.verifyDesktopProductsSortedInReverseOrder();


    }
    @Test
    public void verifyProductAddedToShoppingCartSuccessFully(){
        // Select currency as £ Pound Sterling
        homePage.selectCurrency("£Pound Sterling");
        //2.1 Mouse hover on Desktops Tab. and click
        homePage.mouseHoverAndClickOnDesktopTab();
        //2.2 Click on “Show All Desktops”
        homePage.mouseHoverAndClickOnShowAllDeskTops();
        //2.3 Select Sort By position "Name: A to Z"
        desktopPage.selectSortField("Name (A - Z)");
        //2.4 Select product “HP LP3065”
        desktopPage.clickOnProductHPLP3065();
        //2.5 Verify the Text "HP LP3065"
        verifyText("Invalid title", "HP LP3065",productPage.verifyHPLP3065TitleOfDesktops());
        //2.6 Select Delivery Date "2023-11-30"
        productPage.selectDeliveryDate();
        //2.7.Enter Qty "1” using Select class.
        productPage.changeQtyField("1");
        //2.8 Click on “Add to Cart” button
        productPage.clickOnAddToCartButton();
        //2.9 Verify the Message “Success: You have added HP LP3065 to your shopping cart!”
        Assert.assertEquals( productPage.verifyAddedToCartMessage(),"Success: You have added HP LP3065 to your shopping cart!");
        //2.10 Click on link “shopping cart” display into success message
        productPage.clickOnShoppingCartLink();
        //2.11 Verify the text "Shopping Cart"
        verifyText("Invalid title", "Shopping Cart",shoppingCartPage.verifyShoppingCartTitle());
        //2.12 Verify the Product name "HP LP3065"
        verifyText("Invalid product name", "HP LP3065", shoppingCartPage.verifyProductName());
        //2.13 Verify the Delivery Date "2022-11-30"
        verifyText("Invalid delivery date", "2023-11-30", shoppingCartPage.verifyDeliveryDate());
        //2.14 Verify the Model "Product21"
        verifyText("Invalid product model", "Product 21", shoppingCartPage.verifyProductModel());
        //2.15 Verify the Todat "£74.73"
        verifyText("Invalid total price", "£74.73", shoppingCartPage.verifyTotalPrice());
    }
}
