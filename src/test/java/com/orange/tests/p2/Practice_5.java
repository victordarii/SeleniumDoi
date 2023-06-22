package com.orange.tests.p2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice_5 {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup(); // to open Chrome browser we set up browser driver
        WebDriver driver = new ChromeDriver();   // create driver object
        driver.manage().window().maximize();

        driver.get("https://practice.cydeo.com/registration_form");

        WebElement headerText = driver.findElement(By.tagName("h2"));

        String expectedHeaderText = "Registration form";
        String actualHeaderText = headerText.getText();

        if (actualHeaderText.equals(expectedHeaderText)) {
            System.out.println("Header text verification passed!");
        }

        WebElement firstNameInputElement = driver.findElement(By.className("form-control"));

        String expectedPlaceHolder = "first name";
        String actualPlaceHolder = firstNameInputElement.getAttribute("placeholder");

        System.out.println("actualPlaceHolder = " + actualPlaceHolder);

        if (actualPlaceHolder.equals(expectedPlaceHolder)){
            System.out.println("Passed");
        }else {
            System.out.println("Failed");
        }




    }
}
