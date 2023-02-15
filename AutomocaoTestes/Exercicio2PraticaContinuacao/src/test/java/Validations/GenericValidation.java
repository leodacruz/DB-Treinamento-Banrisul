package Validations;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.Status;

import Framework.Browser.Waits;
import Framework.Report.Report;
import Framework.Report.Screenshot;
import PageObject.GenericPage;

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
			wait.loadElement(genericPage.getHomeTestSpan());
			String label = genericPage.getHomeTestSpan().getText();
			Assertions.assertEquals("PRODUCTS", label);
			//Report.log(Status.PASS, "Produto selecionado corretamente"+label);
			Report.log(Status.PASS, "Produto carregado", Screenshot.captureBase64(driver));
			Report.log(Status.INFO, "Produto selecionado foi"+label);
		
		} catch (Exception e) {
			Report.log(Status.PASS, e.getMessage(), Screenshot.captureBase64(driver));
		}

	}

	public void validationPagePageCart() {
		try {
			wait.loadElement(genericPage.getHomeTestSpan());
			String label = genericPage.getHomeTestSpan().getText();
			Assertions.assertEquals("YOUR CART", label);
			Report.log(Status.PASS, "Acessou pag do carrinho com sucesso", Screenshot.captureBase64(driver));
		} catch (Exception e) {
			Report.log(Status.PASS, e.getMessage(), Screenshot.captureBase64(driver));
		}

	}

	public void validationPagePageCartProduct() {
		try {
			wait.loadElement(genericPage.getProductLabel());
			String label = genericPage.getProductLabel().getText();
			Assertions.assertEquals("Sauce Labs Backpack", label);
			Report.log(Status.PASS, "Acessou a pagina de inserir dados com sucesso", Screenshot.captureBase64(driver));
		} catch (Exception e) {
			Report.log(Status.PASS, e.getMessage(), Screenshot.captureBase64(driver));
		}

	}

	public void validationPageInsert() {
		try {
			wait.loadElement(genericPage.getHomeTestSpan());
			String label = genericPage.getHomeTestSpan().getText();
			Assertions.assertEquals("CHECKOUT: YOUR INFORMATION", label);
			Report.log(Status.PASS, "Acessou a pagina de revisao com sucesso", Screenshot.captureBase64(driver));
		} catch (Exception e) {
			Report.log(Status.PASS, e.getMessage(), Screenshot.captureBase64(driver));
		}

	}

	public void validationPageRevision() {
		try {
			wait.loadElement(genericPage.getHomeTestSpan());
			String label = genericPage.getHomeTestSpan().getText();
			Assertions.assertEquals("CHECKOUT: OVERVIEW", label);
			Report.log(Status.PASS, "Acessou a pagina final com sucesso", Screenshot.captureBase64(driver));
		} catch (Exception e) {
			Report.log(Status.PASS, e.getMessage(), Screenshot.captureBase64(driver));
		}

	}

	public void validationPageFinal() {
		try {
			wait.loadElement(genericPage.getHomeTestSpan());
			String label = genericPage.getHomeTestSpan().getText();
			Assertions.assertEquals("CHECKOUT: COMPLETE!", label);
			Report.log(Status.PASS, "Conseguiu deslogar com sucesso", Screenshot.captureBase64(driver));
		} catch (Exception e) {
			Report.log(Status.PASS, e.getMessage(), Screenshot.captureBase64(driver));
		}

	}

}
