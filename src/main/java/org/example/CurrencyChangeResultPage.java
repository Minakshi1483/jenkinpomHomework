package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CurrencyChangeResultPage extends Utils {

    public static void verifycurrencyChangeUSDollarToEuro(WebDriver driver) {
    }

    public static void verifycurrencyChangeEuroToUSDollar(WebDriver driver) {
    }

    public void verifychangeCurrencyChangeUsDollarsToEuro()
    {
        //     SoftAssert softAssert = new SoftAssert();
        List<WebElement> productPrice = driver.findElements(By.xpath("//span[@class=\"price actual-price\"]"));
        for (WebElement we:productPrice)
        {
            //         softAssert.assertTrue(we.getText().contains("Ђ"),"Ђ is not found in"+we.getText());
        }
        //     softAssert.assertAll();
        System.out.println("please check your currency");
    }
    //........Verify Currency Change From Euro To Us Dollar...............

    public void verifycurrencyChangeEuroToUsDollar()
    {
        //    SoftAssert softAssert = new SoftAssert();
        List<WebElement>productprice = driver.findElements(By.xpath("//span[@class=\"price actual-price\"]"));
        for (WebElement we:productprice)
        {
            //        softAssert.assertTrue(we.getText().contains("$"),"$ is not found in "+we.getText());
        }
        // ASSERT MESSAGE
        //    softAssert.assertAll();
        System.out.println("please check your currency");


    }

}
