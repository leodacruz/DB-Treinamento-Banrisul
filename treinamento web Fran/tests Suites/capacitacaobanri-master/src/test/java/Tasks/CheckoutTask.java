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
	private CheckoutValidation checkoutValidation;
	private FakersGeneration fakers;
	
	public CheckoutTask(WebDriver driver) {
		
		this.driver = driver;
		checkoutPage = new CheckoutPage(this.driver);
		genericValidation = new GenericValidation(this.driver);
		checkoutValidation = new CheckoutValidation(this.driver);
		fakers = new FakersGeneration();
	}

	public void preencherForm() {
		
		checkoutPage.getFirstNameTextField().sendKeys(fakers.getFirstName());
		checkoutPage.getLastNameTextField().sendKeys(fakers.getLastName());
		checkoutPage.getZipTextField().sendKeys(fakers.getZipCode());
		checkoutValidation.validationForm();
		checkoutPage.getContinueButton().click();
		genericValidation.validationPageCheckoutOverview();
		genericValidation.validationProduct();
		checkoutPage.getFinishButton().click();
		genericValidation.validationPageFinish();
		
	}
	
	
	public void preencherForm2() {
		
		String name = fakers.getFirstName();
		String lastName= fakers.getLastName(); 
		String zipCode = fakers.getZipCode();
		FileOperation.setProperties("form", "name", name);
		FileOperation.setProperties("form", "lastname", lastName);
		FileOperation.setProperties("form", "zip", zipCode);
		
		checkoutPage.getFirstNameTextField().sendKeys(name);
		checkoutPage.getLastNameTextField().sendKeys(lastName);
		checkoutPage.getZipTextField().sendKeys(zipCode);
		checkoutValidation.validationCamposForm();
		checkoutPage.getContinueButton().click();
		genericValidation.validationPageCheckoutOverview();
		genericValidation.validationProduct();
		checkoutPage.getFinishButton().click();
		genericValidation.validationPageFinish();
		
	}
	
	
}
