package com.learnwebdriverbydoing.interaction;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * This class contains variables and methods common to the other classes in this package
 */

public class BasicWDSetupForInteraction {

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
