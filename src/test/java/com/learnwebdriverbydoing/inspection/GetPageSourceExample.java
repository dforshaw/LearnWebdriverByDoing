package com.learnwebdriverbydoing.inspection;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;


/**
 * This is an example of how to use the Webdriver API commands: getPageSource
 */

public class GetPageSourceExample extends BasicWDSetupForInspection {

    @Test
    public void GetPageSourceExampleTest() {

        driver.get(baseUrl + "/" + "basic_web_page.html");
        String pageSource = driver.getPageSource();
        System.out.println(pageSource);
        assertThat(pageSource, containsString("<title>Basic Web Page Title</title>"));

        driver.close();
    }
}
