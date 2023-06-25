package com.orange.tests.testData;

import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadingProperties {

    @Test
    public void testReadingFromProperties() throws IOException {

        //1- Create object of Properties
        //2- We need to open the file in the Java memory
        //3- Load the properties file in the Properties object
        //4- Use the "properties" object to read value from the file

        Properties properties = new Properties();
        FileInputStream file = new FileInputStream("congiguration.properties");
        properties.load(file);

        String browser = properties.getProperty("browser");

        System.out.println("browser = " + browser);


    }
}
