package Validations;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.Status;

import PageObjects.MenuPage;
import framework.Report.Report;
import framework.Report.Screenshot;

public class ValidaMenu {
	private WebDriver driver;
	private MenuPage menuPage;

	public ValidaMenu(WebDriver driver) {
		this.driver = driver;
		menuPage = new MenuPage(this.driver);
	}

	public void validaMenu() {
		try {
			
			Assertions.assertTrue(menuPage.getValidaTexto().isDisplayed());
			Report.log(Status.PASS, "Validação Menu com sucesso! " , Screenshot.captureBase64(driver));
		} catch (Exception e) {
			Report.log(Status.FAIL, "Validação Menu ERRO!! "+e, Screenshot.captureBase64(driver));
		}
	}
	
	
	
}
