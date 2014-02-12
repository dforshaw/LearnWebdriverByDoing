package com.learnwebdriverbydoing.inspection;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class FindElementByXpath extends BasicWDSetupForInspection {
    @Test
    public void FindElementByXpathTest() {

        driver.get(baseUrl + "/" + "basic_html_form.html");

        // Determine how to locate to element on the page
        By submitButtonLocator = By.xpath("//input[@type='submit']");

        // Name the element on the page and hook it to the locator
        WebElement submitButton = driver.findElement(submitButtonLocator);

        // Identify characteristic to confirm
        String observedValue = submitButton.getAttribute("value");

        assertThat(observedValue, is("submit"));

        driver.close();
    }
}

// #HTMLFormElements > table:nth-child(1) > tbody:nth-child(1) > tr:nth-child(9) > td:nth-child(1) > input:nth-child(2)
// document.HTMLFormElements.submitbutton[1]