package com.learnwebdriverbydoing.navigation;

/**
 * This is an example of how to use the Webdriver API commands: Get
 */

import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class GetExample extends BaseNavigationTest {

    @Test
    public void GetExampleTest() {

        driver.get(baseUrl + "/selenium");

        assertTrue("Verify Title", driver.getTitle().startsWith("Selenium Simplified"));

        driver.close();
    }
}
