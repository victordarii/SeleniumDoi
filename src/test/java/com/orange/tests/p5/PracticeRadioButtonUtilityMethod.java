package com.orange.tests.p5;

import com.orange.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class PracticeRadioButtonUtilityMethod {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://practice.cydeo.com/radio_buttons");

        List<WebElement> sportRadioButton = driver.findElements(By.xpath("//input[@name='sport']"));

        for (WebElement webElement : sportRadioButton) {
            System.out.println("webElement = " + webElement);
        }



        driver.quit();

    }
}
