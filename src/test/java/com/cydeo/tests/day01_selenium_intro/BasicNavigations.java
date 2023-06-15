package com.cydeo.tests.day01_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {

    public static void main(String[] args) throws InterruptedException {


        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // go to tesla.com
        driver.get("https://www.tesla.com");


        String currentTitle = driver.getTitle();
        System.out.println("Current title =" + currentTitle);

        driver.navigate().back();

        Thread.sleep(1000);

        driver.navigate().forward();

        Thread.sleep(1000);

        driver.navigate().refresh();

        driver.navigate().to("https://www.google.com");

        String currentUrl2 = driver.getCurrentUrl();
        System.out.println(currentUrl2);

        String currentTitle2 = driver.getTitle();
        System.out.println("Current title =" + currentTitle);

        driver.close();

        driver.quit();





    }
}
