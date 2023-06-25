package com.cydeo.tests.day11;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class T01 {

    @Test
    public void scroll_using_JavascriptExecutor_test(){

        Driver.getDriver().get("https://practice.cydeo.com/large");

        WebElement homeLink = Driver.getDriver().findElement(By.xpath("//a[text() = 'Home']"));
        WebElement cydeoLink = Driver.getDriver().findElement(By.xpath("//a[text() = 'CYDEO']"));

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

        js.executeScript("arguments[0].scrollIntoView(true)",cydeoLink,homeLink);


        js.executeScript("arguments[1].scrollIntoView(true)",cydeoLink,homeLink);

    }
}
//TC #1: Scroll using JavascriptExecutor
//1- Open a chrome browser
//2- Go to: https://practice.cydeo.com/large
//3- Scroll down to “Cydeo” link
//4- Scroll up to “Home” link
//5- Use below provided JS method only
//JavaScript method to use : arguments[0].scrollIntoView(true)
//Note: You need to locate the links as web elements and pass them as
//arguments into executeScript() metho