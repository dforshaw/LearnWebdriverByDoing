package com.dfexamples.eviltester.inspection;

import org.junit.*;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;


/**
 * This is an example of how to use the Webdriver API commands: getPageSource
 */

public class GetPageSource extends BasicWDSetupForInspection {

    @Test
    public void GetPageSourceTest() {

        driver.get(baseUrl + "/" + "basic_web_page.html");
        String pageSource = driver.getPageSource();
        System.out.println(pageSource);
        assertThat(pageSource, containsString("<title>Basic Web Page Title</title>"));

        driver.close();
    }
}
