package com.orange.tests.alerts;

import com.orange.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Test {
    public static void main(String[] args) {

        WebDriver driver;
        driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://practice.cydeo.com/javascript_alerts");

        WebElement jsAlertElement = driver.findElement(By.cssSelector("button.btn btn-primary"));

        jsAlertElement.click();


        driver.quit();

    }
}
