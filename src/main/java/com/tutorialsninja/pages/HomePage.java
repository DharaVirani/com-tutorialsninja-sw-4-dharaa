package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {





    By allTopMenuList = By.xpath("//nav[@id='menu']//ul/li[contains(@class, 'open')]/div/child::*");
    By desktopsTab = By.linkText("Desktops");
    By desktopsText = By.xpath("//h2[contains(text(),'Desktops')]");
    By laptopsAndNotebooksTab = By.linkText("Laptops & Notebooks");
    By laptopsAndNotebooksText = By.xpath("//h2[contains(text(),'Laptops & Notebooks')]");
    By componentsTab = By.linkText("Components");
    By componentsText = By.xpath("//h2[contains(text(),'Components')]");
    By currencyDropDownField = By.xpath("//span[contains(text(),'Currency')]");
    By allDropdownCurrencyList = By.xpath("//ul[@class = 'dropdown-menu']/li");
    By showAllDesktopsLink = By.linkText("Show AllDesktops");
    By showAllLaptopsAndNotebooks = By.linkText("Show AllLaptops & Notebooks");


    public void mouseHoverAndClickOnShowAllDeskTops(){
        waitUntilVisibilityOfElementLocated(showAllDesktopsLink,5);
        mouseHoverToElementAndClick(showAllDesktopsLink);
    }

    public void allSelectMenu(String menu){

       listOfElements(allTopMenuList,menu);
    }


    public void mouseHoverAndClickOnDesktopTab(){
        mouseHoverToElementAndClick(desktopsTab);
    }


    public String verifyTextOfDesktopTab(){
       return getTextElement(desktopsText);
    }


    public void mouseHoverAndClickOnLaptopsAndNotebooksTab(){
        mouseHoverToElementAndClick(laptopsAndNotebooksTab);
    }

    public String verifyTextOfLaptopsAndNotebooksTab(){
        return getTextElement(laptopsAndNotebooksText);
    }



    public void mouseHoverAndClickShowAllLaptopsAndNotebooksMenu(){
       mouseHoverToElementAndClick(showAllLaptopsAndNotebooks);
    }

    public void mouseHoverAndClickOnComponentsTab(){
        mouseHoverToElementAndClick(componentsTab);
    }

    public String verifyTextOfComponentsTab(){
        return getTextElement(componentsText);
    }

    public void selectCurrency(String currency){
        waitUntilVisibilityOfElementLocated(currencyDropDownField,10);
        clickOnElement(currencyDropDownField);
        waitUntilVisibilityOfElementLocated(allDropdownCurrencyList,10);
        getOptions(allDropdownCurrencyList,currency);
    }

}
