package com.dfexamples.eviltester.inspection;

import org.junit.*;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

/**
 * This is an example of how to use the Webdriver API commands: getTitle
 */

public class GetTitle extends BasicWDSetupForInspection {

    @Test
    public void GetTitleTest() {

        driver.get(baseUrl);
        pageTitle = driver.getTitle();
        System.out.println("Current Title: " + pageTitle);
        assertThat(pageTitle, is("Selenium Test Pages"));

        driver.close();
    }
}
