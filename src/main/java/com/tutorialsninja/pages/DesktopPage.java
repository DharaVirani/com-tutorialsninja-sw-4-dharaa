package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;

public class DesktopPage extends Utility {
    /**
     * //1.3 Verify the text ‘Desktops’
     */

    /**
     * //1.1 Mouse hover on Desktops Tab.and click
     * //1.2 Click on “Show All Desktops”
     * //1.3 Select Sort By position "Name: Z to A"
     * //1.4 Verify the Product will arrange in Descending order.
     */

    /**
     * // Select currency as £ Pound Sterling
     * //2.1 Mouse hover on Desktops Tab. and click
     * //2.2 Click on “Show All Desktops”
     * //2.3 Select Sort By position "Name: A to Z"
     * //2.4 Select product “HP LP3065”
     * //2.5 Verify the Text "HP LP3065"
     * //2.6 Select Delivery Date "2023-11-30"
     * //2.7.Enter Qty "1” using Select class
     * //2.8 Click on “Add to Cart” button
     * //2.9 Verify the Message “Success: You have added HP LP3065 to your shopping cart!”
     * //2.10 Click on link “shopping cart” display into success message
     */

    By sortField = By.id("input-sort");
    By allProductListLinks = By.xpath("//h4/a");
    By productHPLP3065 = By.xpath("//a[contains(text(),'HP LP3065')]");


    public void verifyDesktopProductsSortedInReverseOrder(){

        verifySortedElementsInReverseOrder(allProductListLinks, sortField, "Name (Z - A)");

    }

    public void selectSortField(String sortOption){
        selectByVisibleTextFromDropDown(sortField, sortOption);
    }

    public void clickOnProductHPLP3065(){
        clickOnElement(productHPLP3065);
    }




}
