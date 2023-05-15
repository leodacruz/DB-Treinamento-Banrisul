package Validations;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

import Framework.Utils.FileOperation;
import PageObjects.CheckoutPage;
import PageObjects.GenericPage;

public class CheckoutValidation {
    
    private WebDriver driver;
    private CheckoutPage checkoutPage;
    
    public CheckoutValidation(WebDriver driver) {
        
        this.driver=driver;
        checkoutPage = new CheckoutPage(this.driver);
        
    }
    
    public void validationForm() {
        
        Assertions.assertFalse(checkoutPage.getFirstNameInput().getAttribute("value").equalsIgnoreCase(" "));
    }
    
    public void validationCamposForm() {
        
        String name = FileOperation.getProperties("form").getProperty("name");
        String lastName = FileOperation.getProperties("form").getProperty("lastname");
        String zipCode= FileOperation.getProperties("form").getProperty("zip");
        Assertions.assertEquals(name,checkoutPage.getFirstNameInput().getAttribute("value"));
        Assertions.assertEquals(lastName,checkoutPage.getLastNameInput().getAttribute("value"));
        Assertions.assertEquals(zipCode,checkoutPage.getZipCodeInput().getAttribute("value"));
    }

}
