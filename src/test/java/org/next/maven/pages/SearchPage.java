package org.next.maven.pages;

import com.sun.tools.javac.comp.Enter;
import net.bytebuddy.asm.Advice;
import org.next.maven.drivers.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SearchPage extends DriverFactory {

    public void doSearch(String searchTerm){
        driver.findElement(By.id("sli_search_1")).sendKeys(searchTerm);
        driver.findElement(By.className("SearchButton")).click();
    }

}

