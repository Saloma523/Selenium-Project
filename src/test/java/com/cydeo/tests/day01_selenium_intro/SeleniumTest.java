package com.cydeo.tests.day01_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {

    public static void main(String[] args) {

        // setting up the web driver
        WebDriverManager.chromedriver().setup();


        // create the instance of chrome driver
        WebDriver driver = new ChromeDriver();

        // test if browser and driver are working properly

        driver.get("https://www.google.com");
    }




}
