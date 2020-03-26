package org.example;

import org.openqa.selenium.By;

import static org.example.Utils.selectFromDropdownByValue;

public class CurrencyChange extends Utils {

    private static By _Changecurrency = By.xpath("//select[@id=\"customerCurrency\"]");

    //select and change currency from us Dollar to Euro
    public static void selectCurrencyUsDollarToEuro()
    {
        selectFromDropDownByVisibleText(_Changecurrency,"Euro");}

    //select and change currency from Euro to Us Dollar
    public static void selectCurrencyEuroToDollar()
    {
        selectFromDropDownByVisibleText(_Changecurrency,"US Dollar");


    }

}
