package com.orange.tests.p3;

import com.orange.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;

public class ZeroBankHeaderVerification {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("http://zero.webappsecurity.com/login.html");





        driver.quit();
    }
}
