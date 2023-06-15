package com.cydeo.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/* in this class we will be creating the re-usable logic to read from configuration.properties file

 */
public class ConfigurationReader {

    private static Properties properties = new Properties();

    static {
        try{
            // open file using FileInputStream(open file)
            FileInputStream file = new FileInputStream("configuration.properties");
            //load the properties with file (load properties)
            properties.load(file);
        }catch (IOException e){
            System.out.println("FILE NOT FOUND WITH GIVEN PATH");
            e.printStackTrace();

        }

    }

    private static String getProperties(String keyword){
        return properties.getProperty(keyword);
    }




}
