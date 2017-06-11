package com.dfexamples.eviltester.inspection;

import com.dfexamples.eviltester.BasicWDSetup;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * This class contains variables and methods common to the other classes in this package
 */

public class BasicWDSetupForInspection extends BasicWDSetup {

    String pageTitle;
    String url;

    @Before
    public void setUp() {
        driver = new FirefoxDriver();
    }

    @After
    public void tearDown() {
        driver.close();
    }
}
