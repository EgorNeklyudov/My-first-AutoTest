package com.steam;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Tests extends WebDriverSettings {

    @Test
    public void firstTest() {
        driver.get("https://store.steampowered.com/");
        String url = driver.getCurrentUrl();
        Assert.assertTrue(url.equals("https://store.steampowered.com/"));
    }

    @Test
    public void secondTest() {
        mainPage.inputGame(ConfProperties.getProperty("game"));
        mainPage.clickSearchingButton();
        String result = secondPage.getSearchingText();
        Assert.assertEquals(ConfProperties.getProperty("game"),result);
    }

}
