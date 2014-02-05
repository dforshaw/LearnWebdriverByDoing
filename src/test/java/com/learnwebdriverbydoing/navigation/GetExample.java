package com.learnwebdriverbydoing.navigation;

import org.junit.Test;
import static org.junit.Assert.assertTrue;

/**
 * This is an example of how to use the Webdriver API commands: Get
 */

public class GetExample extends BasicWDSetup {

    @Test
    public void GetExampleTest() {

        driver.get(baseUrl + "/selenium");

        assertTrue("Verify Title", driver.getTitle().startsWith("Selenium Simplified"));

        driver.close();
    }
}
