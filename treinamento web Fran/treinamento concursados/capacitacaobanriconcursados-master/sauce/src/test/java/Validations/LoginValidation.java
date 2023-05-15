package Validations;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.Status;

import PageObjects.LoginPage;
import Report.Report;
import Report.Screenshot;

public class LoginValidation {
    
    private  WebDriver driver;
    private LoginPage loginPage;

    public LoginValidation(WebDriver driver) {
        
        this.driver = driver;
        loginPage = new LoginPage(this.driver);
    }
    
    public void validationLoginPage() {
        
        try {
            Assertions.assertTrue(loginPage.getLogoText().isDisplayed());
            Report.log(Status.PASS, "Acessou a página de Login corretamente", Screenshot.captureBase64(driver));
            
        }catch (Exception e) {
            
            Report.log(Status.FAIL, e.getMessage(), Screenshot.captureBase64(driver));
        }
    }
}
