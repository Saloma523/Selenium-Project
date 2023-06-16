package com.cydeo.tests.day09;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class T01_BeingSearch{
    WebDriver driver;
    @BeforeMethod
    public void setupMethod(){




        //1. Open Chrome browser

       // String browserType = ConfigurationReader.
        driver = WebDriverFactory.getDriver("");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://bing.com");
    }

    @AfterMethod
    public void tearDownMethod(){
        driver.quit();
    }

    @Test
    public void being_search_test(){

        WebElement searchBox = driver.findElement(By.xpath("//textarea[@type='search']"));
        searchBox.sendKeys("apple");
        searchBox.click();




    }
}
/*
TC #1: Bing search
1- Open a chrome browser
2- Go to: https://bing.com
3- Write “apple” in search box
4- Verify title:
Expected: apple - Search
Use `configuration.properties` for the following:
1. The browser type
2. The URL
3. The search keyword
4. Make title verification dynamic. If search value changes, title
assertion should not fail
 */