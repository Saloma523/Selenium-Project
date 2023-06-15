package com.cydeo.tests.day05;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class T02 {

    public static void main(String[] args) {

        //XPATH PRACTICES
        //DO NOT USE ANY DEVELOPER TOOLS TO GET ANY LOCATORS.
        //TC #2: Radiobutton handling
        //1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //2. Go to https://practice.cydeo.com/radio_buttons
        driver.get("https://practice.cydeo.com/radio_buttons");

        //3. Click to “Hockey” radio button
        WebElement hockeyRadioButton = driver.findElement(By.xpath("//input[@type='radio']"));
        hockeyRadioButton.click();

        //4. Verify “Hockey” radio button is selected after clicking.
        if(hockeyRadioButton.isSelected()){
            System.out.println("Hockey radio button verification button is passed!!");
        }else{
            System.out.println("Hockey radio button verification button is failed!!");
        }
        //USE XPATH LOCATOR FOR ALL WEBELEMENT LOCATORS
    }
}
