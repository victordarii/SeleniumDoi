package com.orange.tests.propertiesConfigReader;

import com.orange.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WebTable_Order_Verify {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://practice.cydeo.com/web-tables");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void testTables() {

    }
}
