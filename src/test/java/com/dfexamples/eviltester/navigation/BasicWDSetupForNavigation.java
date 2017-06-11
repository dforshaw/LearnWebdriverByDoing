package com.dfexamples.eviltester.navigation;

import com.dfexamples.eviltester.BasicWDSetup;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * This class contains variables and methods common to the other classes in this package
 */

public class BasicWDSetupForNavigation extends BasicWDSetup {

    String pageTitle;

    @Before
    public void setUp() {
        driver = new FirefoxDriver();
    }

    @After
    public void tearDown() {
        driver.close();
    }
}
