package com.learnwebdriverbydoing.navigation;

import com.learnwebdriverbydoing.BasicWDSetup;
import org.junit.After;

/**
 * This class contains variables and methods common to the other classes in this package
 */

public class BasicWDSetupForNavigation extends BasicWDSetup {

//    WebDriver driver;
//    String baseUrl;
//    String pageTitle;

/*    @Before
    public void setUp() {
        driver = new FirefoxDriver();
//        baseUrl = "http://www.waveville.net/~dforshaw/seleniumTestPages-ajr/pages";
    }
*/
    @After
    public void tearDown() {
        driver.close();
    }
}
