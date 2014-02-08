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

        By searchButtonLocator = By.name("btnG");
        WebElement searchButton = driver.findElement(searchButtonLocator);
        assertThat(searchButton.getAttribute("value"), is("Search"));

        driver.close();
    }
}
