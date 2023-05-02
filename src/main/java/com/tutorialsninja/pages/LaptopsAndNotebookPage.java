package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;

public class LaptopsAndNotebookPage extends Utility {


    By sortByField= By.id("input-sort");
    By allProducts = By.xpath("//p[@class ='price']");
    By productMacBook = By.linkText("MacBook");


    public void selectSortByField(String sortOption ){
        selectByVisibleTextFromDropDown(sortByField, sortOption);
    }

    public void verifyReverseOrderOfProducts(String sortOption){
        verifySortedElementsInReverseOrder(allProducts,sortByField,sortOption);
    }

    public void clickOnProductMacBookLink(){
        clickOnElement(productMacBook);
    }


}
