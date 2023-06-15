package com.cydeo.tests.self_Practice.day02;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T0_ZeroBankHeader {

    public static void main(String[] args) {


        //HWP #2: Zero Bank header verification
        //1. Open Chrome browser

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();


        //2. Go to http://zero.webappsecurity.com/login.html

        driver.get("http://zero.webappsecurity.com/login.html");
        WebElement headerText = driver.findElement(By.tagName("h3"));
        //3. Verify header text

        String expectedHeaderText = "Log in to ZeroBank";
        String actualHeaderText = headerText.getText();

        if(actualHeaderText.equals(expectedHeaderText)){
            System.out.println("Header text verification passed!!");
        }else{
            System.out.println("Header text verification failed!!");
        }
        //Expected: “Log in to ZeroBan
    }
}
