package com.cydeo.tests.day04;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T01 {

    public static void main(String[] args) {


        //XPATH and CSS Selector PRACTICES
        //DO NOT USE ANY DEVELOPER TOOLS TO GET ANY LOCATORS.
        //TC #1: XPATH and cssSelector Practices
        //1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //2. Go to https://practice.cydeo.com/forgot_password
        driver.get("https://practice.cydeo.com/forgot_password");

        //3. Locate all the WebElements on the page using XPATH and/or CSS
        //locator only (total of 6)
        //a. “Home” link
        WebElement homeLinkEX1 = driver.findElement(By.cssSelector("a[class='nav-link']"));
        WebElement homeLinkEX2 = driver.findElement(By.cssSelector("a.nav-link"));
        WebElement homeLinkEX3 = driver.findElement(By.cssSelector("a[href='/']"));

        //b. “Forgot password” header

        WebElement headerEX2 = driver.findElement(By.xpath("//h2[.= 'Forgot Password']"));
        WebElement headerEX3 = driver.findElement(By.xpath("div[class='example']>h2"));WebElement headerEX4 = driver.findElement(By.xpath("div.example > h2"));

        //c. “E-mail” text
        WebElement emailTextEx1 = driver.findElement(By.xpath("//label[@for= 'email']"));
        WebElement emailTextEx2 = driver.findElement(By.xpath("//label[.= 'E-mail']"));

        //d. E-mail input box
        WebElement emailBoxEX1= driver.findElement(By.cssSelector("input[type='text']"));
        //WebElement emailBoxEX2= driver.findElement(By.xpath("//input[@contains(pattern,'a-z')]"));

        //e. “Retrieve password” button
        WebElement passwordButtonEX1 = driver.findElement(By.xpath("//button[@id='form_submit']"));

        //f. “Powered by Cydeo text
        WebElement poweredByCydeo = driver.findElement(By.xpath("//div[@style='text-align: center;']"));

        //4. Verify all web elements are displayed.
        System.out.println("homeLinkEX1.isDisplayed() = " + homeLinkEX1.isDisplayed());
        System.out.println("homeLinkEX2.isDisplayed() = " + homeLinkEX2.isDisplayed());
        System.out.println("emailTextEx1.isDisplayed() = " + emailTextEx1.isDisplayed());
        System.out.println("emailBoxEX1.isDisplayed() = " + emailBoxEX1.isDisplayed());
        System.out.println("passwordButtonEX1.isDisplayed() = " + passwordButtonEX1.isDisplayed());
        //System.out.println("poweredByCydeo.isDisplayed() = " + poweredByCydeo.isDisplayed());



       driver.quit();
        //First solve the task with using cssSelector only. Try to create 2 different
        //cssSelector if possible
        //Then solve the task using XPATH only. Try to create 2 different
        //XPATH locator if possibl
    }
}
