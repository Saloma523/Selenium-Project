package com.cydeo.tests.DAY12;

import com.cydeo.pages.DynamicsControlPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.apache.commons.lang3.exception.ExceptionContext;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class T02 {
    DynamicsControlPage dynamicsControlPage;
    @BeforeMethod
    public void setupMethod(){


        //TC #2: Explicit wait practice
        //1- Open a chrome browser
        //2- Go to: https://practice.cydeo.com/dynamic_controls
        Driver.getDriver().get("https://practice.cydeo.com/dynamic_controls");
       dynamicsControlPage= new DynamicsControlPage();
    }

    @AfterMethod
    public void terDownMethod(){
        Driver.closeDriver();
    }

    @Test
    public void t02_explicit_wait_practice(){



        //3- Click to “Remove” button
        //creat the object of WebdriverWait class and set up the constructor args

        dynamicsControlPage.removeButton.click();

        //4- Wait until “loading bar disappears”
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),Duration.ofSeconds(10));
        wait.until(ExpectedConditions.invisibilityOf(dynamicsControlPage.loadingBar));

        //5- Verify:
        //a. Checkbox is not displayed
        try{
            Assert.assertFalse(dynamicsControlPage.checkBox.isDisplayed());
        }catch (NoSuchElementException n){
            //n.printStackTrace();


        }



        //b. “It’s gone!” message is displayed.

        Assert.assertTrue(dynamicsControlPage.itsGoneMessage.isDisplayed());
        //NOTE: FOLLOW POM
    }

    @Test
    public void t03_explicit_wait_practice(){


        //TC #3: Explicit wait practice
        //1- Open a chrome browser
        //2- Go to: https://practice.cydeo.com/dynamic_controls


        //3- Click to “Enable” button
        dynamicsControlPage.enableButton.click();

        //4- Wait until “loading bar disappears”
        //using custom method to wait for the loading bar to disappears
        BrowserUtils.waitForInvisibilityOf(dynamicsControlPage.enableButton);


        //5- Verify:
        //a. Input box is enabled.
        Assert.assertTrue(dynamicsControlPage.inputBox.isEnabled());

        //b. “It’s enabled!” message is displayed.
        //Assert.assertTrue(dynamicsControlPage.isEnabledMessage.isDisplayed());

        Assert.assertTrue(dynamicsControlPage.isEnabledMessage.getText().equals("It' enabled!"));
        //NOTE: FOLLOW POM


    }
}
