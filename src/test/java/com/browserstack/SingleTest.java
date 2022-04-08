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

        //Assertion 1
        Assert.assertTrue(driver.getTitle().matches("(?i)Priyanka Chopra - Google Search"));
        
        //Assertion 2
        WebElement btnSongs = driver.findElement(By.xpath("//a[text()='Nick Jonas']"));
        Assert.assertEquals(true, btnSongs.isDisplayed());
        
        //Assertion 3
        WebElement txtActress = driver.findElement(By.xpath("//div[text()='Indian actress']"));
        Assert.assertEquals(true, txtActress.isEnabled());
        
    }
}
