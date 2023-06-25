package com.orange.tests.alerts;

import com.orange.utilities.BrowserUtils;
import com.orange.utilities.WebDriverFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WindowsHandling {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.amazon.com");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }


    @Test
    public void testWindows() {

        ((JavascriptExecutor) driver).executeScript("window.open('https://google.com','_blank');");
        ((JavascriptExecutor) driver).executeScript("window.open('https://etsy.com', '_blank');");
        ((JavascriptExecutor) driver).executeScript("window .open ('https://facebook.com' ,'_blank');");

        BrowserUtils.switchWindowAndVerify(driver, "etsy", "etsy");

    }

}
