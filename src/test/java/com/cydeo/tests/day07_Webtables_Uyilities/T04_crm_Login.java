package com.cydeo.tests.day07;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.CRM_Utilities;
import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class T04_crm_Login {

    WebDriver driver;

    @BeforeMethod
    public void setupMethod(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get(" https://login1.nextbasecrm.com/");
    }
    @Test
    public void test1_crm_login(){


        CRM_Utilities.login_crm(driver);// login in using the utility method we created in crm class

        //6. Verify title is as expected:
        //Expected: Portal
       // BrowserUtils.verifyTitle(driver,"(2)Portal");


        //USERNAME PASSWORD
        //helpdesk1@cydeo.com UserUser
        //helpdesk2@cydeo.com UserUse
    }
}
