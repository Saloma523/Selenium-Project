package com.cydeo.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/* in this class we will be creating the re-usable logic to read from configuration.properties file

 */
public class ConfigurationReader {

    private static Properties properties = new Properties();// its statis to make sure its created and loaded before everything else

    static {
        try{
            // open file using FileInputStream(open file)
            FileInputStream file = new FileInputStream("configuration.properties");
            //load the properties with file (load properties)
            properties.load(file);

            file.close();// close the file in the memory after we opened it
        }catch (IOException e){
            e.printStackTrace();
            System.out.println("FILE NOT FOUND WITH GIVEN PATH");


        }

    }

    public static String getProperty(String keyword){//creat a util method to use the object

        return properties.getProperty(keyword);
    }




}
