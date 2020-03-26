package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.Currency;
import java.util.List;

import static java.lang.Thread.sleep;
import static org.testng.Assert.assertTrue;

public class TestSuit extends BaseTest {
    HomePage homePage = new HomePage();
    RegistrationPage registrationPage = new RegistrationPage();
    RegistrationResultPage registrationResultPage = new RegistrationResultPage();
    CurrencyChange currencyChange = new CurrencyChange();
    CurrencyChangeResultPage CurrencyChangeResultPage = new CurrencyChangeResultPage();


    @Test
    public void userShouldAbleToRegisterSuccessfully() {

        homePage.clickOnRegisterButton();
        registrationPage.verifyUserOnRegisterPage();
        registrationPage.userEnterRegistrationDetails();
        registrationResultPage.verifyUserSeeRegistrationSuccessMessage();


    }

    @Test
    public void printPriceForEachProduct() {
        List<WebElement> productList = driver.findElements(By.xpath("//span[@class='price actual-price']"));
        for (WebElement we : productList) {
            System.out.println(we.getText());
            System.out.println("***********");
            assertTrue(we.getText().contains("$"), "$ not found in price " + we.getText());
        }
    }

    @Test
    public void userShouldBeAbleToCurrencyChange() {

        CurrencyChange.selectCurrencyUsDollarToEuro();
        CurrencyChangeResultPage.verifycurrencyChangeUSDollarToEuro(driver);

        CurrencyChange.selectCurrencyEuroToDollar();
        CurrencyChangeResultPage.verifycurrencyChangeEuroToUSDollar(driver);

    }

}