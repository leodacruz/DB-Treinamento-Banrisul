package Tasks;

import org.openqa.selenium.WebDriver;

import Framework.Browser.Waits;
import Framework.Utils.FakersGeneration;
import PageObjects.CheckoutPage;
import PageObjects.FinishPage;
import PageObjects.LoginPage;
import Validations.CheckoutValidation;
import Validations.FinishValidation;
import Validations.GenericValidation;
import Validations.LoginValidation;

public class FinishTask {

    
    private WebDriver driver;
    private FinishPage finishPage;
    private FinishValidation finishValidation;
    private LoginValidation loginValidation;
    private Waits wait;
    private LoginPage loginPage;
    
    public FinishTask (WebDriver driver) {
        
        this.driver = driver;
        finishPage = new FinishPage (this.driver);
        finishValidation = new FinishValidation(this.driver);
        wait = new Waits(this.driver);
        loginValidation = new LoginValidation(this.driver);
        loginPage = new LoginPage(this.driver);
    }
    
    public void finalizarCompra() {
        
        finishValidation.validationMessageCompra();
        finishPage.getMenuLogoutButton().click();
        finishPage.getLogoutLink().click();
        wait.loadElement(loginPage.getLogoText());
        loginValidation.validationLoginPage();
  
    }
}
