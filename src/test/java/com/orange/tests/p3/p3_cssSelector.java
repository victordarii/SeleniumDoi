package com.orange.tests.p3;

import com.orange.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class p3_cssSelector {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://login1.nextbasecrm.com");

        driver.findElement(By.xpath("//input[@onclick=\"BX.addClass(this, 'wait');\"]")).click();

    }
}
