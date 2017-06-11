package com.dfexamples.eviltester.inspection;

import org.junit.*;
import org.openqa.selenium.*;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

/**
 * This is an example of how to use the Webdriver API commands:
 *      findElement
 *      By.id
 *      getText
 */

public class FindElementById extends BasicWDSetupForInspection {

    @Test
    public void FindElementByIdTest() {

        driver.get(baseUrl + "/" + "basic_web_page.html");

        // Determine how to locate to element on the page
        By text1Locator = By.id("para1");

        // Name the element on the page and hook it to the locator
        WebElement text1 = driver.findElement(text1Locator);

        // Identify characteristic to confirm
        String observedValue = text1.getText();

        assertThat(observedValue, is("A paragraph of text"));

        driver.close();
    }
}
