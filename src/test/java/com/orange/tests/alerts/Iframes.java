package com.orange.tests.alerts;

import com.orange.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Iframes {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://practice.cydeo.com/iframe");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

//    --------------------------------------------------------------------------------------------------------

    @Test
    public void testIframes() throws InterruptedException {

        // we have to switch to iframe to be able to locate the web elements in there.
        // locate the iframe and switch to it


        WebElement alignCenterWebElement = driver.findElement(By.cssSelector("button[aria-label='Align center']"));
        alignCenterWebElement.click();

        // write something


        // Locate the iframe and switch to it
        WebElement iframeWebElement = driver.findElement(By.cssSelector("iframe#mce_0_ifr"));
        driver.switchTo().frame(iframeWebElement);
//        driver.switchTo().frame(0); // indexes start from 0
//        driver.switchTo().frame("mce_0_ifr"); // this iframe happens to have an id attribute

//        driver.switchTo().frame( webElement );
//        driver.switchTo().frame( int index );
//        driver.switchTo().frame( "name or id" );

        WebElement iframeInputBox = driver.findElement(By.xpath("//p[.='Your content goes here.']"));
        iframeInputBox.sendKeys("Buna seara Chisinau!");

        Thread.sleep(3000);

        driver.switchTo().parentFrame();

        WebElement boldButtonWebElement = driver.findElement(By.cssSelector("button[aria-label='Bold']"));
        boldButtonWebElement.click();

        Thread.sleep(3000);

        Assert.assertTrue(alignCenterWebElement.isDisplayed());

    }
}
