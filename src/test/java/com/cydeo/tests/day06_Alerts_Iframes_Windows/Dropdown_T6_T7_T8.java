package com.cydeo.tests.day06_Alerts_Iframes_Windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class Dropdown_T6_T7_T8 {
    WebDriver driver;

    @BeforeMethod
    public void methodSetup() {

        //TC #6: Selecting date on dropdown and verifying
        //1. Open Chrome browser
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        //2. Go to https://practice.cydeo.com/dropdown
        driver.get("https://practice.cydeo.com/dropdown");

    }

    @Test
    public void dropdown_task6() throws InterruptedException {



        //3. Select “December 1st, 1933” and verify it is selected.

        Select yearDropdown = new Select(driver.findElement(By.xpath("//select[@id='year']")));
        Select monthDropdown = new Select(driver.findElement(By.xpath("//select[@id='month']")));
        Select dayDropdown = new Select(driver.findElement(By.xpath("//select[@id='day']")));

        //Select year using : visible text\
        Thread.sleep(2000);
        yearDropdown.selectByVisibleText("1933");

        //Select month using : value attribute
        Thread.sleep(2000);
        monthDropdown.selectByValue("11");

        //Select day using : index number
        Thread.sleep(2000);
        dayDropdown.selectByIndex(0);

        //create expected values
        String expectedYear = "1933";
        String expectedMonth = "December";
        String expectedDay = "1";

        //get actual values from browser
        String actualYear = yearDropdown.getFirstSelectedOption().getText();
        String actualMonth = yearDropdown.getFirstSelectedOption().getText();
        String actualDay = yearDropdown.getFirstSelectedOption().getText();
        //creat assertions
       Assert.assertTrue(actualYear.equals(expectedYear));
       Assert.assertTrue(actualMonth.equals(expectedMonth));
       Assert.assertTrue(actualDay.equals(expectedDay));
    }



    @Test
    public void stateDropdown() {


        // locate the dropdown
        Select stateDropdown = new Select(driver.findElement(By.xpath("//select[@id='state']")));

        //3. Select Illinois
        stateDropdown.selectByVisibleText("Illinois");

        //4. Select Virginia
        stateDropdown.selectByValue("VA");

        //5. Select California
        stateDropdown.selectByIndex(5);

        //6. Verify final selected option is California.
        String expectedOptionText = " California";
        String actualOptionText = stateDropdown.getFirstSelectedOption().getText();

        Assert.assertEquals(actualOptionText,
                expectedOptionText);
        //Use all Select options. (visible text, value, index

    }

    @Test
    public void non_select_test() {

        //3. Click to non-select dropdown
        WebElement nonSelect = driver.findElement(By.linkText("Dropdown link"));
        nonSelect.click();

        //4. Select Facebook from dropdown
        WebElement facebook = driver.findElement(By.linkText("Facebook"));
        facebook.click();


        //5. Verify title is “Facebook - Log In or Sign Up
        String expected = "Facebook - log in or Sign Up";
        String actual = driver.getTitle();

      Assert.assertEquals(actual,expected);
    }

}


