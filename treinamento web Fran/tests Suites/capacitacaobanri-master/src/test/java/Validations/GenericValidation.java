package Validations;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.Status;

import Framework.Browser.Waits;
import Framework.Report.Report;
import Framework.Report.Screenshot;
import PageObjects.GenericPage;

public class GenericValidation {
	
	
	private WebDriver driver;
	private Waits wait;
	private GenericPage genericPage;
	
	public GenericValidation(WebDriver driver) {
		
		this.driver = driver;
		genericPage = new GenericPage(this.driver);
		wait = new Waits(this.driver);

	}
	
	public void validationPageProducts() {
		
		try {
			wait.loadElement(genericPage.getHomeTextSpan());
			String label = genericPage.getHomeTextSpan().getText();
			Assertions.assertEquals("PRODUCTS", label);
			Report.log(Status.PASS, "Acessou a pagina de produtos com sucesso", Screenshot.captureBase64(driver));
		}catch(Exception e) {
			
			Report.log(Status.FAIL, e.getMessage(), Screenshot.captureBase64(driver));
		}
}
	
	public void validationPageCart() {
		
		try {
		
			wait.loadElement(genericPage.getHomeTextSpan());
			String label = genericPage.getHomeTextSpan().getText();
			Assertions.assertEquals("YOUR CART", label);
			Report.log(Status.PASS, "Acessou pagina de carrinho com sucesso", Screenshot.captureBase64(driver));
		
		}catch(Exception e) {
		
			Report.log(Status.FAIL, e.getMessage(), Screenshot.captureBase64(driver));
		}
}
	
	public void validationProduct() {
		
		try {
			wait.loadElement(genericPage.getProductLabel());
			String label = genericPage.getProductLabel().getText();
			Assertions.assertEquals("Sauce Labs Backpack", label);
			//Report.log(Status.PASS, "Produto selecionado corretamente: " + label );
			Report.log(Status.PASS, "Produto carregado " , Screenshot.captureBase64(driver) );
			Report.log(Status.INFO, "O produto selecionado foi : " + label);
		
		}catch(Exception e) {
			
			Report.log(Status.FAIL, e.getMessage(), Screenshot.captureBase64(driver));
		}
	}
	
	public void validationPageCheckout() {
		
		wait.loadElement(genericPage.getHomeTextSpan());
		String label = genericPage.getHomeTextSpan().getText();
		Assertions.assertEquals("CHECKOUT: YOUR INFORMATION", label);
		
	}
	
	public void validationPageCheckoutOverview() {
		
		wait.loadElement(genericPage.getHomeTextSpan());
		String label = genericPage.getHomeTextSpan().getText();
		Assertions.assertEquals("CHECKOUT: OVERVIEW", label);
		
	}
	
	public void validationPageFinish() {
		
		wait.loadElement(genericPage.getHomeTextSpan());
		String label = genericPage.getHomeTextSpan().getText();
		Assertions.assertEquals("CHECKOUT: COMPLETE!", label);
		
	}
	
	
	

}
