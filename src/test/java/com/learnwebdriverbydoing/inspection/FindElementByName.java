package com.learnwebdriverbydoing.inspection;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * This is an example of how to use the Webdriver API commands:
 *      findElement
 *      By.name
 *      getAttribute
 */

public class FindElementByName extends BasicWDSetupForInspection {

    @Test
    public void FindElementByNameTest() {

        driver.get(baseUrl + "/" + "search.php");

        // Determine how to locate to element on the page
        By searchButtonLocator = By.name("btnG");

        // Name the element on the page and hook it to the locator
        WebElement searchButton = driver.findElement(searchButtonLocator);

        // Identify characteristic to confirm
        String observedValue = searchButton.getAttribute("value");

        assertThat(observedValue, is("Search"));

        driver.close();
    }
}
