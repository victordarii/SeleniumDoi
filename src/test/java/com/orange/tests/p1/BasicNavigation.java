package com.orange.tests.p1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigation {
    public static void main(String[] args) throws InterruptedException {

//        setup browser driver
        WebDriverManager.chromedriver().setup();

//        create instance of Chrome browser
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

//        go to tesla.com
        driver.get("https://www.tesla.com");

//        use navigate back
        driver.navigate().back();

//        stop execution for 3 seconds
        Thread.sleep(3000);

//        use navigate forward
        driver.navigate().forward();

        Thread.sleep(3000);

//        user refreshes the page using navigate.refresh();
        driver.navigate().refresh();

        driver.navigate().to("https://www.google.com");

//        got to confirm you're on the intended page or not
        String title = driver.getTitle();
        System.out.println("title = " + title);

//        driver.close(); // closes only the currently focused window/tab
        driver.quit();  // closing all the opened browsers



    }
}
