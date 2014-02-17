package com.learnwebdriverbydoing.navigation;

import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.*;


/**
 * This class contains variables and methods common to the other classes in this package
 */

public class BasicWDSetupForNavigation {

    WebDriver driver;
    String baseUrl;
    String pageTitle;

    @Before
    public void setUp() {
        driver = new FirefoxDriver();
        baseUrl = "http://www.waveville.net/~dforshaw/seleniumTestPages-ajr/pages";
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
