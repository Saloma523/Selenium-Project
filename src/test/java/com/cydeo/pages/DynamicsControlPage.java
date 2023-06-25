package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;

public class DynamicsControlPage {



    public DynamicsControlPage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(xpath = "//button[.='Remove']")
    public WebElement removeButton;

    @FindBy(xpath = "//img[@src='/img/ajax-loader.gif']")
    public WebElement loadingBar;

    @FindBy(xpath = "//p[@id='message']")
    public WebElement itsGoneMessage;

    @FindBy (css = "input[type='checkbox']")
    public WebElement checkBox;

    @FindBy(xpath = "//input[@type='text']")
    public WebElement inputBox;

    @FindBy(xpath = "//button[.='Enable']")
    public WebElement enableButton;

    @FindBy(css = "p[id='message']")
    public WebElement isEnabledMessage;



}
