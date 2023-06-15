package com.cydeo.tests.day08;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class T04_use_config_reader {

    WebDriver driver;
    @BeforeMethod
    public void methodSetup() {

        //TC #6: Selecting date on dropdown and verifying
        //1. Open Chrome browser
        driver = WebDriverFactory.getDriver("browser");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //2- Go to: https://google.com
        driver.get("https://google.com");


    }

    @Test
    public void google_search_test(){


        //3- Write “apple” in search box
        //4- Verify title:
        //Expected: apple - Google Search
        //Use `configuration.properties` for the following:
        //1. The browser type
        //2. The URL
        //3. The search keyword
        //4. Make title verification dynamic. If search value changes, title
        //assertion should not fail

    }

    }
