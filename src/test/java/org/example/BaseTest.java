package org.example;


import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

public class BaseTest  extends Utils {
    BrowserSelector browserSelector = new BrowserSelector();


    @BeforeTest
    //open browser
    public void openBrowser() {
        browserSelector.openBrowser();
    }

    @AfterTest
    //close browser
    public void closeBrowser() {
        browserSelector.quitBrowser();
    }

}






