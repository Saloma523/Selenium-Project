package com.cydeo.tests.self_Practice.day02;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T01_WoodenSpoon {

    public static void main(String[] args) {

        //HWP #1: Etsy Title Verification
        //1. Open Chrome browser

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2. Go to https://www.etsy.com
        driver.get("https://www.etsy.com");

        //3. Search for “wooden spoon”
        //4. Verify title:

        WebElement searchBox = driver.findElement(By.name("search_query"));
        searchBox.click();

        searchBox.sendKeys("wooden spoon"+ Keys.ENTER);

        String expectedResult = "Wooden spoon - Etsy";
        String actualResult = driver.getTitle();

        if(actualResult.equals(expectedResult)){
            System.out.println("Title verification passed!");
        }else{
            System.out.println("Title verification failed!");
        }

        //Expected: “Wooden spoon - Ets
    }
}
