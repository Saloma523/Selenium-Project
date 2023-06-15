package com.cydeo.utilities;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.util.Set;

// this class will be storing only the utility methods that can be used across the project
public class BrowserUtils {
   // this method will accept int
    public static void sleep(int second){
        second*= 1000;
        try{
            Thread.sleep(second);
        }catch (InterruptedException e){

        }
    }

    public static void switchWindowAndVerify(WebDriver driver, String expectedUrl, String expectedInTitle){

        //return and store all the window handles in a set
        Set<String> allWindowHandles = driver.getWindowHandles();

        for (String each : allWindowHandles) {

            driver.switchTo().window(each);

            if(driver.getCurrentUrl().contains(expectedUrl)){
                break;
            }

        }

       // String  expectedTitle = "Etsy";
        String actualTitle = driver.getTitle();

        Assert.assertTrue(actualTitle.contains(expectedInTitle));
    }


    public static void verifyTitle(WebDriver driver, String expectedTitle){
       Assert.assertEquals(driver.getTitle(),expectedTitle);
    }

    public static void verifyTitleContains(WebDriver driver, String expectedInTitle){
        Assert.assertTrue(driver.getTitle().contains(expectedInTitle));
    }





}
