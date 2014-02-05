package com.learnwebdriverbydoing.inspection;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * This is an example of how to use the Webdriver API commands: getTitle
 */

public class GetTitleExample extends BasicWDSetupForInspection {

    @Test
    public void GetTitleExampleTest() {

        driver.get(baseUrl);
        pageTitle = driver.getTitle();
        System.out.println("Current Title: " + pageTitle);
        assertThat(pageTitle, is("Selenium Test Pages"));

        driver.close();
    }
}