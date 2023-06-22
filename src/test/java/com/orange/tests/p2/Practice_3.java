package com.orange.tests.p2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice_3 {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup(); // to open Chrome browser we set up browser driver
        WebDriver driver = new ChromeDriver();   // create driver object
        driver.manage().window().maximize();

        driver.get("https://www.google.com");

        WebElement googleSearchBox = driver.findElement(By.name("q"));

        googleSearchBox.sendKeys("apple stock");
        googleSearchBox.sendKeys(Keys.ENTER); // or we can do it in 1 line

        Thread.sleep(10000);


        driver.quit();


    }
}
