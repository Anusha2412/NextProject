package org.next.maven;

import org.junit.After;
import org.junit.Before;
import org.next.maven.drivers.DriverFactory;
import org.openqa.selenium.WebElement;

public class Hooks {

    DriverFactory factory = new DriverFactory();


@Before
    public void setUp(){
        factory.openBrowser();
        factory.navigateTo("https://www.next.co.uk/");
        factory.maxBrowser();
        factory.applyImplicitWaits();
    }

   // @After
   // public void tearDown(){
   // factory.closeBrowser();
   // }

}
