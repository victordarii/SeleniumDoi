package com.orange.tests.p2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice_4 {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup(); // to open Chrome browser we set up browser driver
        WebDriver driver = new ChromeDriver();   // create driver object
        driver.manage().window().maximize();

        driver.get("https://library2.cybertekschool.com/login.html");

//        sort of negative test

        WebElement usernameInput = driver.findElement(By.className("form-control"));
        usernameInput.sendKeys("asda@djvhsd.com");

        WebElement passwordInput = driver.findElement(By.id("inputPassword"));
        passwordInput.sendKeys("esfes");

        WebElement signInButton = driver.findElement(By.tagName("button"));
        signInButton.click();

        Thread.sleep(5000);

        driver.quit();
    }
}
