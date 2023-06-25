package com.cydeo.tests.day10;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import com.cydeo.utilities.TestBase;
import com.cydeo.utilities.WebDriverFactory;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class T01_registration_from_confirmation extends TestBase {



    @Test
    public void Registration_form_confirmation_test(){



      Driver.getDriver().get(ConfigurationReader.getProperty("RegistrationFormURL"));

       Faker faker = new Faker();

        WebElement firstNameBox = Driver.getDriver().findElement(By.xpath("//input[@name='firstname']"));
        firstNameBox.sendKeys(faker.name().firstName());

        WebElement lastNameBox = Driver.getDriver().findElement(By.xpath("//*[@placeholder='last name']"));
        lastNameBox.sendKeys(faker.name().lastName());

        WebElement userNameBox = Driver.getDriver().findElement(By.xpath("//*[@placeholder='username']"));
        userNameBox.sendKeys("salmaMohamed");

        WebElement emailBox = Driver.getDriver().findElement(By.xpath("//*[@name='email']"));
        emailBox.sendKeys("saloma523@yahoo.com");

        WebElement passwordBox = Driver.getDriver().findElement(By.cssSelector("input[type='password']"));
        passwordBox.sendKeys("salma5232");

        WebElement phoneNumber = Driver.getDriver().findElement(By.cssSelector("input[data-bv-field='phone']"));
        phoneNumber.sendKeys("571-277-3384");

       WebElement radiobuttonFemail = Driver.getDriver().findElement(By.xpath("//input[@value='female']"));
       radiobuttonFemail.click();

       WebElement dateOfBirthBox = Driver.getDriver().findElement(By.xpath("//input[@name='birthday']"));
       dateOfBirthBox.sendKeys("12/15/2020");

       Select departmentDropDown = new Select(Driver.getDriver().findElement(By.name("department")));
       departmentDropDown.selectByValue("DE");

       Select jobTitle = new Select(Driver.getDriver().findElement(By.xpath("//select[@name='job_title']")));
       jobTitle.selectByVisibleText("SDET");

       WebElement programmingLanguageBox = Driver.getDriver().findElement(By.xpath("//input[@value='java']"));
       programmingLanguageBox.click();

     WebElement signInButton = Driver.getDriver().findElement(By.xpath("//button[@type='submit']"));
     signInButton.click();

     WebElement sucsessMessage = Driver.getDriver().findElement(By.xpath("//div[@role='alert']"));
     Assert.assertTrue(sucsessMessage.isDisplayed());

     Driver.closeDriver();











    }
}
//TC#1: Registration form confirmation
//1. Open browser
//2. Go to website: https://practice.cydeo.com/registration_form
//3. Enter first name
//4. Enter last name
//5. Enter username
//6. Enter email address
//7. Enter password
//8. Enter phone number
//9. Select a gender from radio buttons
//10.Enter date of birth
//11.Select Department/Office
//12.Select Job Title
//13.Select programming language from checkboxes
//14.Click to sign up button
//15.Verify success message “You’ve successfully completed registration.” is
//displayed