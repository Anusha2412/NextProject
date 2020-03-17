package org.next.maven.pages;

import org.next.maven.drivers.DriverFactory;
import org.openqa.selenium.By;

public class HomePage extends DriverFactory {

    public String getCurrentUrl(){
        return driver.getCurrentUrl();
    }
}
