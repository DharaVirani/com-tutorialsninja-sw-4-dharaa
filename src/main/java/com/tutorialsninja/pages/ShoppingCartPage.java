package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;

public class ShoppingCartPage extends Utility {

    By shoppingCartText = By.xpath("//div[@id='content']//h1");
    By productNameText = By.xpath("//div[@class = 'table-responsive']/table/tbody/tr/td[2]/a");
    By deliveryDateText = By.xpath("//div[@class = 'table-responsive']/table/tbody/tr/td[2]/small[1]");
    By productModelText = By.xpath("//div[@class = 'table-responsive']/table/tbody/tr/td[3]");
    By totalPrice = By.xpath("//div[@class = 'table-responsive']/table/tbody/tr/td[6]");
    By updateTab = By.xpath("//button[contains(@data-original-title, 'Update')]");
    By modificationMessage = By.xpath("//div[@id='checkout-cart']/div[1]");
    By qtyField = By.xpath("//input[contains(@name, 'quantity')]");
    By checkoutLink = By.xpath("//a[@class='btn btn-primary']");




    public String verifyShoppingCartTitle(){
        return getTextElement(shoppingCartText);
    }

    public String verifyProductName(){
        waitUntilVisibilityOfElementLocated(productNameText,5);
        return getTextElement(productNameText);
    }

    public String verifyDeliveryDate(){
        return getTextElement(deliveryDateText);
    }

    public String verifyProductModel(){
        return getTextElement(productModelText);
    }

    public String verifyTotalPrice(){
        return getTextElement(totalPrice);
    }

    public void clickOnUpdateButton(){
        clickOnElement(updateTab);
    }

    public String verifyModificationMessage(){
       return getTextElement(modificationMessage);
    }

    public void changeQtyField(String qty){
      clearField(qtyField);
      sendTextToElement(qtyField,qty);
    }

    public void clickOnCheckOutButton(){
        clickOnElement(checkoutLink);
    }
}
