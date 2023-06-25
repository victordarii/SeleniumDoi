package com.orange.tests.p5;

import com.orange.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DropDownIntro {

    WebDriver driver;


    @BeforeMethod
    public void setupMethod() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://practice.cydeo.com/dropdown");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }


    @Test
    public void test1() {

        WebElement simpleDropdownElement = driver.findElement(By.cssSelector("select[id='dropdown']"));

        Select select = new Select(simpleDropdownElement);

        select.selectByIndex(1);

        String expected = "Please select an option";
        String actual = select.getFirstSelectedOption().getText();

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void test2() {

        Select select = new Select(driver.findElement(By.cssSelector("select[id='state']")));
        String actual = select.getFirstSelectedOption().getText();
        String expected = "Select a State";
        Assert.assertEquals(actual, expected);

//        select.get
    }
}
