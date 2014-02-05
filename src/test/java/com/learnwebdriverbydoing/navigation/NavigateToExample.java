package com.learnwebdriverbydoing.navigation;

import org.junit.Test;
import static org.junit.Assert.assertTrue;

/**
 * This is an example of how to use the Webdriver API commands: Navigate To
 */

public class NavigateToExample extends BaseNavigationTest {

    @Test
    public void NavigateToExampleTest() {

        driver.navigate().to(baseUrl + "/selenium");

        assertTrue("Verify Title", driver.getTitle().startsWith("Selenium Simplified"));

        driver.close();
    }
}
