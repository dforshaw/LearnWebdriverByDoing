package com.learnwebdriverbydoing.navigation;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * This is an example of how to use the Webdriver API commands: Get
 */

public class GetExample extends BasicWDSetupForNavigation {

    @Test
    public void GetExampleTest() {

        driver.get(baseUrl);
        pageTitle = driver.getTitle();
        assertThat(pageTitle, is("Selenium Test Pages"));

        driver.close();
    }
}
