package com.orange.tests.p1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
    public static void main(String[] args) {

        // Setting up the webdriver
        WebDriverManager.chromedriver().setup();

        // Create the instance of Chrome browser driver
        WebDriver driver = new ChromeDriver();

        // Test if driver and browser are working as expected
        driver.get("https://www.google.com");

    }
}
