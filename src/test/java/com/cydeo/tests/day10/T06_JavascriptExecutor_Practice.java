package com.cydeo.tests.day10;

import com.cydeo.tests.day09.JavaFakerPractice;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class T06_JavascriptExecutor_Practice {

    @Test
    public void infinite_scroll_test_using_JSExecutor(){

        Driver.getDriver().get("https://practice.cydeo.com/infinite_scroll");

        // (JavascriptExecutor) Driver.getDriver().executeScript("window.scrollBy(0,750)");
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

        //window.scrollBy(x,y)
        //b. 750 pixels up 10 times
        for (int i = 0; i < 10; i++) {

            js.executeScript("window.scrollBy(0,750)");
        }


        for (int i = 0; i < 10; i++) {

            js.executeScript("window.scrollBy(0,-750)");

            Driver.closeDriver();
        }

    }
}
//TC #6: Scroll using JavascriptExecutor
//1- Open a chrome browser
//2- Go to: https://practice.cydeo.com/infinite_scroll
//3- Use below JavaScript method and scroll
//a. 750 pixels down 10 times.
//b. 750 pixels up 10 times
//JavaScript method to use : window.scrollBy(0,0)