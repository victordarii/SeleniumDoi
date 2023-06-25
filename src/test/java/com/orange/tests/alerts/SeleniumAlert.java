package com.orange.tests.alerts;

import com.orange.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SeleniumAlert {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://practice.cydeo.com/javascript_alerts");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    //--------------------------------------------------------------------------------------------------------------

    @Test
    public void test1() throws InterruptedException {

//        WebElement homeElement = driver.findElement(By.cssSelector("a.nav-link"));
//        homeElement.click();

        WebElement infoAlertElement = driver.findElement(By.cssSelector("button[class='btn btn-primary']"));

        infoAlertElement.click();


        Alert alert = driver.switchTo().alert();
        alert.accept();

        Thread.sleep(3000);

        driver.findElement(By.xpath("//button[@class='btn btn-primary'][2]")).click();
        alert.accept();

        Thread.sleep(3000);

//        driver.switchTo().defaultContent(); // it works without having to switch back browser's focus

        WebElement homeButton = driver.findElement(By.cssSelector("a.nav-link"));
        homeButton.click();


    }

}
