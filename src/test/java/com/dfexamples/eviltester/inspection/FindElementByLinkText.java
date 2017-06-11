package com.dfexamples.eviltester.inspection;

import org.junit.*;
import org.openqa.selenium.*;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

/**
 * This is an example of how to use the Webdriver API commands:
 *      findElement
 *      By.linkText
 *      getAttribute
 */

public class FindElementByLinkText extends BasicWDSetupForInspection {

    @Test
    public void FindElementByLinkTextTest() {

        driver.get(baseUrl + "/");

        // Determine how to locate to element on the page
        By linkTextLocator = By.linkText("Basic Web Page");

        // Name the element on the page and hook it to the locator
        WebElement weblink = driver.findElement(linkTextLocator);

        // Identify characteristic to confirm
        String observedValue = weblink.getAttribute("href");

        assertThat(observedValue, is(baseUrl + "/basic_web_page.html"));

        driver.close();
    }
}
