package com.cydeo.tests.day03_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T01_lOCATION_getText {

    public static void main(String[] args) {
        //TC #1: NextBaseCRM, locators and getText() practice
        //1- Open a chrome browser

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //2- Go to: https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");


        //3- Enter incorrect username: “incorrect”

        WebElement usernameBox = driver.findElement(By.name("USER_LOGIN"));
        usernameBox.sendKeys("incorrect" );


        //4- Enter incorrect password: “incorrect”
        WebElement passwordBox = driver.findElement(By.name("USER_PASSWORD"));
        passwordBox.sendKeys("incorrect" );

        //5- Click to login button.
        WebElement loginButton = driver.findElement(By.className("login-btn"));
        loginButton.click();


        //6- Verify error message text is as expected:
        //Expected: Incorrect login or password

        String expectedErrorMessage = "Incorrect login or password";
        String actualErrorMessage = driver.findElement(By.className("errortext")).getText();

        if(actualErrorMessage.equals(expectedErrorMessage)){
            System.out.println("error text verification passed!");
        }else{
            System.out.println("error text verification failed");
        }

        //PS: Inspect and decide which locator you should be using to locate web
        //elements
    }
}
