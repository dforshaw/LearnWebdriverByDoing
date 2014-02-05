package com.learnwebdriverbydoing.navigation;

import org.junit.Test;
import static org.junit.Assert.assertTrue;

/**
 * This is an example of how to use the Webdriver API commands: Forward & Back
 */

public class ForwardBackExample extends BasicWDSetup {

    @Test
    public void ForwardBackExampleTest() {
        driver.navigate().to(baseUrl);

        driver.navigate().to(baseUrl + "/basic_web_page.html");

        driver.navigate().back();
        assertTrue("Verify Title - Main Page", driver.getTitle().startsWith("Selenium Test Pages"));

        driver.navigate().forward();
        assertTrue("Verify Title - Basic Web Page", driver.getTitle().startsWith("Basic Web Page Title"));
    }
}
