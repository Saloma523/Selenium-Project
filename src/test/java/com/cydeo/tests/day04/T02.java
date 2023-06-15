package com.cydeo.tests.day04;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class T02 {
    public static void main(String[] args) {

        //TC #2: FindElements Task
        //1- Open a chrome browser

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //2- Go to: https://practice.cydeo.com/abtest
        driver.get(" https://practice.cydeo.com/abtest");
        driver.quit();

        //3- Locate all the links in the page.
        List<WebElement> linksList = driver.findElements(By.tagName("a"));

        //4- Print out the number of the links on the page.

        System.out.println("linksList.size() = " + linksList.size());

        //5- Print out the texts of the links.
        // 6- Print out the HREF attribute values of the link
        for (WebElement eachElement : linksList) {
            System.out.println("text of links = " + eachElement.getText());
            System.out.println("href value of each element = " + eachElement.getAttribute("href"));

        }



    }
}
