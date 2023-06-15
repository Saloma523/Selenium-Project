package com.cydeo.tests.day05;

import com.cydeo.utilities.WebDriverFactory;
import org.asynchttpclient.util.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class T05 {
    WebDriver driver;
    @BeforeMethod
    public void setupMethod(){

        //TC#5: Verifying “Simple dropdown” and “State selection” dropdown
        //default values
        //1. Open Chrome browser
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //2. Go to https://practice.cydeo.com/dropdown
        driver.get("https://practice.cydeo.com/dropdown");

    }

    @Test
    public void simple_dropdown_verifying(){


        //3. Verify “Simple dropdown” default selected value is correct
        //Expected: “Please select an option”

        //4. Verify “State selection” default selected value is correct
        //Expected: “Select a State”
        WebElement simpleDropdown = driver.findElement(By.xpath("//select[@id='dropdown']"));

        // creating select object and pathing simple dropdown in the constructor
        Select select = new Select(simpleDropdown );

        String expectedSimpleDropdown = "Please select an option";
        String actualSimpleDropdown = select.getFirstSelectedOption().getText();

        Assert.assertEquals(actualSimpleDropdown,expectedSimpleDropdown);


    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
