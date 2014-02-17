package com.learnwebdriverbydoing.inspection;

import org.junit.*;
import org.openqa.selenium.*;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

/**
 * This is an example of how to use the Webdriver API commands:
 *      findElement
 *      By.cssSelector
 *      getText
 */

public class FindElementByCssSelector extends BasicWDSetupForInspection {

    @Test
    public void FindElementByCssSelectorTest() {

        driver.get(baseUrl + "/" + "gui_user_interactions.html");

        // Determine how to locate to element on the page
        By cssLocator = By.cssSelector(".draggable");

        // Name the element on the page and hook it to the locator
        WebElement cssSelection = driver.findElement(cssLocator);

        // Identify characteristic to confirm
        String observedValue = cssSelection.getText();

        assertThat(observedValue, is("Drag me"));

        driver.close();
    }
}
