package com.orange.tests.p2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice_1 {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://practice.cydeo.com");

        System.out.println(driver.getCurrentUrl().contains("cydeo"));

        System.out.println(driver.getTitle().contains("Practice"));

        driver.quit();

    }
}
