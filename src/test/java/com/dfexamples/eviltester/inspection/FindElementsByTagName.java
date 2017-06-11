package com.dfexamples.eviltester.inspection;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * This is an example of how to use the Webdriver API commands:
 *      findElements
 *      By.tagName
 *      size
 *
 *      Note that when locating by tagName that findElements should be used instead of findElement
 */

public class FindElementsByTagName extends BasicWDSetupForInspection {

    @Test
    public void FindElementsByTagNameTest() {

        driver.get(baseUrl + "/" + "basic_html_form.html");

        // Determine how to locate to element on the page
        By tagLocator = By.tagName("textarea");

        // Name the elements on the page and hook them to the locator
        List<WebElement> textboxes = driver.findElements(tagLocator);

        // Identify characteristic to confirm
        Integer observedValue = textboxes.size();

        assertThat(observedValue, is(1));

        driver.close();
    }
}
