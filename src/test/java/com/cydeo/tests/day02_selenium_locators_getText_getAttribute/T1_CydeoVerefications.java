package com.cydeo.tests.day02_selenium_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1_CydeoVerefications {

    public static void main(String[] args) {
        //  TC #1: Cydeo practice tool verifications
       // 1. Open Chrome browser

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

       // 2. Go to https://practice.cydeo.com
        driver.navigate().to("https://practice.cydeo.com");

        //3. Verify URL contains
        //Expected: cydeo
        String expectedInUrl = "cydeo";
        String actualUrl = driver.getCurrentUrl();

        if(actualUrl.contains(expectedInUrl)){
            System.out.println("URL verification passed!!");
        }else{
            System.out.println("URL verification failed!!");
        }

        //Verify title:
        // Expected: Practic
        String expectedTitle = "Practice";
        String actualTitle = driver.getTitle();

        if(actualUrl.equals(expectedInUrl)){
            System.out.println("title verifications passed!!");
        }else{
            System.out.println("title verifications failed!!");

        }

        driver.quit();


    }

    /*
    TC #1: Cydeo practice tool verifications
1. Open Chrome browser
2. Go to https://practice.cydeo.com
3. Verify URL contains
Expected: cydeo
4. Verify title:
 Expected: Practic
     */
}
