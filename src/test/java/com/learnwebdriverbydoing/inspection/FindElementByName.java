package com.learnwebdriverbydoing.inspection;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

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

        driver.get(baseUrl + "/" + "basic_html_form.html");

        // Determine how to locate to element on the page
        By submitButtonLocator = By.name("submitbutton");

// Tried using a different field : Username
//        By usernameLocator = By.name("username");
//        WebElement usernameField = driver.findElement(usernameLocator);
//        assertThat(usernameField.getSize(), is(equalTo(15)));

        List<WebElement> buttons = driver.findElements(submitButtonLocator);

//        WebElement submitButton = null;

        for (WebElement button : buttons) {

            String type =  button.getAttribute("type");
// remove            System.out.println(type);

            if (type.equals("submit")) {

// ****** FIX THIS -- figure out how to set a WebElement element to another
//                submitButton = button;
                assertThat(button.getAttribute("value"), is("submit"));
            }
        }

/*        try {
        // Verify button text
            assertThat(submitButton.getAttribute("value"), is("submit"));

        } catch (NullPointerException e) {
            System.out.println("getMessage - " + e.getMessage());
            System.out.println("getStackTrace - " + e.getStackTrace());
        }
*/
        driver.close();
    }

}
