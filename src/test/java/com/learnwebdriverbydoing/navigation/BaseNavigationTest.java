package com.learnwebdriverbydoing.navigation;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseNavigationTest {

    WebDriver driver;
    String baseUrl;

    @Before
    public void setUp() {
        driver = new FirefoxDriver();
        baseUrl = "http://www.compendiumdev.co.uk";
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
