package com.cydeo.tests.day10;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class T04_T05 {


    @Test
    public void scroll_test(){

        Driver.getDriver().get("https://practice.cydeo.com/");

        WebElement poweredByCydeoLink =Driver.getDriver().findElement(By.linkText("CYDEO"));

        Actions actions = new Actions(Driver.getDriver());

        actions.moveToElement(poweredByCydeoLink).perform(); // this will do the scrolling action


        //2- Scroll back up to “Home” link using PageUP button
        actions.sendKeys(Keys.PAGE_UP,Keys.PAGE_UP,Keys.PAGE_UP).perform();

        Driver.closeDriver();





    }
}
//TC #4: Scroll practice
//1- Open a chrome browser
//2- Go to: https://practice.cydeo.com/
//3- Scroll down to “Powered by CYDEO”
//4- Scroll using Actions class “moveTo(element)” method


//TC #5: Scroll practice 2
//1- Continue from where the Task 4 is left in the same test.
//2- Scroll back up to “Home” link using PageUP buttoHo