package com.cydeo.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class Driver {

    // crwat a private constructor

    private Driver(){}

    /*
    we make our driver private ,because we want to close access from outside the class.
    we are making it static, because we will use it in a static method.
     */

    /*
    creat a re-usable utility method wich returns the same driver instance once we call it.
    if an instance dosent exist, it will creat first , and then it will always return same instance.
     */

    private static WebDriver driver;

    public static WebDriver getDriver(){

        if(driver == null){

            /*
            we will read our browserType from configuration.properties file.
            this way, we can control which browser is opened from outside our code.
             */
            String browserType = ConfigurationReader.getProperty("browser");

            /*
            Depending on the browser type return from the configuration.properties
            switch statement will determine the "case", and open the matching browser             */
            switch (browserType){
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    driver.manage().window().maximize();
                    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    driver.manage().window().maximize();
                    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
                    break;

            }
        }
        return driver;
    }

    public static void closeDriver(){

        if(driver != null){
            // this will terminate the currently existing driver
            driver.quit();
            driver = null;
        }
    }
}
