package com.orange.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class WebDriverFactory {

    public static WebDriver getDriver(String browserType) {

        WebDriver webDriver = null;

        if (browserType.equalsIgnoreCase("Chrome")) {
            WebDriverManager.chromedriver().setup();
//            new ChromeDriver(); // this expression is opening the browser
//            new ChromeDriver().manage().window().maximize(); // thus we can manage the opened browser window
            webDriver = new ChromeDriver();//assigned or not this expression: new ChromeDriver(); is opening the browser
            webDriver.manage().window().maximize();
            webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//this will stop the immediate throwing
            // of NoSuchElementException for 10 seconds then throws it.


        } else if (browserType.equalsIgnoreCase("FireFox")) {
            WebDriverManager.firefoxdriver().setup();
            webDriver = new FirefoxDriver();
            webDriver.manage().window().maximize();
            webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        } else {
            System.err.println("Wrong browser type provided!");
        }

        return webDriver;
    }

    public static String getURL(String stringURL) {

        String result = "Ghost Town";

        if (stringURL.equalsIgnoreCase("google")) {
            result = ConfigurationPropertiesReader.getProperty("googleURL");
        } else if (stringURL.equalsIgnoreCase("etsy")) {
            result = ConfigurationPropertiesReader.getProperty("etsyURL");
        } else {
            System.err.println("wrong URL given hello");
        }

        return result;
    }
}
