package com.cydeo.tests.day09;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class DriverUtilPractice2 {

//    WebDriver driver;
//    @BeforeMethod
//    public void setupMethod(){
//        //1. Open Chrome browser
//        // String browserType = ConfigurationReader.
//        driver = WebDriverFactory.getDriver(ConfigurationReader.getProperty("browser"));
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//
//
//    }

    @AfterMethod
    public void tearDownMethod(){

        Driver.closeDriver();

       /*
        Driver.getDriver().quit();
        we will not use the quit method directly anymore
        */
    }

    @Test
    public void being_search_test(){

        Driver.getDriver().get(ConfigurationReader.getProperty("bingURL"));

        WebElement searchBox = Driver.getDriver().findElement(By.xpath("//textarea[@type='search']"));
        searchBox.sendKeys(ConfigurationReader.getProperty("searchValue") + Keys.ENTER);

        String expectedTitle = ConfigurationReader.getProperty("searchValue")+" - Search";
        BrowserUtils.sleep(2);
        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertTrue(actualTitle.equals(expectedTitle));








    }


    @Test
    public void being_search_test2(){

        Driver.getDriver().get(ConfigurationReader.getProperty("bingURL"));

        WebElement searchBox = Driver.getDriver().findElement(By.xpath("//textarea[@type='search']"));
        searchBox.sendKeys(ConfigurationReader.getProperty("searchValue") + Keys.ENTER);

        String expectedTitle = ConfigurationReader.getProperty("searchValue")+" - Search";
        BrowserUtils.sleep(2);
        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertTrue(actualTitle.equals(expectedTitle));








    }

}
