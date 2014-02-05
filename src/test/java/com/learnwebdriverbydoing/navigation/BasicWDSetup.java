package com.learnwebdriverbydoing.navigation;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasicWDSetup {

    WebDriver driver;
    String baseUrl;

    @Before
    public void setUp() {
        driver = new FirefoxDriver();
        baseUrl = "http://www.waveville.net/~dforshaw/seleniumTestPages-ajr/pages/";
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}