package com.cydeo.tests.day09;

public class Singleton {

    //#1- creat private constructor
    private Singleton(){}

    //#-2 private static string
    private static String word;

    //#-3 utility method to return the 'private string' we just crated

    public static String getWord(){

        if(word == null){
            System.out.println("First time call.Word object is null.");
            System.out.println("Assigning value to it now");
            word = "something";

        }else{
            System.out.println("word already has a value");
        }

        return word;
    }

}
