package com.orange.tests.p4;

import com.orange.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P1_xpath_cssSelector {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://practice.cydeo.com/forgot_password");


        WebElement homeLinkElement1 = driver.findElement(By.cssSelector("a[class='nav-link']"));
        WebElement homeLinkElement2 = driver.findElement(By.cssSelector("a.nav-link"));
//        homeLinkElement1.click();
//        homeLinkElement2.click();

        WebElement element = driver.findElement(By.xpath("//h2[text()='Forgot Password']"));
        element= driver.findElement(By.xpath("//h2[.='Forgot Password']")); // dot replaces text()

        driver.findElement(By.cssSelector(""));

        Thread.sleep(3000);

        driver.quit();

    }
}
