package com.tutorialsninja.testsuite;

import com.tutorialsninja.pages.*;
import com.tutorialsninja.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TopMenuTest extends BaseTest {

    HomePage homePage= new HomePage();


    @Test
    public void verifyUserShouldNavigateToDesktopsPageSuccessfully()  {
        //1.1 Mouse hover on “Desktops” Tab and click
        homePage.mouseHoverAndClickOnDesktopTab();
        //1.2 call selectMenu method and pass the menu = “Show AllDesktops”
        homePage.allSelectMenu("Show AllDesktops");
        //1.3 Verify the text ‘Desktops’
        Assert.assertEquals(homePage.verifyTextOfDesktopTab(), "Desktops");

    }

    @Test
    public void verifyUserShouldNavigateToLaptopsAndNotebooksPageSuccessfully()  {
        //2.1 Mouse hover on “Laptops & Notebooks” Tab and click
        homePage.mouseHoverAndClickOnLaptopsAndNotebooksTab();
        //2.2 call selectMenu method and pass the menu = “Show AllLaptops & Notebooks”
        homePage.allSelectMenu("Show AllLaptops & Notebooks");
        //2.3 Verify the text ‘Laptops & Notebooks’
        Assert.assertEquals(homePage.verifyTextOfLaptopsAndNotebooksTab(), "Laptops & Notebooks");
    }

    @Test
    public void verifyUserShouldNavigateToComponentsPageSuccessfully(){
        //3.1 Mouse hover on “Components” Tab and click
        homePage.mouseHoverAndClickOnComponentsTab();
        //3.2 call selectMenu method and pass the menu = “Show AllComponents”
        homePage.allSelectMenu("Show AllComponents");
        //3.3 Verify the text ‘Components’
        Assert.assertEquals(homePage.verifyTextOfComponentsTab(), "Components");

    }
}
