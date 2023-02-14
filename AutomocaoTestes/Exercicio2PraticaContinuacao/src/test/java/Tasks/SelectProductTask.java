package Tasks;

import org.openqa.selenium.WebDriver;

import PageObject.CartPage;
import PageObject.SelectProductPage;
import Validations.GenericValidation;

public class SelectProductTask {
	private WebDriver driver;
	private SelectProductPage selectProductPage;
	private GenericValidation genericValidation;
    private CartPage cartPage;
	public SelectProductTask(WebDriver driver) {
		this.driver = driver;
		this.selectProductPage = new SelectProductPage(this.driver);
	    this.genericValidation= new GenericValidation(this.driver);
	    this.cartPage = new CartPage(this.driver);
	}
	
	
	public void selecionarProducts() throws InterruptedException {
		selectProductPage.getAddToCart().click();
		selectProductPage.getCartButton().click();
		genericValidation.validationPagePageCart();
	    genericValidation.validationPagePageCartProduct();
	    cartPage.getCheckoutButton().click();
	    Thread.sleep(2000);
	    genericValidation.validationPageCheckout();
	}
}
