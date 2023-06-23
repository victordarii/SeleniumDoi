package com.orange.tests.p4;

import com.orange.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class StaleElementReferenceException {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://practice.cydeo.com/abtest");

        WebElement element = driver.findElement(By.xpath("//a[.='CYDEO']"));

        System.out.println("element.isDisplayed() = " + element.isDisplayed());

        driver.navigate().refresh();
        System.out.println("Refreshing the page...");

        element = driver.findElement(By.xpath("//a[.='CYDEO']"));
        System.out.println("element.isDisplayed() = " + element.isDisplayed());

        driver.quit();


    }
}
