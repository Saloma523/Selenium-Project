package com.cydeo.tests.day03_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T02 {

    public static void main(String[] args) {

        //TC #2: NextBaseCRM, locators, getText(), getAttribute() practice
        //1- Open a chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //2- Go to: https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");

        //3- Verify “remember me” label text is as expected:
        //Expected: Remember me on this computer
        String actualLabelText = "Remember me on this computer";
       String  expectedLabelText = driver.findElement(By.className("login-item-checkbox-label")).getText();

       if(actualLabelText.equals(expectedLabelText)){
           System.out.println("Label text verification passed!");
       }else{
           System.out.println("Label text verification failed");
       }

        //4- Verify “forgot password” link text is as expected:
        //Expected: Forgot your password?

        WebElement forgotPasswordLinl = driver.findElement(By.className("login-link-forgot-pass"));
        String expectedLinkText = "Forgot your password?";
       String actualLinkText = forgotPasswordLinl.getText();

       if(actualLabelText.equals(expectedLabelText)){
           System.out.println("Link text verification passed!");
       }else{
           System.out.println("Link text verification failed!");
       }
        //5- Verify “forgot password” href attribute’s value contains expected:
        //Expected: forgot_password=yes
        String expectedForgotTex = "forgot_password=yes";
     String actualForgotText = forgotPasswordLinl.getAttribute("href");

     if(actualForgotText.equals(expectedForgotTex)){
         System.out.println("attribute value test passed!");
     }else{
         System.out.println("actualAttribute = " + actualForgotText);
         System.out.println("expectedForgotTex = " + expectedForgotTex);
         System.out.println("attribute value test failed!");
     }

     //PS: Inspect and decide which locator you should be using to locate web
        //elements
    }
}
