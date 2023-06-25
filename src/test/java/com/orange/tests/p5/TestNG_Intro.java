package com.orange.tests.p5;

import org.testng.annotations.Test;
import org.testng.annotations.*;

public class TestNG_Intro {

    @BeforeClass
    public void setupClass() {
        System.out.println("Before class running...");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("After class running...");
    }

    @BeforeMethod
    public void setupMethod() {
        System.out.println("Before Method running...");
    }

    @AfterMethod
    public void tearDownMethod() {
        System.out.println("TearDown Method running...");
    }

    @Test(priority = 2)
    public void test1() {
        System.out.println("Test 1 is running...");
    }

    @Test(priority = 1)
    public void test2() {
        System.out.println("Test 2 is running...");
    }


}
