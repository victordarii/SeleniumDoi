package com.orange.tests.p2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice_2 {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup(); // to open Chrome browser we set up browser driver
        WebDriver driver = new ChromeDriver();   // create driver object
        driver.manage().window().maximize();

        driver.get("https://practice.cydeo.com");

        System.out.println("driver.getTitle() = " + driver.getTitle());

        driver.findElement(By.linkText("A/B Testing")).click();

        System.out.println("driver.getTitle() = " + driver.getTitle());

        driver.quit();



    }
}
