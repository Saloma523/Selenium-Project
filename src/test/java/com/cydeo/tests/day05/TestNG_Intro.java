package com.cydeo.tests.day05;

import org.testng.Assert;
import org.testng.annotations.*;

public class TestNG_Intro {


    @BeforeClass
    public void setupClass(){
        System.out.println("before class is running");
    }

    @AfterClass
    public void tearDown(){
        System.out.println("after class is running");
    }
    @BeforeMethod
    public void setupMethod(){
        System.out.println("--> before method is running");
    }

    @AfterMethod
    public void tearDownMethod(){
        System.out.println("--> after method is running");
    }


    @Test (priority = 1)
    public void test1(){
        System.out.println("test 1 is runnig");
        String actual = "apple";
        String expected = "apple";

        //Assert method will compaire two of the same value,it returns true, pass,false, fails
        Assert.assertEquals(actual,expected);// if it fails, and we have anything after this it will not execute, so it is better to put it last
    }

    @Test (priority = 2)
    public void test2(){
        System.out.println("test 1 is runnig");
        String actual = "white";
        String expected = "white";

        Assert.assertTrue(actual.equals(expected));

    }
}
