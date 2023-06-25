package com.cydeo.tests.day10;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class T02_Upload_Practice {

    @Test
    public void upload_test(){

        Driver.getDriver().get("https://practice.cydeo.com/upload");

        String path ="C:/Users/salom/OneDrive/Desktop/Soft Skils";

        WebElement choseFileBox = Driver.getDriver().findElement(By.xpath("//input[@id='file-upload']"));
        choseFileBox.sendKeys(path);

        WebElement uploadButton = Driver.getDriver().findElement(By.id("file-submit"));
        uploadButton.click();

        Driver.closeDriver();


    }



}
//TC #2 Upload Test
//1. Go to https://practice.cydeo.com/upload
//2. Find some small file from your computer, and get the path of it.
//3. Upload the file.
//4. Assert:
//-File uploaded text is displayed on the page