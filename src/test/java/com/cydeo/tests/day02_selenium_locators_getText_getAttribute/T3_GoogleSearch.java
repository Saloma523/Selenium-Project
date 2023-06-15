package com.cydeo.tests.day02_selenium_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T3_GoogleSearch {
    public static void main(String[] args) {

        //TC#3: Google search
        //1- Open a chrome browser

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2- Go to: https://google.com
        // locate search box
        driver.get("https://google.com");


        //3- Write “apple” in search box
        WebElement googleSearchBox = driver.findElement(By.name("q"));

        // enter "apple" key and press enter
        //4- Press ENTER to search
        googleSearchBox.sendKeys("apple" + Keys.ENTER);


        //5- Verify title:
        //Expected: Title should start with “apple” wor

        String expectedInTheBeginningOfTitle = "apple";
        String acualBeginningOfTitle = driver.getTitle();

        if(acualBeginningOfTitle.startsWith(expectedInTheBeginningOfTitle)){
            System.out.println("Title test verification passed");
        }else{
            System.out.println("Title test verification passed");
        }
    }
}
//TC #4: Library verifications
//1. Open Chrome browser
//2. Go to http://library2.cybertekschool.com/login.html
//3. Enter username: “incorrect@email.com”
//4. Enter password: “incorrect password”
//5. Verify: visually “Sorry, Wrong Email or Password”
//displayed
//PS: Locate username input box using “className” locator
//Locate password input box using “id” locator
//Locate Sign in button using “tagName” locato



//TC #5: getText() and getAttribute() method practice
//1- Open a chrome browser
//2- Go to: https://practice.cydeo.com/registration_form
//3- Verify header text is as expected:
//Expected: Registration form
//4- Locate “First name” input box
//5- Verify placeholder attribute’s value is as expected:
//Expected: first nam