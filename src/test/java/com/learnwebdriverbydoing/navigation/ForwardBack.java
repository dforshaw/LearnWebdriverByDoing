package com.learnwebdriverbydoing.navigation;

import org.junit.*;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

/**
 * This is an example of how to use the Webdriver API commands: Forward & Back
 */

public class ForwardBack extends BasicWDSetupForNavigation {

    @Test
    public void ForwardBackTest() {

        driver.navigate().to(baseUrl);
        driver.navigate().to(baseUrl + "/" + "basic_web_page.html");

        driver.navigate().back();
        pageTitle = driver.getTitle();
        assertThat(pageTitle, is("Selenium Test Pages"));

        driver.navigate().forward();
        pageTitle = driver.getTitle();
        assertThat(pageTitle, is("Basic Web Page Title"));

        driver.close();
    }
}
