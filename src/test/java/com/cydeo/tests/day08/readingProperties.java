package com.cydeo.tests.day08;

import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class readingProperties {

    @Test
    public void reading_from_properties_test() throws IOException {

        // creat object of properties
        Properties properties = new Properties();

        // we need to open the file in the java memory using FileInputStream
        FileInputStream file = new FileInputStream("configuration.properties");

        //load the properties file in the properties object
        properties.load(file);

        //use the properties object to read values from the file
        System.out.println("properties.getProperty(\"browser\") = " + properties.getProperty("browser"));
        System.out.println("properties.getProperty(\"env\") = " + properties.getProperty("env"));
        System.out.println("properties.getProperty(\"username\") = " + properties.getProperty("username"));
        System.out.println("properties.getProperty(\"password\") = " + properties.getProperty("password"));
    }
}
