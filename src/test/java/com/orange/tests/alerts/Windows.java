package com.orange.tests.alerts;

import com.orange.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Set;

public class Windows {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://practice.cydeo.com/windows");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void testWindows() throws InterruptedException {
        System.out.println("===========------------Buna seara Chisinau------------===================");

        String expectedTitle = "Windows";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);

        String mainWindowHandle = driver.getWindowHandle();
        System.out.println("mainWindowHandle = " + mainWindowHandle);

        System.out.println("Title before switching window: " + driver.getTitle());

        WebElement click_hereWebElement = driver.findElement(By.linkText("Click Here"));
        click_hereWebElement.click();

        System.out.println("Title after switching window: " + driver.getTitle());

        Thread.sleep(3000);

        // Switch to new Window. We need to use driver.getWindowHandles() method ==> returns us a set<windowHandles as String>
        // driver.getWindowHandles() ==> THIS METHOD IS CAPABLE OF GETTING US ALL OPEN WINDOWS/TABS
        // we'll loop through the returned set<windowHandles String> to switch them.
        // Because we save our main windowHandle for reusing it in the very beginning we'll be able to distinguish new
        // window from our main window, to witch we might return.

        Set<String> windowHandles = driver.getWindowHandles();

        for (String eachWindowHandle : windowHandles) {
            driver.switchTo().window(eachWindowHandle);

            System.out.println("Current title while switching windows: " + driver.getTitle());
        }

        driver.get("https://www.google.com");

        driver.findElement(By.cssSelector("textarea[name='q']")).sendKeys("Orange" + Keys.ENTER);

        System.out.println("Title before switching window: " + driver.getTitle());

        driver.switchTo().window(mainWindowHandle);

        System.out.println("Title after switching window: " + driver.getTitle());

        driver.close();

        Thread.sleep(3000);
    }
}
