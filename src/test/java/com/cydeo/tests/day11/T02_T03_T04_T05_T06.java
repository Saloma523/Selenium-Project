package com.cydeo.tests.day11;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class T02_T03_T04_T05_T06 {

    @BeforeMethod
    public void setupMethod(){
        Driver.getDriver().get("https://practice.cydeo.com/drag_and_drop_circles");
    }

    @AfterMethod
    public void teardownMethod(){
        Driver.closeDriver();
    }
    @Test
    public void test2_value_verification(){


        //TC2 #: Drag and drop default value verification
        //1. Go to https://practice.cydeo.com/drag_and_drop_circles



        //2. Verify big circle default text is as below.
        WebElement bigCircle = Driver.getDriver().findElement(By.xpath("//div[@id='droptarget']"));

        //3. Assert:
        //-Text in big circle changed to: “Drag the small circle here.”
        String actualTextInCircle = bigCircle.getText();
        String expectedTextInCircle = "Drag the small circle here.";
        Assert.assertTrue(actualTextInCircle.equals(expectedTextInCircle));



        //TC5 #: Drag and drop outside of the big circle
        //1. Go to https://practice.cydeo.com/drag_and_drop_circles
        //2. Drag and drop the small circle to bigger circle.
        //3. Assert:
        //-Text in big circle changed to: “Try again!”

        //2. Drag the small circle on top of the big circle, hold it, and verify.
        //3. Assert:
        //-Text in big circle changed to: “Now drop…


    }

    @Test
    public void test3_value_verification(){

        WebElement bigCircle = Driver.getDriver().findElement(By.xpath("//div[@id='droptarget']"));


        //TC3 #: Drag and drop into the big circle
        //1. Go to https://practice.cydeo.com/drag_and_drop_circles
        //2. Drag and drop the small circle to bigger circle.
        WebElement smallCircle = Driver.getDriver().findElement(By.xpath("//div[@id='draggable']"));

        Actions actions = new Actions(Driver.getDriver());

        //actions.dragAndDrop(smallCircle,bigCircle).perform();
        actions.clickAndHold(smallCircle).pause(1000).moveToElement(bigCircle).pause(1000).release().perform();


        //3. Assert:
        //-Text in big circle changed to: “You did great!”
        String actualTextInCircle = bigCircle.getText();
        String expectedTextInCircle = "You did great!";
        Assert.assertTrue(actualTextInCircle.equals(expectedTextInCircle));



    }

    @Test
    public void test4_value_verification(){

        WebElement bigCircle = Driver.getDriver().findElement(By.xpath("//div[@id='droptarget']"));


        //TC4 #:  Click and hold
        //1. Go to https://practice.cydeo.com/drag_and_drop_circles
        //2. Drag and drop the small circle to bigger circle.
        WebElement smallCircle = Driver.getDriver().findElement(By.xpath("//div[@id='draggable']"));

        Actions actions = new Actions(Driver.getDriver());

        //Click and hold the small circle.
        actions.clickAndHold(smallCircle)
                .pause(1000)
                .moveToElement(Driver.getDriver().findElement(By.linkText("CYDEO")))
                .perform();


        //3. Assert:
        //-Text in big circle changed to: “Drop here.”
        String actualTextInCircle = bigCircle.getText();
        String expectedTextInCircle = "Drop here.";
        Assert.assertTrue(actualTextInCircle.equals(expectedTextInCircle));

    }

    @Test
    public void test5_value_verification(){

        //TC5 #: Drag and drop outside of the big circle
        //1. Go to https://practice.cydeo.com/drag_and_drop_circles

        WebElement bigCircle = Driver.getDriver().findElement(By.xpath("//div[@id='droptarget']"));


        //2. Drag and drop the small circle to bigger circle.
        WebElement smallCircle = Driver.getDriver().findElement(By.xpath("//div[@id='draggable']"));

        Actions actions = new Actions(Driver.getDriver());

        //Click and hold the small circle.
        actions.clickAndHold(smallCircle)
                .pause(1000)
                .moveToElement(Driver.getDriver().findElement(By.linkText("CYDEO")))
                .release()
                .perform();


        //3. Assert:
        //-Text in big circle changed to: “Drop here.”
        String actualTextInCircle = bigCircle.getText();
        String expectedTextInCircle = "Try again!.";
        Assert.assertTrue(actualTextInCircle.equals(expectedTextInCircle));

    }

    @Test
    public void test6_value_verification(){

          //C6 #: Drag and hover
        //1. Go to https://practice.cydeo.com/drag_and_drop_circles
        WebElement bigCircle = Driver.getDriver().findElement(By.xpath("//div[@id='droptarget']"));


        //2. Drag and drop the small circle to bigger circle.
        WebElement smallCircle = Driver.getDriver().findElement(By.xpath("//div[@id='draggable']"));

        Actions actions = new Actions(Driver.getDriver());

        //Click and hold the small circle.
        actions.clickAndHold(smallCircle)
                .pause(1000)
                .moveToElement(bigCircle)
                .pause(1000)
                .perform();


        //3. Assert:
        //-Text in big circle changed to: “Drop here.”
        String actualTextInCircle = bigCircle.getText();
        String expectedTextInCircle = "Now drop...";
        Assert.assertTrue(actualTextInCircle.equals(expectedTextInCircle));

    }
}
/*
TC2 #: Drag and drop default value verification
1. Go to https://practice.cydeo.com/drag_and_drop_circles
2. Verify big circle default text is as below.
3. Assert:
-Text in big circle changed to: “Drag the small circle here.”
TC3 #: Drag and drop into the big circle
1. Go to https://practice.cydeo.com/drag_and_drop_circles
2. Drag and drop the small circle to bigger circle.
3. Assert:
-Text in big circle changed to: “You did great!”
TC4 #: Click and hold
1. Go to https://practice.cydeo.com/drag_and_drop_circles
2. Click and hold the small circle.
3. Assert:
-Text in big circle changed to: “Drop here.”
TC5 #: Drag and drop outside of the big circle
1. Go to https://practice.cydeo.com/drag_and_drop_circles
2. Drag and drop the small circle to bigger circle.
3. Assert:
-Text in big circle changed to: “Try again!”
TC6 #: Drag and hover
1. Go to https://practice.cydeo.com/drag_and_drop_circles
2. Drag the small circle on top of the big circle, hold it, and verify.
3. Assert:
-Text in big circle changed to: “Now drop…
 */