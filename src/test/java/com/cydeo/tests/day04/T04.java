package com.cydeo.tests.day04;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class T04 {

    public static void main(String[] args) {

        //TC #4: StaleElementReferenceException Task
        //1- Open a chrome browser
        //TC#3: Checkboxes
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        //2- Go to: https://practice.cydeo.com/abtest
        driver.get("https://practice.cydeo.com/abtest");

        //3- Locate “CYDEO” link, verify it is displayed.
        WebElement cydeoLink = driver.findElement(By.cssSelector("a[target='_blank']"));
        System.out.println("Before refresh: cydeoLink.isDisplayed() = " + cydeoLink.isDisplayed());

        //4- Refresh the page.
        driver.navigate().refresh();


        //5- Verify it is displayed, again.
        cydeoLink = driver.findElement(By.cssSelector("a[target='_blank']"));
        System.out.println("After refresh: cydeoLink.isDisplayed() = " + cydeoLink.isDisplayed());
        //This is a simple StaleElementReferenceException to understand what is
        //this exception and how to handle it
    }
}
