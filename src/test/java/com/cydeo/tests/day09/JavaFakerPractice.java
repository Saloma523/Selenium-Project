package com.cydeo.tests.day09;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;

public class JavaFakerPractice {

    @Test
    public void test1(){
        Faker faker = new Faker();

        //print out random first name
        System.out.println("faker.name().firstName() = " + faker.name().firstName());

        //print out random last name
        System.out.println("faker.name().lastName() = " + faker.name().lastName());

        //print out random full name
        System.out.println("faker.name().fullName() = " + faker.name().fullName());

        //print out city
        System.out.println("faker.address().city() = " + faker.address().city());

        //print out random zipcode
        System.out.println("faker.address().zipCode() = " + faker.address().zipCode());

        //numerify() method is used to generate random digits with specific formatting
        System.out.println("faker.numerify(\"###-###-###\") = " + faker.numerify("###-###-###"));
        System.out.println("faker.numerify(\"999-###-###\") = " + faker.numerify("999-###-###"));

        //letterify() method is used to generate random letters and digits randomly
        System.out.println("faker.letterify(\"????-????-????\") = " + faker.letterify("????-????-????"));

        //bothify() is used to generate both letters and digits randomly
        System.out.println("faker.bothify(\"#?#?-#?#?-#?#?#?\") = " + faker.bothify("#?#?-#?#?-#?#?#?"));

        //chukNorris method is used to creat chukNorris facts
        System.out.println("faker.chuckNorris().fact() = " + faker.chuckNorris().fact());

        System.out.println("faker.chuckNorris().fact().replaceAll() = " + faker.chuckNorris().fact().replaceAll("Chuck Norries","Muhtar"));
    }

}
