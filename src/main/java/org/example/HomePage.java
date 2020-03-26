package org.example;

import org.openqa.selenium.By;

public class HomePage extends Utils {
    //Locator for register link
    private By _registerLink =By.linkText("Register");


    //T0 click on register link
    public void clickOnRegisterButton()
    {
        clickOnElement(_registerLink);
    }


}
