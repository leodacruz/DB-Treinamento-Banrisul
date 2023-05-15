package Tasks;

import org.openqa.selenium.WebDriver;

import PageObjects.CartPage;
import PageObjects.SelectProductPage;
import Validations.GenericValidation;

public class SelectProductTask {
	
	private WebDriver driver;
	private SelectProductPage selectProductPage;
	private GenericValidation genericValidation;
	private CartPage cartPage;
	
	
	public SelectProductTask(WebDriver driver) {
		
		this.driver = driver;
		selectProductPage = new SelectProductPage(this.driver);
		genericValidation = new GenericValidation(this.driver);
		cartPage = new CartPage(this.driver);
	}
	
	
	
	
	public void selecionarProduto() {
		
		
		selectProductPage.getProductAddButton().click();
		selectProductPage.getCartButton().click();
		genericValidation.validationPageCart();
		genericValidation.validationProduct();
		cartPage.getCheckoutButton().click();
		genericValidation.validationPageCheckout();
		
		
	}
	

}
