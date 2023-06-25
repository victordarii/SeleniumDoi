package com.orange.tests.tables;

import com.orange.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WebTables {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://practice.cydeo.com/tables");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void testWebTables() {

//        WebElement table1Element = driver.findElement(By.cssSelector("table#table1"));
        WebElement table1Element = driver.findElement(By.xpath("//table[@id='table1']"));

//        (//table[@id='table1']/tbody//tr//td[2])[2] --> this locator won't work if table is sorted out.
//        //table[@id='table1']//td[.='Frank']        --> this will always work, also your staying inside that table1
//        (//td[.='Frank'])[1]  --> even after sorting the table this locator still works;

    }
}
