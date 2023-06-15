package com.cydeo.tests.day05;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;
import java.util.List;

public class T03 {

    private static void clickAndVerifyRadioButton(WebDriver driver,String nameAttribute, String expectedId){

       // List<WebElement> listOfSportRadioButtons = driver.findElements(By.xpath("//input[@name ='"+nameAttribute+"']"));
        List<WebElement> listOfSportRadioButtons = driver.findElements(By.name(nameAttribute));

        for (WebElement each : listOfSportRadioButtons) {
            String actualId = each.getAttribute("id");
            System.out.println("actualId = " + actualId);

            if(actualId.equals("hockey")){
                each.click();
                System.out.println(actualId + " is selected :" + each.isSelected() );
            }

        }

    }
    public static void main(String[] args) {




        //XPATH PRACTICES
        //DO NOT USE ANY DEVELOPER TOOLS TO GET ANY LOCATORS.
        //TC #2: Radiobutton handling
        //1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //2. Go to https://practice.cydeo.com/radio_buttons
        driver.get("https://practice.cydeo.com/radio_buttons");

        clickAndVerifyRadioButton(driver,"color","red");
        clickAndVerifyRadioButton(driver,"sport","football");

        List<WebElement> listOfSportRadioButtons = driver.findElements(By.xpath("//input[@name ='sport']"));

        for (WebElement each : listOfSportRadioButtons) {
            String actualId = each.getAttribute("id");
            System.out.println("actualId = " + actualId);

            if(actualId.equals("hockey")){
                each.click();
                System.out.println(actualId + " is selected :" + each.isSelected() );
            }

        }
     }

}
/*
XPATH PRACTICES
DO NOT USE ANY DEVELOPER TOOLS TO GET ANY LOCATORS.
TC #3: Utility method task for (continuation of Task2)
1. Open Chrome browser
2. Go to https://practice.cydeo.com/radio_buttons
3. Click to “Hockey” radio button
4. Verify “Hockey” radio button is selected after clicking.
USE XPATH LOCATOR FOR ALL WEBELEMENT LOCATORS
Create a utility method to handle above logic.
Method name: clickAndVerifyRadioButton
Return type: void or boolean
Method args:
1. WebDriver
2. Name attribute as String (for providing which group of radio buttons)
3. Id attribute as String (for providing which radio button to be clicked)
Method should loop through the given group of radio buttons. When it finds the
matching option, it should click and verify option is Selected.
Print out verification: tru
 */