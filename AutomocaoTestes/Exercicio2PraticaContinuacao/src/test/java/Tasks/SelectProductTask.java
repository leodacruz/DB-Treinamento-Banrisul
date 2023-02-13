package Tasks;

import org.openqa.selenium.WebDriver;

import PageObject.SelectProductPage;
import Validations.GenericValidation;

public class SelectProductTask {
	private WebDriver driver;
	private SelectProductPage selectProductPage;
	private GenericValidation genericValidation;

	public SelectProductTask(WebDriver driver) {
		this.driver = driver;
		this.selectProductPage = new SelectProductPage(this.driver);
	    this.genericValidation= new GenericValidation(this.driver);
	}
	
	
	public void selecionarProducts() {
		selectProductPage.getAddToCart().click();
		selectProductPage.getCartButton().click();
	}
}
