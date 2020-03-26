package org.example;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class BrowserSelector extends Utils {

    public static LoadProp loadProp = new LoadProp();
    public static final String USERNAME = loadProp.getProperty("SAUCE_USERNAME");
    public static final String ACCESS_KEY = loadProp.getProperty("SAUCE_ACCESS_KEY");
    public static final String URL = "http://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.eu-central-1.saucelabs.com/wd/hub";

    public static final boolean SAUCE_LAB = Boolean.parseBoolean(System.getProperty("Sauce"));
    public static final String browser = System.getProperty("browser");


    public static void openBrowser()
    {
        System.out.println(USERNAME);
        System.out.println(ACCESS_KEY);
        // If sauce lab is true .....................................................

        if (SAUCE_LAB)
        {
            System.out.println("Running in Saucelab ........................ with browser" + browser);

            if (browser.equalsIgnoreCase("chrome"))
            {

                DesiredCapabilities caps = DesiredCapabilities.chrome();
                caps.setCapability("platform", "Windows 8");
                caps.setCapability("version", "78.0");

                try {
                    driver = new RemoteWebDriver(new URL(URL), caps);
                    driver.get("https://demo.nopcommerce.com/");
                } catch (MalformedURLException e)
                {
                    e.printStackTrace();

                }
            } else if (browser.equalsIgnoreCase("FireFox"))
            {
                DesiredCapabilities caps = DesiredCapabilities.firefox();
                caps.setCapability("platform", "Windows 7");
                caps.setCapability("version", "54");
                caps.setCapability("value", "Testing on Firefox 54");

                try {
                    driver = new RemoteWebDriver(new URL(URL), caps);
                    driver.get("https://demo.nopcommerce.com/");
                } catch (MalformedURLException e) {
                    e.printStackTrace();
                }
            } else
            {
                System.out.println("Wrong browser name or empty" + browser);
            }
        }
        // if sauce lab is false ..........................................................
        else
        {

            if (browser.equalsIgnoreCase("chrome"))
            {
                System.setProperty("webdriver.chrome.driver", "src/test/resources/BrowserDriver/chromedriver.exe");
                driver = new ChromeDriver();
                driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
                driver.manage().window().maximize();
                driver.get("https://demo.nopcommerce.com/");
            }
            else if (browser.equalsIgnoreCase("firefox"))
            {
                System.setProperty("webdriver.gecko.driver", "src/test/resources/BrowserDriver/geckodriver.exe");
                driver = new FirefoxDriver();
                driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
                driver.manage().window().maximize();
                driver.get("https://demo.nopcommerce.com/");
            } else
            {
                System.out.println("You have selected wrong browser" + browser);
            }
        }
    }
    public void quitBrowser()
    {
        driver.quit();
    }
}