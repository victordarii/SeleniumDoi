package com.orange.tests.testData;

import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Practice {

    @Test
    public void testP() throws IOException {

        FileInputStream file = new FileInputStream( "");

        Properties properties = new Properties();

        properties.load(file);

    }
}
