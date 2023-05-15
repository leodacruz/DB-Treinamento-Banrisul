package Validations;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.Status;

import PageObjects.TransferenciaPage;
import framework.Report.Report;
import framework.Report.Screenshot;

public class ValidaTransferencia {
	private WebDriver driver;
	private TransferenciaPage transferenciaPage;

	public ValidaTransferencia(WebDriver driver) {
		this.driver = driver;
		transferenciaPage = new TransferenciaPage(this.driver);
	}

	public void validaTransferencia() {
		try {
			Assertions.assertTrue(transferenciaPage.getValidaTexto().isDisplayed());
			Report.log(Status.PASS, "Validação Transferencia com sucesso! ", Screenshot.captureBase64(driver));
		} catch (Exception e) {
			Report.log(Status.FAIL, "Validação Transferencia ERRO!!:" + e, Screenshot.captureBase64(driver));
		}
	}

	public void validaNumeroContaInputs() {
		try {
			String message = transferenciaPage.getNumeroContaInput().getText();
			Assertions.assertNotEquals(" ", message);
			Report.log(Status.PASS, "Numero da Conta inserido com sucesso! ", Screenshot.captureBase64(driver));
		} catch (Exception e) {
			Report.log(Status.FAIL, "Numero da Conta nao inserido: " + e, Screenshot.captureBase64(driver));
		}
	}

	public void validaDigitoContaInputs() {
		try {
			String message = transferenciaPage.getDigitoContaInput().getText();
			Assertions.assertNotEquals(" ", message);
			Report.log(Status.PASS, "Digito da Conta inserido com sucesso! ", Screenshot.captureBase64(driver));
		} catch (Exception e) {
			Report.log(Status.FAIL, "Digito da Conta nao inserido: " + e, Screenshot.captureBase64(driver));
		}
	}

	public void validaValorTransferenciaInputs() {
		try {
			String message = transferenciaPage.getValorTransferenciaInput().getText();
			Assertions.assertNotEquals(" ", message);
			Report.log(Status.PASS, "Senha inserido com sucesso! ", Screenshot.captureBase64(driver));
		} catch (Exception e) {
			Report.log(Status.FAIL, "Senha nao inserido: " + e, Screenshot.captureBase64(driver));
		}
	}

	public void validaDescricaoInputs() {
		try {
			String message = transferenciaPage.getDescricaoInput().getText();
			Assertions.assertNotEquals(" ", message);
			Report.log(Status.PASS, "Confirma Senha inserido com sucesso! ", Screenshot.captureBase64(driver));
		} catch (Exception e) {
			Report.log(Status.FAIL, "Confirma Senha nao inserido: " + e, Screenshot.captureBase64(driver));
		}
	}

	public void validaTransferenciaAlert() {
		try {
			Assertions.assertTrue(transferenciaPage.getTextoAlert().isDisplayed());
			Report.log(Status.PASS, "Transferencia ocorrida com sucesso! ", Screenshot.captureBase64(driver));
		} catch (Exception e) {
			Report.log(Status.FAIL, "Confirma Senha nao inserido: " + e, Screenshot.captureBase64(driver));
		}
	}

}
