package com.learnwebdriverbydoing.inspection;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * This is an example of how to use the Webdriver API commands:
 *      findElement
 *      By.id
 *      getText
 */

public class FindElementByIdExample extends BasicWDSetupForInspection {

    @Test
    public void FindElementByIdExampleTest() {

        driver.get(baseUrl + "/" + "basic_web_page.html");

        // Determine how to locate to element on the page
        By text1Locator = By.id("para1");

        // Name the element on the page and hook it to the locator
        WebElement text1 = driver.findElement(text1Locator);

        assertThat(text1.getText(), is("A paragraph of text"));

        driver.close();
    }
}
