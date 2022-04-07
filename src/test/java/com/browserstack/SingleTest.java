package com.browserstack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SingleTest extends BrowserStackTestNGTest {

    @Test
    public void test() throws Exception {
        driver.get("https://www.google.com/ncr");
        WebElement element = driver.findElement(By.name("q"));
        element.sendKeys("Priyanka Chopra");
        element.submit();
        Thread.sleep(5000);

        Assert.assertTrue(driver.getTitle().matches("(?i)Priyanka Chopra - Google Search"));
    }
}
