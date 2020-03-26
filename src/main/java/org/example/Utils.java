package org.example;


import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;

public class Utils extends BasePage{
    public static void clickOnElement(By by) {

        driver.findElement(by).click();

    }
    // create method for sendtext
    public static void sendText(By by, String text) {

        driver.findElement(by).sendKeys(text);
    }
    //To get text
    public static String getTextFromElement(By by)
    {
        return driver.findElement(by).getText();
    }

    public static void selectTextFromDropDown(By by, String text) {
        Select selectCountry = new Select(driver.findElement(by));
        selectCountry.selectByValue(text);
    }

    //  method for timestamp

    public static String createTimeStamp() {
        return new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
    }

    // create method for gettext
    public static String getTextfromElement(By by) {
        return driver.findElement(by).getText();
    }

    // asserturl
    public static void assertURL(String text) {
        Assert.assertTrue(driver.getCurrentUrl().contains(text));

    }
    //To compare array
    public void compareArray(String accepted[],String actual[]) {
        org.junit.Assert.assertArrayEquals("price is Not high to low", accepted, actual);
    }


    //asserttextmessage
    public static void assertTextMessage(String message, String expected, By by) {
        String actual = getTextfromElement(by);
        Assert.assertEquals(message, expected, actual);
    }

    //to scroll and click
    public static void scrollAndClick(By by) {
        WebElement element = driver.findElement(by);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        element.click();

    }

    public static void timeDelay(int time) {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    //  creating method for    selectFromDropDownByVisible Text
    public static void selectFromDropDownByVisibleText(By by, String text) {


        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Select select = new Select(driver.findElement(by));
        select.selectByVisibleText(text);

    }


    //select from dropdown by value
    public static void selectFromDropdownByValue(By by, String text) {
        Select select = new Select(driver.findElement(by));
        select.selectByValue(text);
    }

    //select from dropdown by index method
    public static void selectFromDropdownByIndex(By by, int index) {
        Select select = new Select(driver.findElement(by));
        select.selectByIndex(index);
    }



    // method for enter text
    public static void enterText(By by, String text) {
        driver.findElement(by).sendKeys(text);
        waitForClickable(by, 60);
    }

    static void waitForClickable(By by, int i) {
        //WebDriverWait wait = new WebDriverWait(driver, time);
        //wait.until(ExpectedConditions.elementToBeClickable(by));
    }

    protected void addProductsForComparison() {
    }
}






