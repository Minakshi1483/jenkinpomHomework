package org.example;

import org.openqa.selenium.By;

public class RegistrationPage extends Utils {

    private By _firstName = By.id("FirstName");
   private By _lastName = By.id("LastName");
   private By _email = By.id("Email");
   private By _password = By.id("Password");
   private By _confirmPassword = By.id("ConfirmPassword"); private By _registerButton = By.id("register-button");
  // private String firstName = "Meena";
 //  private String lastName = "patel";
    private static String timestamp = createTimeStamp();

    LoadProp loadProp=new LoadProp();
     private String firstName=loadProp.getProperty("firstName");
    private String lastName=loadProp.getProperty("lastName");
     private String email=loadProp.getProperty("email");
 private String password =loadProp.getProperty("password");
    private String confirmPassword =loadProp.getProperty("confirmPassword");

   public void verifyUserOnRegisterPage() {
        assertURL("register");
   }

    public void userEnterRegistrationDetails() {
        try {
            Thread.sleep(2000);
       } catch (InterruptedException e) {
           e.printStackTrace();
       }
       sendText(_firstName, firstName);
       sendText(_lastName, lastName);
       sendText(_email, "testtest+" + timestamp + "@gmail.com");
       sendText(_password, "testtest");
       sendText(_confirmPassword, "testtest");
        clickOnElement(_registerButton);

    }
}