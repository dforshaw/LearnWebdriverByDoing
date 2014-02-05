package com.learnwebdriverbydoing.inspection;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasicWDSetupForInspection {

    WebDriver driver;
    String baseUrl;
    String pageTitle;
    String url;

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
