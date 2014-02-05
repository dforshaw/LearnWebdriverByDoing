package com.learnwebdriverbydoing.navigation;

import org.junit.Test;
import static org.junit.Assert.assertTrue;

/**
 * This is an example of how to use the Webdriver API commands: Navigate To
 */

public class NavigateToExample extends BasicWDSetup {

    @Test
    public void NavigateToExampleTest() {

        driver.navigate().to(baseUrl);

        assertTrue("Verify Title", driver.getTitle().startsWith("Selenium Test Pages"));

        driver.close();
    }
}
