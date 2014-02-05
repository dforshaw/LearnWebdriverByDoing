package com.learnwebdriverbydoing.inspection;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * This is an example of how to use the Webdriver API commands: getCurrentUrl
 */

public class GetCurrentUrlExample extends BasicWDSetupForInspection {

    @Test
    public void GetCurrentUrlExampleTest() {

        driver.get(baseUrl);
        url = driver.getCurrentUrl();
        System.out.println("Current URL: " + url);
        assertThat(url, is(baseUrl));

        driver.navigate().to(baseUrl + "basic_web_page.html");
        url = driver.getCurrentUrl();
        System.out.println("Current URL: " + url);
        assertThat(url, is(baseUrl + "basic_web_page.html"));

        driver.close();
    }
}