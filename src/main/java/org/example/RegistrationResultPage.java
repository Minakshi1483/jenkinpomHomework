package org.example;

import org.openqa.selenium.By;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class RegistrationResultPage  extends Utils {
   private By _registerSuccessMessage = By.className("result");
   String expected = "Your registration completed";

    public void verifyUserSeeRegistrationSuccessMessage(){
       assertURL("registerresult");
       assertTextMessage("Your registration completed",expected,_registerSuccessMessage);
    }

}

