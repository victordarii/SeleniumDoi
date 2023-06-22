package com.orange.tests.p3;

import com.orange.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P1_getDriver {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("Chrome");

        //--------------------------------------------------------------------------------------------------------------
        driver.get("https://login1.nextbasecrm.com");

        if (driver.findElement(By.className("login-item-checkbox-label")).getText().equals("Remember me on this computer")) {
            System.out.println("Passed!");
        } else {
            System.out.println("Failed");
        }

        System.out.println("----------------------------------------------------------------------------------");

        String actualVerificationLinkText = driver.findElement(By.className("login-link-forgot-pass")).getText();
        String expectedVerificationLinkText = "Forgot your password?";

        if (actualVerificationLinkText.equals(expectedVerificationLinkText)) {
            System.out.println("Verification by link text Passed!");
            System.out.println("actualVerificationLinkText = " + actualVerificationLinkText);
            System.out.println("expectedVerificationLinkText = " + expectedVerificationLinkText);

        } else {
            System.out.println("Verification by link text Failed");
            System.out.println("actualVerificationLinkText = " + actualVerificationLinkText);
            System.out.println("expectedVerificationLinkText = " + expectedVerificationLinkText);
        }

        System.out.println("----------------------------------------------------------------------------------");

        String expectedInHref = "/?forgot_password=yes";
        String actualHrefValue = driver.findElement(By.className("login-link-forgot-pass")).getAttribute("href");

        if (actualHrefValue.contains(expectedInHref)) {
            System.out.println("Href value test Passed");
            System.out.println("expectedInHref = " + expectedInHref);
            System.out.println("actualHrefValue = " + actualHrefValue);
        } else {
            System.out.println("Href value test Failed");
            System.out.println("expectedInHref = " + expectedInHref);
            System.out.println("actualHrefValue = " + actualHrefValue);
        }


        driver.quit();

    }
}
