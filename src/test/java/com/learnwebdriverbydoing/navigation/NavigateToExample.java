package com.learnwebdriverbydoing.navigation;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * This is an example of how to use the Webdriver API commands: Navigate To
 */

public class NavigateToExample extends BasicWDSetup {

    @Test
    public void NavigateToExampleTest() {

        driver.navigate().to(baseUrl);
        pageTitle = driver.getTitle();
        assertThat(pageTitle, is("Selenium Test Pages"));

        driver.close();
    }
}
