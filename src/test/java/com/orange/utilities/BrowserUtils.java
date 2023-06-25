package com.orange.utilities;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.util.Set;

public class BrowserUtils {
    WebDriver driver;

    public static void sleep(int second) {
        second *= 1000;
        try {
            Thread.sleep(second);
        } catch (InterruptedException e) {

        }

    }

    public static void switchWindowAndVerify(WebDriver driver, String expectedInURL, String expectedInTitle) {

        Set<String> allWindowHandles = driver.getWindowHandles();

        for (String each : allWindowHandles) {
            driver.switchTo().window(each);
            System.out.println("Current URL: " + driver.getCurrentUrl());

            if (driver.getCurrentUrl().contains(expectedInURL)) {
                break;
            }

            String actualTitle = driver.getTitle();
            Assert.assertTrue(actualTitle.contains(expectedInTitle));
        }
    }
}