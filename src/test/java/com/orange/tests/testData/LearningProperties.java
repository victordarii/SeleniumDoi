package com.orange.tests.testData;

import org.testng.annotations.Test;

public class LearningProperties {

    @Test
    public void testPropertiesReading() {

        // this method is accepting a key and there is somewhere a value for it, we pass the key and, it will return the value.
        String property = System.getProperty("os.name");

        System.out.println("property = " + property);

        property = System.getProperty("user.name");

        System.out.println("property = " + property);


    }
}
