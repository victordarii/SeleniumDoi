package com.orange.tests.p5;

import com.orange.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PracticeRadioButton {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://practice.cydeo.com/radio_buttons");

        WebElement hockeyOptionRadioButton = driver.findElement(By.xpath("//input[@id='hockey']"));

        hockeyOptionRadioButton.click();

        if (hockeyOptionRadioButton.isSelected()){
            System.out.println("Button is selected. Verification PASSED!");
        }else {
            System.out.println("Button is NOT selected. Verification FAILED!");
        }


        driver.quit();

    }

}
