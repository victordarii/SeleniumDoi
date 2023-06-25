package com.orange.tests.propertiesFilePractice;

import com.orange.utilities.BrowserUtils;
import com.orange.utilities.ConfigurationPropertiesReader;
import com.orange.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class P1 {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = WebDriverFactory.getDriver(ConfigurationPropertiesReader.getProperty("browser2"));
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }


    @Test
    public void testGoogle() throws InterruptedException {

        driver.get("https://www.google.com");

        WebElement element = driver.findElement(By.cssSelector("textarea[name=q]"));

        element.sendKeys("blue pear" + Keys.ENTER);

        Thread.sleep(3000);

    }

    @Test
    public void testEtsy() {

        driver.get(ConfigurationPropertiesReader.getProperty("etsyURL"));

        WebElement searchBoxEtsy = driver.findElement(By.cssSelector("input[id='global-enhancements-search-query']"));
        searchBoxEtsy.sendKeys("pear puzzle" + Keys.ENTER);
//        Thread.sleep(3000);
        BrowserUtils.sleep(3);
    }


}
