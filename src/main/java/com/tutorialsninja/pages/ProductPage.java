package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;

public class ProductPage extends Utility {



    By productHPLP3065TitleText = By.xpath("//h1[contains(text(),'HP LP3065')]");
    By dateButton = By.xpath("//div[@class='input-group date']//button[@type='button']");
    By monthAndYearTitle = By.xpath("//div[@class = 'datepicker']/div[1]//th[@class='picker-switch']");
    By allDates = By.xpath("//div[@class = 'datepicker']/div[1]//tbody/tr/td[@class = 'day']");
    By nextTabDate = By.xpath("//div[@class = 'datepicker']/div[1]//th[@class='next']");
    By qtyField = By.name("quantity");
    By addToCartButton = By.xpath("//button[@id='button-cart']");
    By addedToCartMessage = By.xpath("//div[@class='alert alert-success alert-dismissible']");
    By shoppingCartLink = By.xpath("//span[contains(text(),'Shopping Cart')]");
    By productMacBookText = By.xpath("//h1[contains(text(),'MacBook')]");


    public String verifyHPLP3065TitleOfDesktops(){
        return getTextElement(productHPLP3065TitleText);
    }

    public void selectDeliveryDate(){
        String year = "2023";
        String month = "November";
        String date = "30";
        waitUntilVisibilityOfElementLocated(dateButton,5);
        clickOnElement(dateButton);
        while (true) {
            String monthAndYear = getTextElement(monthAndYearTitle);
            String[] arr = monthAndYear.split(" ");
            String mon = arr[0];
            String yer = arr[1];
            if (mon.equalsIgnoreCase(month) && yer.equalsIgnoreCase(year)) {
                break;
            } else {
                waitUntilVisibilityOfElementLocated(nextTabDate,10);
                clickOnElement(nextTabDate);
            }
        }
        listOfElements(allDates,date);
    }

    public void changeQtyField(String qty){
        clearField(qtyField);
        sendTextToElement(qtyField,qty);
    }

    public void clickOnAddToCartButton(){
        waitUntilVisibilityOfElementLocated(addToCartButton,5);
        clickOnElement(addToCartButton);
    }

    public String verifyAddedToCartMessage(){
        waitUntilVisibilityOfElementLocated(addedToCartMessage,5);
       return getTextElement(addedToCartMessage);
    }

    public void clickOnShoppingCartLink(){
        waitUntilVisibilityOfElementLocated(shoppingCartLink,5);
        clickOnElement(shoppingCartLink);
    }

    public String verifyProductMacbookText(){
       return getTextElement(productMacBookText);
    }
}
