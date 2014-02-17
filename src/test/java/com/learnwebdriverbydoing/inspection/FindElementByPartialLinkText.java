package com.learnwebdriverbydoing.inspection;

import org.junit.*;
import org.openqa.selenium.*;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

/**
 * This is an example of how to use the Webdriver API commands:
 *      findElement
 *      By.partialLinkText
 *      getAttribute
 */

public class FindElementByPartialLinkText extends BasicWDSetupForInspection {

    @Test
    public void FindElementByPartialLinkTextTest() {

        driver.get(baseUrl + "/");

        // Determine how to locate to element on the page
        By partialLinkTextLocator = By.partialLinkText("Basic Web");

        // Name the element on the page and hook it to the locator
        WebElement weblink = driver.findElement(partialLinkTextLocator);

        // Identify characteristic to confirm
        String observedValue = weblink.getAttribute("href");

        assertThat(observedValue, is(baseUrl + "/basic_web_page.html"));

        driver.close();
    }
}
