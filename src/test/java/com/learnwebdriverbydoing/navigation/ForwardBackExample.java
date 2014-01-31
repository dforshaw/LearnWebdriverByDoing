package com.learnwebdriverbydoing.navigation;

import org.junit.Assert;
import org.junit.Test;

/**
 * This is an example of how to use the Webdriver API commands: Forward & Back
 */

public class ForwardBackExample extends BaseNavigationTest {

    @Test
    public void ForwardBackExampleTest() {
        driver.navigate().to(baseUrl + "/selenium");

        driver.navigate().to(baseUrl + "/page.php?title=books");

        driver.navigate().back();
        Assert.assertTrue("Verify Title - Main Page", driver.getTitle().startsWith("Selenium Simplified"));

        driver.navigate().forward();
        Assert.assertTrue("Verify Title - Books Page", driver.getTitle().startsWith("Our Books"));
    }
}
