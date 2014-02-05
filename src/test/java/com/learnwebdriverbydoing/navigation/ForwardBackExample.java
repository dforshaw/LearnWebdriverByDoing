package com.learnwebdriverbydoing.navigation;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * This is an example of how to use the Webdriver API commands: Forward & Back
 */

public class ForwardBackExample extends BasicWDSetup {

    @Test
    public void ForwardBackExampleTest() {

        driver.navigate().to(baseUrl);
        driver.navigate().to(baseUrl + "/basic_web_page.html");

        driver.navigate().back();
        pageTitle = driver.getTitle();
        assertThat(pageTitle, is("Selenium Test Pages"));

        driver.navigate().forward();
        pageTitle = driver.getTitle();
        assertThat(pageTitle, is("Basic Web Page Title"));

        driver.close();
    }
}
