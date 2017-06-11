package com.dfexamples.eviltester.inspection;

import org.junit.*;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

/**
 * This is an example of how to use the Webdriver API commands: getCurrentUrl
 */

public class GetCurrentUrl extends BasicWDSetupForInspection {

    @Test
    public void GetCurrentUrlTest() {

        driver.get(baseUrl);
        url = driver.getCurrentUrl();
        System.out.println("Current URL: " + url);
        assertThat(url, is(baseUrl  + "/"));

        driver.navigate().to(baseUrl  + "/" + "basic_web_page.html");
        url = driver.getCurrentUrl();
        System.out.println("Current URL: " + url);
        assertThat(url, is(baseUrl + "/basic_web_page.html"));

        driver.close();
    }
}
