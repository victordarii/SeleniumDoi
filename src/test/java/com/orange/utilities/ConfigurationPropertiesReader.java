package com.orange.utilities;

// In this class, we will be creating the re-usable logic to read from configuration.properties file

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationPropertiesReader {

    // we'll use this obj to get our data
    // make it "private" so we are limiting access to the object
    // "static" is to make sure its created and loaded before everything else.
    private static Properties properties = new Properties();

    static {
        try {
            // this is the path for our properties(data)
            FileInputStream fileInputStream = new FileInputStream("congiguration.properties");

            // this obj method load() needs that path
            properties.load(fileInputStream);
        } catch (IOException e) {
            throw new RuntimeException(e); // whatever you catch put it inside here, and I'll throw RuntimeException with info about it (e)
        }
    }

//    retrieve data
//    String browser = properties.getProperty("browser");


    // create utility method

    public static String getProperty(String keyword) {

        return properties.getProperty(keyword);

    }


}
