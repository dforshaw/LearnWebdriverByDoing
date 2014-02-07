package com.learnwebdriverbydoing.navigation;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * This is an example of how to use the Webdriver API commands: Get
 */

public class Get extends BasicWDSetupForNavigation {

    @Test
    public void GetTest() {

        driver.get(baseUrl);
        pageTitle = driver.getTitle();
        assertThat(pageTitle, is("Selenium Test Pages"));

        driver.close();
    }
}
