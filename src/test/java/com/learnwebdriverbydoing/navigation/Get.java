package com.learnwebdriverbydoing.navigation;

import org.junit.*;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

/**
 * This is an example of how to use the Webdriver API commands: Get
 */

public class Get extends BasicWDSetupForNavigation {

    @Test
    public void GetTest() {

        driver.get(baseUrl);
        pageTitle = driver.getTitle();
        assertThat(pageTitle, is("Selenium Test Pages"));
    }
}
