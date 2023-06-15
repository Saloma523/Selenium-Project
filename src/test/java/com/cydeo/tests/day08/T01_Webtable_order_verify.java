package com.cydeo.tests.day08;

import com.cydeo.utilities.WebDriverFactory;
import com.cydeo.utilities.WebOrderUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class T01_Webtable_order_verify {

    WebDriver driver;
    @BeforeMethod
    public void methodSetup() {

        //TC #6: Selecting date on dropdown and verifying
        //1. Open Chrome browser
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //1. Go to: https://practice.cydeo.com/web-tables
        driver.get("https://practice.cydeo.com/web-tables");




    }

  /*  @Test
    public void test1(){

        //TC #1: Web table practice
        //2. Verify Bob’s name is listed as expected.
        //Expected: “Bob Martin”
        //3. Verify Bob Martin’s order date is as expected
        //Expected: 12/31/2021
        WebElement bobCell = driver.findElement(By.xpath("//table[@class='SampleTable']//td[.='Bob Martin']"));

        System.out.println("bobCell = " + bobCell);
        System.out.println("bobCell.getText() = " + bobCell.getText());
        String expectedName = "Bob Martin";
        String actualName = bobCell.getText();
        Assert.assertEquals(actualName,expectedName);

        String locator = "//table[@class='SampleTable']//td[.='Bob Martin']/following-sibling::td[3]";

        //WebElement bobOrderDate = driver.findElement(By.xpath("//table[@class='SampleTable']//td[.='Bob Martin']/../td[5]"));

        WebElement bobOrderDate = driver.findElement(By.xpath(locator));

        String expectedDate = " 12/31/2021";
        String actualDate = bobOrderDate.getText();
       Assert.assertEquals(actualDate,expectedDate);



    }

   */

    @Test
    public void test2(){
       String alexandraGray =  WebOrderUtils.returnOrderDate(driver,"Alexandra Gray");
        System.out.println("alexandraGray = " + alexandraGray);


    }

    @Test
    public void test3(){
        WebOrderUtils.orderVerify(driver,"Bob Martin","12/31/2021");
    }
}
