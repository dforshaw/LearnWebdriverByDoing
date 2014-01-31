package com.learnwebdriverbydoing.navigation;

// This is an example of how to use the Webdriver API command: Navigate to

import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class NavigateToExample extends BaseNavigationTest {

    @Test
    public void NavigateToExampleTest() {

        driver.navigate().to(baseUrl + "/selenium");

        assertTrue("Verify Title", driver.getTitle().startsWith("Selenium Simplified"));

        driver.close();
    }
}
