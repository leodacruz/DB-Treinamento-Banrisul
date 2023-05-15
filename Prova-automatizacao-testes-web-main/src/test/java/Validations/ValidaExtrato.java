package Validations;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.Status;

import PageObjects.ExtratoPage;
import framework.Report.Report;
import framework.Report.Screenshot;

public class ValidaExtrato {
	private WebDriver driver;
	private ExtratoPage extratoPage;

	public ValidaExtrato(WebDriver driver) {
		this.driver = driver;
		extratoPage= new ExtratoPage(this.driver);
	}
	
	public void validaExtrato() {
		try {
			String message = extratoPage.getSaldoDisponivelTexto().getText();
			Assertions.assertEquals("Saldo disponível", message);
			Report.log(Status.PASS, "Validação Extrato com sucesso! ", Screenshot.captureBase64(driver));
		} catch (Exception e) {
			Report.log(Status.FAIL, "Validação Extrato ERRO!!: "+e, Screenshot.captureBase64(driver));
		}
	}

}
