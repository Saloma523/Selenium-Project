package com.cydeo.tests.day03_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T04 {

    public static void main(String[] args) {

        //TC #4: NextBaseCRM, locators, getText(), getAttribute() practice
        //1- Open a chrome browser

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //2- Go to: https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");

        //3- Verify “Log in” button text is as expected:
        //Expected: Log In

        //tagName[attribute = 'value']


        String expectedLoginText = "Log In";

        //tagName[@attribute='value]
        //locating loginButton using xpath using type attributes value
        WebElement login = driver.findElement(By.xpath("//input[@type='submit']"));
        // get me input were value =login

        String actualLoginText = login.getAttribute("value");

        if(actualLoginText.equals(expectedLoginText)){
            System.out.println("login verification passed!");
        }else{
            System.out.println("login verification failed!");
        }
        //PS: Inspect and decide which locator you should be using to locate web
        //elements.
        //PS2: Pay attention to where to get the text of this button fro
    }
}
