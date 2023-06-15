package com.cydeo.tests.day02_selenium_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T2_LinkedText_Practice {

    public static void main(String[] args) {

        //C #2: Back and forth navigation
        //1- Open a chrome browser


        WebDriverManager.chromedriver().setup();
        WebDriver  driver = new ChromeDriver();
        driver.manage().window().maximize();



       // 2- Go to: https://practice.cydeo.com
        driver.get("https://practice.cydeo.com");

        //- Click to A/B Testing from top of the list.
      WebElement abTestLing = driver.findElement(By.linkText("A/B Testing"));

      abTestLing.click();

        //4- Verify title is:
        //Expected: No A/B Test

        String expectedTitle = "No A/B Test";
        String actualTitle = driver.getCurrentUrl();

        if (expectedTitle.equals(actualTitle)) {

            System.out.println("test verification passed!!");
        }else{
            System.out.println("test verification failed!!");
        }

        //5- Go back to home page by using the .back();

        driver.navigate().back();

        expectedTitle = "Practice";
        actualTitle = driver.getTitle();


        //6- Verify title equals:
        //Expected: Practice

        if (expectedTitle.equals(actualTitle)) {

            System.out.println("test verification passed!!");
        }else{
            System.out.println("test verification failed!!");
        }
    }
}
/*
TC #2: Back and forth navigation
1- Open a chrome browser
2- Go to: https://practice.cydeo.com
3- Click to A/B Testing from top of the list.
4- Verify title is:
Expected: No A/B Test
5- Go back to home page by using the .back();
6- Verify title equals:
Expected: Practice

 */