package Tasks;

import org.openqa.selenium.WebDriver;

import Framework.Utils.FakersGeneration;
import Framework.Utils.FileOperation;
import PageObjects.CheckoutPage;
import Validations.CheckoutValidation;
import Validations.GenericValidation;

public class CheckoutTask {

    private WebDriver driver;
    private CheckoutPage checkoutPage;
    private GenericValidation genericValidation;
    private FakersGeneration fakers;
    private CheckoutValidation checkoutValidation;
    
    public CheckoutTask(WebDriver driver) {
        
        this.driver = driver;
        checkoutPage = new CheckoutPage(this.driver);
        genericValidation = new GenericValidation(this.driver);
        fakers = new FakersGeneration();
        checkoutValidation = new CheckoutValidation(this.driver);
    }
    
    public void preencherForm() {
        
        genericValidation.validationPages("Checkout: Your Information");
        checkoutPage.getFirstNameInput().sendKeys(fakers.getFirstName());
        checkoutPage.getLastNameInput().sendKeys(fakers.getLastName());
        checkoutPage.getZipCodeInput().sendKeys(fakers.getZipCode());
        checkoutValidation.validationForm();
        checkoutPage.getContinueButton().click();
        genericValidation.validationPages("Checkout: Overview");
        genericValidation.validationProduto();
        checkoutPage.getFinishButton().click();
    }
    
    public void preencherForm2() {
        
        String name = fakers.getFirstName();
        String lastName = fakers.getLastName();
        String zipCode = fakers.getZipCode();
        FileOperation.setProperties("form", "name", name);
        FileOperation.setProperties("form", "lastname", lastName);
        FileOperation.setProperties("form", "zip", zipCode);
        

        genericValidation.validationPages("Checkout: Your Information");
        checkoutPage.getFirstNameInput().sendKeys(name);
        checkoutPage.getLastNameInput().sendKeys(lastName);
        checkoutPage.getZipCodeInput().sendKeys(zipCode);
        checkoutValidation.validationCamposForm();
        checkoutPage.getContinueButton().click();
        genericValidation.validationPages("Checkout: Overview");
        genericValidation.validationProduto();
        checkoutPage.getFinishButton().click();
    }
}
