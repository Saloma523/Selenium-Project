package com.cydeo.tests.day11;

import com.cydeo.pages.LibraryLoginPage;
import com.cydeo.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class T07_T08_T09 {
    LibraryLoginPage loginPage;

    @BeforeMethod
    public void setupMethod(){
        //TC #7: Required field error message test
        //1- Open a chrome browser
        //2- Go to: https://library1.cydeo.com
        Driver.getDriver().get("https://library1.cydeo.com");

        loginPage = new LibraryLoginPage();


    }

    @AfterMethod
    public void tearDownMethod(){
        Driver.closeDriver();
    }

    @Test
    public void t7_field_required_error_message_test(){


        //4- Click to “Sign in” button
        loginPage.signInButton.click();


        //5- Verify expected error is displayed:
        //Expected: This field is required.
        Assert.assertTrue(loginPage.filedRequiredErrorMessage.isDisplayed());


        //NOTE: FOLLOW POM DESIGN PATTERN
    }

    @Test
    public void t8_(){

        //3- Enter invalid email format
       loginPage.emailBox.sendKeys("username");
       loginPage.signInButton.click();
        //4- Verify expected error is displayed:
        //Expected: Please enter a valid email address.
        Assert.assertTrue(loginPage.errorMessage.isDisplayed());

        //NOTE: FOLLOW POM DESIGN PATTERN
    }

    @Test
    public void t9_wrong_Email_Or_Password_Error_Message(){

        //TC #9: Library negative login
        //1- Open a chrome browser
        //2- Go to: https://library1.cydeo.com

        //3- Enter incorrect username or incorrect password
        loginPage.emailBox.sendKeys("saloma523@yahoo.com");
        loginPage.passwordBox.sendKeys("incorrect");
        loginPage.signInButton.click();

        //4- Verify title expected error is displayed:
        //Expected: Sorry, Wrong Email or Password
        Assert.assertTrue(loginPage.wrongEmailOrPasswordMessage.isDisplayed());
        //NOTE: FOLLOW POM DESIGN PATTERN
    }
}
