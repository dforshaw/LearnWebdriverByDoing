package com.learnwebdriverbydoing.navigation;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * This is an example of how to use the Webdriver API commands: Navigate To
 */

public class NavigateTo extends BasicWDSetupForNavigation {

    @Test
    public void NavigateToTest() {

        driver.navigate().to(baseUrl);
        pageTitle = driver.getTitle();
        assertThat(pageTitle, is("Selenium Test Pages"));

        driver.close();
    }
}
