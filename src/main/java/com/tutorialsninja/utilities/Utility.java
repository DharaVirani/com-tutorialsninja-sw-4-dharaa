package com.tutorialsninja.utilities;


import com.tutorialsninja.browserfactory.ManageBrowser;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Jay Vaghani
 */
public class Utility extends ManageBrowser { //we need driver which is in BaseTest
    /**
     * This method will click on element
     */
    public void clickOnElement(By by){  //locator return type is By and by is variable
        driver.findElement(by).click();
    }
    /**
     * This method will send keys to element
     */
    public void sendTextToElement(By by, String text){
      driver.findElement(by).sendKeys(text);
    }
    /**
     * This method will get text from element
     */
    public String getTextElement(By by){
        return driver.findElement(by).getText();
    }



    //*************************** Select Class Methods ***************************************//
    /**
     *This method is to select option from the dropdown list using it;s inner text
     */
    public void selectByVisibleTextFromDropDown(By by, String text){
        WebElement element = driver.findElement(by);
        Select select = new Select(element);
        select.selectByVisibleText(text);
    }



    /**
     * This method is to get option from drop down list
     */
    public void getOptions(By by,String text){
     List <WebElement> elements = driver.findElements(by);
     for(WebElement element:elements){
       if(element.getText().equalsIgnoreCase(text)){
           element.click();
           break;
       }
     }
    }

    /**
     *This method is to work with list of elements
     */
    public void listOfElements(By by,String text){
        List<WebElement> elements = driver.findElements(by);
            try{
            for (WebElement element:elements){
                if(element.getText().equalsIgnoreCase(text)) {
                    element.click();
                    break;
                }
                }

            }catch (StaleElementReferenceException e) {
            elements= driver.findElements(by);
        }

    }



    /**
     * This method will use to hover mouse on element and click
     */
    public void mouseHoverToElementAndClick(By by) {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(by)).click().build().perform();
    }


    //************************** Waits Methods *********************************************//

    /**
     * This method will use to wait until  VisibilityOfElementLocated
     */
    public WebElement waitUntilVisibilityOfElementLocated(By by, int time) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
        return wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }



    //************************** Verification *********************************************//
    /**
     * This method is to verify the text
     */
    public void verifyText(String displayMessage, String expectedText, String actualText) {

    }

    /**
     * This method is to verify that sorting is done in reverse order or not
     */
    public void verifySortedElementsInReverseOrder(By by, By by1, String sortName) {
        List<WebElement> elements = driver.findElements(by);
        ArrayList<String> originalElementList = new ArrayList<>();
        for (WebElement e : elements) {
            originalElementList.add(e.getText());
        }
        System.out.println(originalElementList);

        Collections.reverse(originalElementList);
        System.out.println(originalElementList);

        selectByVisibleTextFromDropDown(by1, sortName);

        elements = driver.findElements(by);
        ArrayList<String> afterSortByReverseList = new ArrayList<>();
        for (WebElement e : elements) {
            afterSortByReverseList.add(e.getText());
        }
        System.out.println(afterSortByReverseList);


    }

    /**
     * This method is to clear the texField
     */

    public void clearField(By by){
        driver.findElement(by).clear();
    }
}







